package Vue;

//## link itsPasserelle 
import Modele.Passerelle;

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
public class LED extends JPanel {
    
    protected boolean etatEnLigne;		//## attribute etatEnLigne 
    
    protected boolean etatReveil;		//## attribute etatReveil 
    
    protected ControleurPasserelle itsControleurPasserelle;		//## link itsControleurPasserelle 
    
    protected Passerelle itsPasserelle;//## link itsPasserelle 
    
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
                itsControleurPasserelle.__setItsLED(null);
            }
        __setItsControleurPasserelle(p_ControleurPasserelle);
    }
    
    //## auto_generated 
    public void setItsControleurPasserelle(ControleurPasserelle p_ControleurPasserelle) {
        if(p_ControleurPasserelle != null)
            {
                p_ControleurPasserelle._setItsLED(this);
            }
        _setItsControleurPasserelle(p_ControleurPasserelle);
    }
    
    //## auto_generated 
    public void _clearItsControleurPasserelle() {
        itsControleurPasserelle = null;
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

