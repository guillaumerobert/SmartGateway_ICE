/*********************************************************************
	Rhapsody	: 8.1.3
	Login		: Guillaume Robert
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: LED
//!	Generated Date	: Mon, 11, Jan 2016 
	File Path	: DefaultComponent/DefaultConfig/Vue/LED.java
*********************************************************************/

package Vue;

//## link itsPasserelle 
import Modele.Passerelle;
//## link itsControleurLED 
import Controleur.ControleurLED;
//## link itsControleurDisplay 
import Controleur.ControleurDisplay;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

//## link itsControleurPasserelle 
import Controleur.ControleurPasserelle;
import java.awt.Canvas;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.FlowLayout;

//----------------------------------------------------------------------------
// Vue/LED.java                                                                  
//----------------------------------------------------------------------------

//## package Vue 


//## class LED 
public class LED {
    
    protected boolean etatEnLigne;		//## attribute etatEnLigne 
    
    protected boolean etatReveil;		//## attribute etatReveil 
    
    protected ControleurDisplay itsControleurDisplay;		//## link itsControleurDisplay 
    
    protected ControleurLED itsControleurLED;		//## link itsControleurLED 
    
    protected Passerelle itsPasserelle;		//## link itsPasserelle 
    
    

    private BorderLayout mainBorder;
    private JPanel panelCentral;
    private JPanel panelLed;
    private JPanel panelLedRouge;
    private JPanel panelLedVerte;
    
    private JLabel labelTitre;
    
    // Constructors
    
    //## operation LED() 
    public  LED() 
    {
    	
    	mainBorder = new BorderLayout();
    	panelCentral = new JPanel();
    	this.add(panelCentral);
    	panelCentral.setLayout(new BorderLayout());
    	panelCentral.setBounds(100, 100, 158, 174);
    	
    	labelTitre = new JLabel("Statut des LED");
    	labelTitre.setHorizontalAlignment(SwingConstants.CENTER);
    	labelTitre.setFont(new Font("Arial Black", Font.PLAIN, 15));
    	panelCentral.add(labelTitre, mainBorder.NORTH);
    	
    	panelLed = new JPanel();
    	panelLed.setLayout(new GridLayout(2,1));
    	panelCentral.add(panelLed, mainBorder.CENTER);
 
    	PanelLEDRouge panelLEDRouge = new PanelLEDRouge();
    	panelLed.add(panelLEDRouge);
    	FlowLayout fl_panelLEDRouge = new FlowLayout(FlowLayout.CENTER, 5, 5);
    	panelLEDRouge.setLayout(fl_panelLEDRouge);
    	panelLed.add(new PanelLEDVerte());
    }

    
    //## operation miseAJourEtat() 
    public void miseAJourEtat() {
        //#[ operation miseAJourEtat() 
        //#]
    }
    
    //## auto_generated 
    public boolean getEtatEnLigne() {
        return etatEnLigne;
    }
    
    //## auto_generated 
    public void setEtatEnLigne(boolean p_etatEnLigne) {
        etatEnLigne = p_etatEnLigne;
    }
    
    //## auto_generated 
    public boolean getEtatReveil() {
        return etatReveil;
    }
    
    //## auto_generated 
    public void setEtatReveil(boolean p_etatReveil) {
        etatReveil = p_etatReveil;
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
                itsControleurDisplay.__setItsLED(null);
            }
        __setItsControleurDisplay(p_ControleurDisplay);
    }
    
    //## auto_generated 
    public void setItsControleurDisplay(ControleurDisplay p_ControleurDisplay) {
        if(p_ControleurDisplay != null)
            {
                p_ControleurDisplay._setItsLED(this);
            }
        _setItsControleurDisplay(p_ControleurDisplay);
    }
    
    //## auto_generated 
    public void _clearItsControleurDisplay() {
        itsControleurDisplay = null;
    }
    
    //## auto_generated 
    public ControleurLED getItsControleurLED() {
        return itsControleurLED;
    }
    
    //## auto_generated 
    public void setItsControleurLED(ControleurLED p_ControleurLED) {
        itsControleurLED = p_ControleurLED;
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
                itsPasserelle.__setItsLED(null);
            }
        __setItsPasserelle(p_Passerelle);
    }
    
    //## auto_generated 
    public void setItsPasserelle(Passerelle p_Passerelle) {
        if(p_Passerelle != null)
            {
                p_Passerelle._setItsLED(this);
            }
        _setItsPasserelle(p_Passerelle);
    }
    
    //## auto_generated 
    public void _clearItsPasserelle() {
        itsPasserelle = null;
    }
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/Vue/LED.java
*********************************************************************/

