/*********************************************************************
	Rhapsody	: 8.1.3
	Login		: Guillaume Robert
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: VueCompteur
//!	Generated Date	: Fri, 15, Jan 2016 
	File Path	: DefaultComponent/DefaultConfig/Vue/VueCompteur.java
*********************************************************************/

package Vue;

import javax.swing.JFrame;

//## link itsControleurDisplay 
import Controleur.ControleurDisplay;
import Modele.Compteur;

import javax.swing.JLabel;
import java.awt.Font;

//----------------------------------------------------------------------------
// Vue/VueCompteur.java                                                                  
//----------------------------------------------------------------------------

//## package Vue 


//## class VueCompteur 
public class VueCompteur extends JFrame {
    
    protected ControleurDisplay itsControleurDisplay;		//## link itsControleurDisplay
    
    private JLabel labelConsommationHeuresCreuses;
    
    private JLabel numero;
    private JLabel consoHeuresCreuses;
    private JLabel labelConsommationHeuresPleines;
    private JLabel labelCompteurN;
    private JLabel consoHeuresPleines;
    
    private String numCompteur;
    private String consHeuresCreuses;
    private String consHeuresPleines;
    
    private Compteur compteur;
    
    // Constructors
    
    //## auto_generated 
    public  VueCompteur(Compteur pCompteur) 
    {
    	
    	compteur = pCompteur;
    	
    	this.setLayout(null);
    	this.setTitle(compteur.getItsConsommateur().getNom());
    	
    	numCompteur = String.valueOf(compteur.getNumeroCompteur());
    	consHeuresCreuses = String.valueOf(compteur.getConsoHeuresCreuses());
    	consHeuresPleines = String.valueOf(compteur.getConsoHeuresPleines());
    	
    	labelConsommationHeuresCreuses = new JLabel("Consommation heures creuses");
    	labelConsommationHeuresCreuses.setFont(new Font("Arial", Font.PLAIN, 15));
    	labelConsommationHeuresCreuses.setBounds(10, 59, 212, 31);
    	this.add(labelConsommationHeuresCreuses);
    	
    	numero = new JLabel(numCompteur);
    	numero.setBounds(232, 23, 46, 14);
    	this.add(numero);
    	
    	consoHeuresCreuses = new JLabel(consHeuresCreuses);
    	consoHeuresCreuses.setBounds(232, 68, 46, 14);
    	this.add(consoHeuresCreuses);
    	
    	labelConsommationHeuresPleines = new JLabel("Consommation heures pleines");
    	labelConsommationHeuresPleines.setFont(new Font("Arial", Font.PLAIN, 15));
    	labelConsommationHeuresPleines.setBounds(10, 101, 212, 31);
    	this.add(labelConsommationHeuresPleines);
    	
    	labelCompteurN = new JLabel("Compteur N\u00B0");
    	labelCompteurN.setFont(new Font("Arial", Font.PLAIN, 22));
    	labelCompteurN.setBounds(90, 11, 132, 31);
    	this.add(labelCompteurN);
    	
    	consoHeuresPleines = new JLabel(consHeuresPleines);
    	consoHeuresPleines.setBounds(232, 110, 46, 14);
    	this.add(consoHeuresPleines);
    	
    	
    }
    
    //## auto_generated 
    public ControleurDisplay getItsControleurDisplay() {
        return itsControleurDisplay;
    }
    
    //## auto_generated 
    public void setItsControleurDisplay(ControleurDisplay p_ControleurDisplay) {
        itsControleurDisplay = p_ControleurDisplay;
    }
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/Vue/VueCompteur.java
*********************************************************************/

