package Controller;

import javax.swing.JFrame;

import Model.Compteur;
import Model.Passerelle;
import View.GlobalPane;
import View.MainFrame;

public class Application { 
	/**
	 * @param args
	 * Lanceur de l'application.
	 * TODO : Instancier la JFrame principale , et tous les displays contenus dans la JFrame (Display client, LED )
	 * JFrame setVisible(true)
	 */
	
	
	// Pour l'instant : Maquette en mode console
	public static void main(String[] args) {
		
//    Petite maquette..
		
//		System.out.println("Maquette SmartGateway");
//		System.out.println("Création d'une passerelle de test...");
//		System.out.println();
//		Passerelle gateway = new Passerelle();
//		System.out.println("La passerelle regroupe 10 compteurs");
//		System.out.println();
//		
//		for(int i=0;i<10;i++){
//			gateway.ajouterCompteur(new Compteur());
//		}
//		
//		System.out.println("Energie consommée par tous les compteurs :"+gateway.getTotalConsumption()+"KWh");
//		System.out.println();
//		System.out.println("Résumé compteur par compteur : ");
//		System.out.println();
//		System.out.println(gateway.getResumeParCompteur());
		
		GlobalPane gp = new GlobalPane();
		MainFrame fen = new MainFrame(gp);
		fen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fen.pack();
		fen.setVisible(true);
	}

}
