package Persistance;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import Modele.Administrateur;
import Modele.Compteur;
import Modele.Consommateur;
import Modele.FournisseurEnergie;

public class Persistance{
	
	private File saveCompteurs;
	private File saveConsommateurs;
	private File saveFournisseurs;
	private File saveAdmins;

	private ObjectOutputStream oosSaveFournisseurs;
	private ObjectOutputStream oosSaveCompteur;
	private ObjectOutputStream oosSaveConsommateurs;
	private ObjectOutputStream oosSaveAdmins;
 
	private ObjectInputStream oisSaveConsomamteurs;
	private ObjectInputStream oisSaveFournisseurs;
	private ObjectInputStream oisSaveCompteur;
	private ObjectInputStream oisSaveAdmins;
	
	public Persistance() throws FileNotFoundException, IOException{
		
		this.saveAdmins = new File("C:/Users/Guillaume Robert/git/SmartGatewayICE_/SmartGateway_PDC/src/Persistance/SaveAdmins");
		this.saveCompteurs = new File("C:/Users/Guillaume Robert/git/SmartGatewayICE_/SmartGateway_PDC/src/Persistance/SaveCompteur"); 
		this.saveConsommateurs = new File("C:/Users/Guillaume Robert/git/SmartGatewayICE_/SmartGateway_PDC/src/Persistance/SaveConsommateur");
		this.saveFournisseurs = new File("C:/Users/Guillaume Robert/git/SmartGatewayICE_/SmartGateway_PDC/src/Persistance/SaveFournisseur"); 
		
		this.oosSaveAdmins = new ObjectOutputStream(new FileOutputStream(saveAdmins)) ;
		this.oisSaveAdmins = new ObjectInputStream(new FileInputStream(saveAdmins)) ;
		
		this.oosSaveFournisseurs = new ObjectOutputStream(new FileOutputStream(saveFournisseurs)) ;
		this.oisSaveFournisseurs = new ObjectInputStream(new FileInputStream(saveFournisseurs)) ;

		this.oosSaveCompteur =  new ObjectOutputStream(new FileOutputStream(saveCompteurs)) ;
		this.oisSaveCompteur =  new ObjectInputStream(new FileInputStream(saveCompteurs)) ;

		this.oosSaveConsommateurs =  new ObjectOutputStream(new FileOutputStream(saveConsommateurs)) ;
		this.oisSaveConsomamteurs =  new ObjectInputStream(new FileInputStream(saveConsommateurs)) ;

	}


	public void saveCompteur(Compteur c) throws IOException{
		oosSaveCompteur.writeObject(c) ;
		oosSaveCompteur.close();
	}

	public void saveFournisseur(FournisseurEnergie f) throws IOException{
		oosSaveFournisseurs.writeObject(f);
		oosSaveFournisseurs.close();
	}
	
	public void saveConsommateur(Consommateur c) throws IOException{
		oosSaveConsommateurs.writeObject(c) ;
		oosSaveConsommateurs.close();
	}
	
	public void saveAdministrateur(Administrateur a) throws IOException{
		oosSaveAdmins.writeObject(a) ;
		oosSaveAdmins.close();
	}

	public ArrayList<Compteur> getAllCompteurs() throws ClassNotFoundException, IOException{
		
		ArrayList<Compteur> liste = new ArrayList<Compteur>();
		
	    while(true){
	        try{
	        	liste.add((Compteur) oisSaveCompteur.readObject());
	        } catch (EOFException e){break;};
	    }
	    
	    oisSaveCompteur.close();
			
		return liste;
	}
	
	public ArrayList<FournisseurEnergie> getAllFournisseurs() throws ClassNotFoundException, IOException{
		
		ArrayList<FournisseurEnergie> liste = new ArrayList<FournisseurEnergie>();
		
	    while(true){
	        try{
	        	liste.add((FournisseurEnergie) oisSaveFournisseurs.readObject());
	        } catch (EOFException e){break;};
	    }
	    
	    oisSaveFournisseurs.close();
			
		return liste;
	}
	
	public ArrayList<Administrateur> getAllAdmins() throws ClassNotFoundException, IOException{
		
		ArrayList<Administrateur> liste = new ArrayList<Administrateur>();
		
	    while(true){
	        try{
	        	liste.add((Administrateur) oisSaveAdmins.readObject());
	        } catch (EOFException e){break;};
	    }
	    
	    oisSaveAdmins.close();
			
		return liste;
	}
	
	public Compteur getCompteur(int pNumCompteur) throws ClassNotFoundException, IOException{
		
		while(true){
	        try{
	        	Compteur cptTemp = (Compteur)oisSaveCompteur.readObject();
	        	if(cptTemp.getNumeroCompteur() == pNumCompteur){
	        		oisSaveCompteur.close();
	        		return cptTemp;
	        	}
	        } catch (EOFException e){break;};
	    }
	    
	    oisSaveCompteur.close();
	    return null;
	}
	
	public Consommateur getConsommateur(String pLogin) throws ClassNotFoundException, IOException{
		
		while(true){
	        try{
	        	Consommateur consoTemp = (Consommateur)oisSaveConsomamteurs.readObject();
	        	if(consoTemp.getLogin().equals(pLogin)){
	        		oisSaveConsomamteurs.close();
	        		return consoTemp;
	        	}
	        } catch (EOFException e){break;};
	    }
	    
		oisSaveConsomamteurs.close();
	    return null;
	}

}