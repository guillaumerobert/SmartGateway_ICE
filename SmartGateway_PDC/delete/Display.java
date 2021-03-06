/*********************************************************************
	Rhapsody	: 8.1.3
	Login		: Guillaume Robert
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: Display
//!	Generated Date	: Wed, 6, Jan 2016 
	File Path	: DefaultComponent/DefaultConfig/Vue/Display.java
*********************************************************************/

package Vue;


import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

//## link itsControleurPasserelle 
import Controleur.ControleurPasserelle;

//----------------------------------------------------------------------------
// Vue/Display.java                                                                  
//----------------------------------------------------------------------------

//## package Vue 


//## class Display 
public class Display extends JPanel {
    
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected ControleurPasserelle itsControleurPasserelle;		//## link itsControleurPasserelle 
   
    private JLabel titreDisplay;
    private JScrollPane sp;
    private JTextArea affichageListeCompteurs;
    
    // Constructors
    
    //## operation Display() 
    public  Display(ControleurPasserelle ctrlPass) {
    	itsControleurPasserelle=ctrlPass;
    	this.setLayout(new BoxLayout(this,BoxLayout.PAGE_AXIS));
    	this.setPreferredSize(new Dimension(800,400));
    	titreDisplay = new JLabel("<html><body><h2 style=' color: orange; "
    			+ "font-family: 'Raleway',sans-serif; "
    			+ "font-size: 62px; font-weight: 800; "
    			+ "line-height: 72px; margin: 0 0 24px; "
    			+ "text-align: center; "
    			+ "text-transform: uppercase;"
    			+ "' >Display</h2></body></html>");
    	add(titreDisplay);
    	afficherConso();
    }
    
    //## operation afficherConso() 
    public void afficherConso() {
    	affichageListeCompteurs = new JTextArea(this.itsControleurPasserelle.getItsPasserelle().getResumeParCompteur());
    	affichageListeCompteurs.setForeground(Color.green);
    	affichageListeCompteurs.setOpaque(true);
    	affichageListeCompteurs.setBackground(Color.black);
    	affichageListeCompteurs.setLineWrap(true);
    	affichageListeCompteurs.setWrapStyleWord(true);
    	affichageListeCompteurs.setOpaque(false);
    	affichageListeCompteurs.setEditable(false);
    	sp = new JScrollPane(affichageListeCompteurs);
    	add(sp);
    }
    
    //## auto_generated 
    public ControleurPasserelle getItsControleurPasserelle() {
        return itsControleurPasserelle;
    }
    
    //## auto_generated 
    public void __setItsControleurPasserelle(ControleurPasserelle p_ControleurPasserelle) {
        itsControleurPasserelle = p_ControleurPasserelle;
    }
    
    //## auto_generated 
    public void _setItsControleurPasserelle(ControleurPasserelle p_ControleurPasserelle) {
        if(itsControleurPasserelle != null)
            {
                itsControleurPasserelle.__setItsDisplay(null);
            }
        __setItsControleurPasserelle(p_ControleurPasserelle);
    }
    
    //## auto_generated 
    public void setItsControleurPasserelle(ControleurPasserelle p_ControleurPasserelle) {
        if(p_ControleurPasserelle != null)
            {
                p_ControleurPasserelle._setItsDisplay(this);
            }
        _setItsControleurPasserelle(p_ControleurPasserelle);
    }
    
    //## auto_generated 
    public void _clearItsControleurPasserelle() {
        itsControleurPasserelle = null;
    }
        
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/Vue/Display.java
*********************************************************************/

