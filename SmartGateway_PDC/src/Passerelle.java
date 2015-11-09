import java.awt.List;
import java.util.ArrayList;

/**
 * 
 * @author Grobert
 * Classe Passerelle
 * La passerelle regroupe l'ensemble des compteurs intelligents connus 
 * Elle gére les compteurs et fournit de smethodes d'accession variées 
 *
 */
public class Passerelle {
	
	private ArrayList<Compteur> compteurs;
	
	public Passerelle(){
		this.compteurs = new ArrayList<Compteur>();
	}
	
	/**
	 * 
	 * @param Compteur
	 * Ajoute un compteur a la passerelle
	 */
	public void ajouterCompteur(Compteur c){
		this.compteurs.add(c);
	}
	
	
	/**
	 * 
	 * @return Double : Le total des consos de tous les compteurs connus de la passerelle 
	 */
	public double getTotalConsumption(){
		
		double total = 0;
		for(Compteur cpt : this.compteurs){
			total += (cpt.getHcConsumption() + cpt.getHpConsumption());
		}
		return total;
		
	}
	
	

}
