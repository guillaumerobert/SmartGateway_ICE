/*********************************************************************
	Rhapsody	: 8.1.3
	Login		: Guillaume Robert
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: ControleLogin
//!	Generated Date	: Fri, 15, Jan 2016 
	File Path	: DefaultComponent/DefaultConfig/Controleur/ControleLogin.java
*********************************************************************/

package Controleur;

import java.util.ArrayList;

import javax.swing.JFrame;

import Modele.Administrateur;
import Modele.Consommateur;
import Modele.Passerelle;
import Modele.Utilisateur;
import Vue.GlobalPane;
import Vue.MainFrame;
import Vue.VueConsommateur;

//----------------------------------------------------------------------------
// Controleur/ControleLogin.java                                                                  
//----------------------------------------------------------------------------

//## package Controleur 


//## class ControleLogin 
public class ControleLogin {
    
    //protected Utilisateur itsUtilisateur;		//## link itsUtilisateur 
    
    protected ArrayList<Utilisateur> utilisateurs = new ArrayList<>();		//## link Utilisateur 
    
    
    // Constructors
    
    //## auto_generated 
    public  ControleLogin(ArrayList<Utilisateur> pUsers) {
    	utilisateurs = pUsers;
    }
    
    //## auto_generated 
    /*public Utilisateur getItsUtilisateur() {
        return itsUtilisateur;
    }
    
    //## auto_generated 
    public void setItsUtilisateur(Utilisateur p_Utilisateur) {
        itsUtilisateur = p_Utilisateur;
    }*/
    
    // AJOUT
    public Utilisateur login(String _pLog, String _pPass) {
    	Utilisateur uNOK = null;
    	
		for (Utilisateur uOK : utilisateurs) {
			if ((uOK.getLogin().equals(_pLog)) && (uOK.getMdp().equals(_pPass)))
				return uOK;	
		}
    	
		return uNOK;
    }
    
    // AJOUT
    public void gererAuthentification(Utilisateur logger, RRC rrc, ControleurDisplay ctrlDisplay, ControleurLED ctrlLED, ControleurFournisseur ctrlFournisseur, Passerelle gateway) {
    	
    	if (logger != null) {
    		
    		System.out.println("Utilisateur existe !");
    		
    		if (logger instanceof Consommateur) {
    			Consommateur conso = (Consommateur) logger;
	    		VueConsommateur fenConso = new VueConsommateur(conso, rrc.getItsRRCModel().getDonneesDuCompteurParMois(conso.getItsCompteur().getNumeroCompteur()));
    			
    			fenConso.draw();
	    		fenConso.setVisible(true);
	    		fenConso.pack();
    		} else if (logger instanceof Administrateur) {
    			
    			GlobalPane gp = new GlobalPane(ctrlDisplay, ctrlLED);
    			MainFrame fen = new MainFrame(rrc, ctrlFournisseur, gateway);
    			
    			fen.setContentPane(gp);
    			fen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    			fen.pack();
    			fen.repaint();
    			fen.setVisible(true);
    		}
    	} else {
    		System.err.println("N existe pas");
    	}
    }
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/Controleur/ControleLogin.java
*********************************************************************/

