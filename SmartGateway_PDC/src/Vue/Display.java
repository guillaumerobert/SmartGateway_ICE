/*********************************************************************
	Rhapsody	: 8.1.3
	Login		: Guillaume Robert
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: Display
//!	Generated Date	: Mon, 11, Jan 2016 
	File Path	: DefaultComponent/DefaultConfig/Vue/Display.java
*********************************************************************/

package Vue;

//## link itsPasserelle 
import Modele.Passerelle;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

//## link itsControleurDisplay 
import Controleur.ControleurDisplay;

//----------------------------------------------------------------------------
// Vue/Display.java                                                                  
//----------------------------------------------------------------------------

//## package Vue 


//## class Display 
public class Display extends JPanel {
    
    protected ControleurDisplay itsControleurDisplay;		//## link itsControleurDisplay 
    
    protected ControleurDisplay itsControleurDisplay_1;		//## link itsControleurDisplay_1 
    
    protected Passerelle itsPasserelle;		//## link itsPasserelle 
    
    private JLabel titreDisplay;
    private JScrollPane sp;
    private JTextArea affichageListeCompteurs;
    
    // Constructors
    
    //## operation Display() 
    public  Display(ControleurDisplay ctrlDisplay) {
    	itsControleurDisplay=ctrlDisplay;
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
    	affichageListeCompteurs = new JTextArea(this.itsControleurDisplay.getItsPasserelle().getResumeParCompteurs());
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
    public ControleurDisplay getItsControleurDisplay() {
        return itsControleurDisplay;
    }
    
    //## auto_generated 
    public void __setItsControleurDisplay(ControleurDisplay p_ControleurDisplay) {
        itsControleurDisplay = p_ControleurDisplay;
    }
    
    //## auto_generated 
    public void _setItsControleurDisplay(ControleurDisplay p_ControleurDisplay) {
        if(itsControleurDisplay != null)
            {
                itsControleurDisplay.__setItsDisplay(null);
            }
        __setItsControleurDisplay(p_ControleurDisplay);
    }
    
    //## auto_generated 
    public void setItsControleurDisplay(ControleurDisplay p_ControleurDisplay) {
        if(p_ControleurDisplay != null)
            {
                p_ControleurDisplay._setItsDisplay(this);
            }
        _setItsControleurDisplay(p_ControleurDisplay);
    }
    
    //## auto_generated 
    public void _clearItsControleurDisplay() {
        itsControleurDisplay = null;
    }
    
    //## auto_generated 
    public ControleurDisplay getItsControleurDisplay_1() {
        return itsControleurDisplay_1;
    }
    
    //## auto_generated 
    public void setItsControleurDisplay_1(ControleurDisplay p_ControleurDisplay) {
        itsControleurDisplay_1 = p_ControleurDisplay;
    }
    
    //## auto_generated 
    public Passerelle getItsPasserelle() {
        return itsPasserelle;
    }
    
    //## auto_generated 
    public void __setItsPasserelle(Passerelle p_Passerelle) {
        itsPasserelle = p_Passerelle;
    }
    
    //## auto_generated 
    public void _setItsPasserelle(Passerelle p_Passerelle) {
        if(itsPasserelle != null)
            {
                itsPasserelle.__setItsDisplay(null);
            }
        __setItsPasserelle(p_Passerelle);
    }
    
    //## auto_generated 
    public void setItsPasserelle(Passerelle p_Passerelle) {
        if(p_Passerelle != null)
            {
                p_Passerelle._setItsDisplay(this);
            }
        _setItsPasserelle(p_Passerelle);
    }
    
    //## auto_generated 
    public void _clearItsPasserelle() {
        itsPasserelle = null;
    }
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/Vue/Display.java
*********************************************************************/

