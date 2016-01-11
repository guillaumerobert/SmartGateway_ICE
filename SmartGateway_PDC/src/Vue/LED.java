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
    private JPanel panelLed;
    // Constructors
    
    //## operation LED() 
    public  LED() 
    {
    	setLayout(new BorderLayout(0, 0));
    	
    	Canvas canvas = new Canvas();
    	add(canvas);
    	
    	panelLed = new JPanel();
    	this.add(panelLed);
    	panelLed.setLayout(new BorderLayout(0, 0));
    	
    	JLabel lblNewLabel = new JLabel("New label");
    	panelLed.add(lblNewLabel, BorderLayout.NORTH);
    }
    
    public void paintComponent(Graphics g)
    {
    	g.setColor(Color.RED);
    	g.fillOval(0, 0,50,50);
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

