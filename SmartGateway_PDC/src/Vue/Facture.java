/*********************************************************************
	Rhapsody	: 8.1.3
	Login		: Guillaume Robert
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: Facture
//!	Generated Date	: Mon, 11, Jan 2016 
	File Path	: DefaultComponent/DefaultConfig/Vue/Facture.java
*********************************************************************/

package Vue;

//## link itsControleurFournisseur 
import Controleur.ControleurFournisseur;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.util.Random;

import javax.swing.JLabel;
import javax.swing.JPanel;

//----------------------------------------------------------------------------
// Vue/Facture.java                                                                  
//----------------------------------------------------------------------------

//## package Vue 


//## class Facture 
public class Facture extends JPanel {
    
    protected ControleurFournisseur itsControleurFournisseur;		//## link itsControleurFournisseur 
    
	private JLabel titre,nomCli,conso,compteur,releveHC,releveHP,releveTotal,coutUnitaire,totalTTC,aReglerAvant;
	private JPanel corpsFacture;
	
    // Constructors
    
	/** JPanel représentatif d'une facture
	 * Utilise le controleur fournisseur pour avoir accés a toutes les données necessaires pour établir la facture **/
	public Facture(/*ControleurFournisseur pcf*/){
		//this.cf = pcf; // Classe a faire
		this.setLayout(new BorderLayout());
		
		Random randomGenerator = new Random();
		int numFact = randomGenerator.nextInt(100000);
		titre = new JLabel("Votre facture n° "+Integer.toString(numFact));
		titre.setFont(new Font("Arial",Font.BOLD,25));
		
		corpsFacture = new JPanel();
		corpsFacture.setLayout(new GridLayout(9,1));
		
		// TODO : Appels depuis le controleurFournisseur
		nomCli = new JLabel("M. ou Mme "); 
		conso = new JLabel("Votre consommation au DATE DU JOUR");
		compteur = new JLabel("Compteur numéro Num compteur");
		releveHC = new JLabel("Heures Creuses : Conso HC");
		releveHP = new JLabel("Heures Pleines : Conso HP");
		releveTotal = new JLabel("Total : TOTAL");
		coutUnitaire = new JLabel("Cout unitaire TTC du kw/h : x €");
		totalTTC = new JLabel("Total TTC : x €");
		aReglerAvant = new JLabel("A régler avant une date limite sinon ça va barder");
		
		corpsFacture.add(nomCli);
		corpsFacture.add(conso);
		corpsFacture.add(compteur);
		corpsFacture.add(releveHC);
		corpsFacture.add(releveHP);
		corpsFacture.add(releveTotal);
		corpsFacture.add(coutUnitaire);
		corpsFacture.add(totalTTC);
		corpsFacture.add(aReglerAvant);
		
		this.add(titre,BorderLayout.NORTH);
		this.add(corpsFacture, BorderLayout.CENTER);

	}
    
    //## auto_generated 
    public ControleurFournisseur getItsControleurFournisseur() {
        return itsControleurFournisseur;
    }
    
    //## auto_generated 
    public void setItsControleurFournisseur(ControleurFournisseur p_ControleurFournisseur) {
        itsControleurFournisseur = p_ControleurFournisseur;
    }
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/Vue/Facture.java
*********************************************************************/

