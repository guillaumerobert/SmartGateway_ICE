package Controleur;

import java.util.ArrayList;

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
		
		RRCModel rrcm = new RRCModel();
		Passerelle gateway = new Passerelle(rrcm);
		
		FournisseurEnergie edf = new FournisseurEnergie("EDF", 0.25);
		FournisseurEnergie veolia = new FournisseurEnergie("VEOLIA", 0.32);
		
		Consommateur c1 = new Consommateur("Billy", "Joe", "bjo", "bjo", "3 avenue de paris", edf, 0);
		Consommateur c2 = new Consommateur("Jackie", "Museau", "jmu", "jmu", "1 avenue de lisbonne", veolia, 1);
		Consommateur c3 = new Consommateur("Bertrand", "Pet", "bpe", "bpe", "5 avenue de madrid", edf, 1);
		Consommateur c4 = new Consommateur("Sarah", "Meuh", "sme", "sme", "5 route de lune", veolia, 0);
		Consommateur c5 = new Consommateur("Patrick", "Vinasse", "pvi", "pvi", "12 av de mars", veolia, 0);
		
		Compteur cpt1 = new Compteur(c1);
		Compteur cpt2 = new Compteur(c2);
		Compteur cpt3 = new Compteur(c3);
		Compteur cpt4 = new Compteur(c4);
		Compteur cpt5 = new Compteur(c5);
		
		utilisateurs.add(c1);
		utilisateurs.add(c2);
		utilisateurs.add(c3);
		utilisateurs.add(c4);
		utilisateurs.add(c5);
		
		//utilisateurs.add(edf);
		//utilisateurs.add(veolia);
		
		gateway.ajouterCompteur(cpt1);
		gateway.ajouterCompteur(cpt2);
		gateway.ajouterCompteur(cpt3);
		gateway.ajouterCompteur(cpt4);
		gateway.ajouterCompteur(cpt5);
		
		ControleurLED ctrlLED = new ControleurLED();
		ControleLogin ctrlLog = new ControleLogin(utilisateurs);	
		ControleurFournisseur ctrlFournisseur = new ControleurFournisseur(edf);
		ControleurDisplay ctrlDisplay = new ControleurDisplay(gateway);
		RRC rrc = new RRC(rrcm); // classe RRC a regénérer selon v3
		
		/*GlobalPane gp = new GlobalPane(ctrlDisplay, ctrlLED);
		MainFrame fen = new MainFrame(rrc, ctrlFournisseur, gateway);
		
		fen.setContentPane(gp);
		fen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fen.pack();
		fen.repaint();
		fen.setVisible(true);*/
		
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
		
		VueLogin fenLog = new VueLogin(ctrlLog);
		fenLog.setVisible(true);
	}

}
