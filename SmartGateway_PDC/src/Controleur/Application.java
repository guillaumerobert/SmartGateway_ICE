package Controleur;

import javax.swing.JFrame;

import Modele.Compteur;
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
		
		Passerelle gateway = new Passerelle();
		for(int i=0;i<10;i++){
			gateway.ajouterCompteur(new Compteur());
		}
		
		ControleurPasserelle ctrlPass = new ControleurPasserelle(gateway); 

		GlobalPane gp = new GlobalPane(ctrlPass);
		MainFrame fen = new MainFrame(gp);
		fen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fen.pack();
		fen.setVisible(true);
	}

}
