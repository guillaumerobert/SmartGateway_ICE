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
import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.Font;

//----------------------------------------------------------------------------
// Vue/VueCompteur.java                                                                  
//----------------------------------------------------------------------------

//## package Vue 


//## class VueCompteur 
public class VueCompteur extends JFrame {
    
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected ControleurDisplay itsControleurDisplay;		//## link itsControleurDisplay
	    
    private String numCompteur;
    private String consHeuresCreuses;
    private String consHeuresPleines;
    
    private Compteur compteur;
    private JPanel panel;
    private JLabel labelCompteur;
    private JLabel labelConsommationHeuresCreuses;
    private JLabel labelConsommationHeuresPleines;
    private JLabel numero;
    private JLabel heuresCreuses;
    private JLabel heuresPleines;

    
    // Constructors
    
    //## auto_generated 
    public  VueCompteur(Compteur pCompteur) 
    {
    	
    	compteur = pCompteur;
    	this.setTitle(compteur.getItsConsommateur().getNom());
    	
    	numCompteur = String.valueOf(compteur.getNumeroCompteur());
    	consHeuresCreuses = String.valueOf(compteur.getConsoHeuresCreuses());
    	consHeuresPleines = String.valueOf(compteur.getConsoHeuresPleines());
    	
    	this.setSize(399, 193);
    	
    	panel = new JPanel();
    	getContentPane().add(panel, BorderLayout.CENTER);
    	panel.setLayout(null);
    	
    	labelCompteur = new JLabel("Compteur N\u00B0");
    	labelCompteur.setFont(new Font("Arial", Font.PLAIN, 20));
    	labelCompteur.setBounds(96, 11, 113, 24);
    	panel.add(labelCompteur);
    	
    	labelConsommationHeuresCreuses = new JLabel("Consommation heures creuses");
    	labelConsommationHeuresCreuses.setFont(new Font("Arial", Font.BOLD, 13));
    	labelConsommationHeuresCreuses.setBounds(10, 59, 212, 24);
    	panel.add(labelConsommationHeuresCreuses);
    	
    	labelConsommationHeuresPleines = new JLabel("Consommation heures pleines");
    	labelConsommationHeuresPleines.setFont(new Font("Arial", Font.BOLD, 13));
    	labelConsommationHeuresPleines.setBounds(10, 94, 199, 24);
    	panel.add(labelConsommationHeuresPleines);
    	
    	numero = new JLabel(numCompteur);
    	numero.setBounds(219, 11, 121, 22);
    	numero.setFont(new Font("Arial", Font.PLAIN, 20));
    	panel.add(numero);
    	
    	heuresCreuses = new JLabel(consHeuresCreuses);
    	heuresCreuses.setBounds(232, 65, 108, 14);
    	heuresCreuses.setFont(new Font("Arial", Font.PLAIN, 15));
    	panel.add(heuresCreuses);
    	
    	heuresPleines = new JLabel(consHeuresPleines);
    	heuresPleines.setBounds(219, 100, 121, 14);
    	heuresPleines.setFont(new Font("Arial", Font.PLAIN, 15));
    	panel.add(heuresPleines);
    	
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

