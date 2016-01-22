package Controleur;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

import javax.swing.UIManager;
import javax.swing.UIManager.*;

import Modele.Compteur;
import Modele.Consommateur;
import Modele.FournisseurEnergie;
import Modele.Passerelle;
import Modele.RRCModel;
import Modele.Utilisateur;
import Vue.GlobalPane;
import Vue.MainFrame;
import Vue.VueCompteur;
import Vue.VueConsommateur;
import Vue.VueLogin;

public class Application { 
	/**
	 * @param args
	 * Lanceur de l'application.
	 * TODO : Instancier la JFrame principale , et tous les displays contenus dans la JFrame (Display client, LED )
	 * JFrame setVisible(true)
	 */
	
	
	public static void main(String[] args) {
		
		ArrayList<Utilisateur> utilisateurs = new ArrayList<>();
		
		try {
		    for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
		        if ("Nimbus".equals(info.getName())) {
		            UIManager.setLookAndFeel(info.getClassName());
		            break;
		        }
		    }
		} catch (Exception e) {
		    System.out.println("LookAndFeel indisponible !");
		}
		
		
		RRC rrc = new RRC(new RRCModel()); // classe RRC a regénérer selon v3
		Passerelle gateway = new Passerelle(rrc.getItsRRCModel());
		
		FournisseurEnergie edf = new FournisseurEnergie("EDF", 0.25);
		FournisseurEnergie veolia = new FournisseurEnergie("VEOLIA", 0.32);
		
		//Administrateur admin = new Administrateur();
		
		Consommateur conso1 = new Consommateur("Billy", "Joe", "bjo", "bjo", "3 avenue de paris", edf, 0);
		Consommateur conso2 = new Consommateur("Jackie", "Museau", "jmu", "jmu", "1 avenue de lisbonne", veolia, 1);
		Consommateur conso3 = new Consommateur("Bertrand", "Pet", "bpe", "bpe", "5 avenue de madrid", edf, 1);
		Consommateur conso4 = new Consommateur("Sarah", "Meuh", "sme", "sme", "5 route de lune", veolia, 0);
		Consommateur conso5 = new Consommateur("Patrick", "Vinasse", "pvi", "pvi", "12 av de mars", veolia, 0);
		
		Compteur cpt1 = new Compteur(conso1);
		Compteur cpt2 = new Compteur(conso2);
		Compteur cpt3 = new Compteur(conso3);
		Compteur cpt4 = new Compteur(conso4);
		Compteur cpt5 = new Compteur(conso5);
		
		conso1.__setItsCompteur(cpt1);
		conso2.__setItsCompteur(cpt2);
		conso3.__setItsCompteur(cpt3);
		conso4.__setItsCompteur(cpt4);
		conso5.__setItsCompteur(cpt5);
		
		utilisateurs.add(conso1);
		utilisateurs.add(conso2);
		utilisateurs.add(conso3);
		utilisateurs.add(conso4);
		utilisateurs.add(conso5);
		
		//utilisateurs.add(edf);
		//utilisateurs.add(veolia);
		
		gateway.ajouterCompteur(cpt1);
		gateway.ajouterCompteur(cpt2);
		gateway.ajouterCompteur(cpt3);
		gateway.ajouterCompteur(cpt4);
		gateway.ajouterCompteur(cpt5);
		
		VueCompteur frameCpt1 = new VueCompteur(cpt1);
		VueCompteur frameCpt2 = new VueCompteur(cpt2);
		VueCompteur frameCpt3 = new VueCompteur(cpt3);
		VueCompteur frameCpt4 = new VueCompteur(cpt4);
		VueCompteur frameCpt5 = new VueCompteur(cpt5);
		
		frameCpt1.setVisible(true);
		frameCpt1.setLocation(0, 0);
		
		frameCpt2.setVisible(true);
		frameCpt2.setLocation(0, 200);

		frameCpt3.setVisible(true);
		frameCpt3.setLocation(0, 400);

		frameCpt4.setVisible(true);
		frameCpt4.setLocation(0, 600);
		
		frameCpt5.setVisible(true);
		frameCpt5.setLocation(0, 800);
		
		
		ListIterator<Compteur> it;
		Compteur cpt;
		
		
		for (int i = 1; i < 13; i++) { // on simule qu on save tous les mois
			
			LinkedList<Compteur> cpts = new LinkedList<>();
			it = gateway.getCompteurs();
			
			while (it.hasNext()) {
				cpt = it.next();
				cpt.consommer();
				cpts.add(cpt);
			}
			
			gateway.setCompteurs(cpts);
			rrc.transmettreDonnees(gateway, i);
    	}
		
		ControleurLED ctrlLED = new ControleurLED();
		ControleLogin ctrlLog = new ControleLogin(utilisateurs);	
		ControleurFournisseur ctrlFournisseur = new ControleurFournisseur(edf);
		ControleurDisplay ctrlDisplay = new ControleurDisplay(gateway);
		
		VueLogin fenLog = new VueLogin(ctrlLog, rrc, ctrlDisplay, ctrlLED, ctrlFournisseur, gateway);
		fenLog.setVisible(true);
		
	}

}
