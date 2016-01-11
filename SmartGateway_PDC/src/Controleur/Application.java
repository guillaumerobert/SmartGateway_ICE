package Controleur;

import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UIManager.*;

import Modele.Compteur;
import Modele.FournisseurEnergie;
import Modele.Passerelle;
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
		
		Passerelle gateway = new Passerelle();
		FournisseurEnergie edf = new FournisseurEnergie("EDF", 0.25);
		
		for(int i=0;i<10;i++){
			gateway.ajouterCompteur(new Compteur());
		}
		
		ControleurLED ctrlLED = new ControleurLED();
		ControleurFournisseur ctrlFournisseur = new ControleurFournisseur(edf);
		ControleurDisplay ctrlDisplay = new ControleurDisplay(gateway);
		//RRC rrc = new RRC();
		
		GlobalPane gp = new GlobalPane(ctrlDisplay, ctrlLED);
		MainFrame fen = new MainFrame(ctrlFournisseur);
		
		fen.setContentPane(gp);
		fen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fen.pack();
		fen.repaint();
		fen.setVisible(true);
	}

}
