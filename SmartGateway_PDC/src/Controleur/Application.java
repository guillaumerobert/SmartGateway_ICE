package Controleur;

import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UIManager.*;

import Modele.Compteur;
import Modele.Consommateur;
import Modele.FournisseurEnergie;
import Modele.Passerelle;
import Modele.RRCModel;
import Vue.GlobalPane;
import Vue.MainFrame;

public class Application { 
	/**
	 * @param args
	 * Lanceur de l'application.
	 * TODO : Instancier la JFrame principale , et tous les displays contenus dans la JFrame (Display client, LED )
	 * JFrame setVisible(true)
	 */
	
	
	public static void main(String[] args) {
		
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
		
		gateway.ajouterCompteur(new Compteur(new Consommateur("Billy", "Joe", "bjo", "bjoe", "3 avenue de paris", edf, 0)));
		gateway.ajouterCompteur(new Compteur(new Consommateur("Jackie", "Museau", "jmu", "jmu", "1 avenue de lisbonne", veolia, 1)));
		gateway.ajouterCompteur(new Compteur(new Consommateur("Bertrand", "Pet", "bpe", "bpet", "5 avenue de madrid", edf, 1)));
		gateway.ajouterCompteur(new Compteur(new Consommateur("Sarah", "Meuh", "sme", "sme", "5 route de lune", veolia, 0)));
		gateway.ajouterCompteur(new Compteur(new Consommateur("Patrick", "Vinasse", "pvi", "pvi", "12 av de mars", veolia, 0)));
		
		ControleurLED ctrlLED = new ControleurLED();
		ControleurFournisseur ctrlFournisseur = new ControleurFournisseur(edf);
		ControleurDisplay ctrlDisplay = new ControleurDisplay(gateway);
		RRC rrc = new RRC(rrcm); // classe RRC a regénérer selon v3
		
		GlobalPane gp = new GlobalPane(ctrlDisplay, ctrlLED);
		MainFrame fen = new MainFrame(rrc, ctrlFournisseur, gateway);
		
		fen.setContentPane(gp);
		fen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fen.pack();
		fen.repaint();
		fen.setVisible(true);
	}

}
