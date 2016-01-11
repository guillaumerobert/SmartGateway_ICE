/*********************************************************************
	Rhapsody	: 8.1.3
	Login		: Guillaume Robert
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: ControleurPasserelle
//!	Generated Date	: Wed, 6, Jan 2016 
	File Path	: DefaultComponent/DefaultConfig/Controleur/ControleurPasserelle.java
*********************************************************************/

package Controleur;

//## link itsLED 
import Vue.LED;
//## link itsDisplay 
import Vue.Display;
//## link itsPasserelle 
import Modele.Passerelle;

//----------------------------------------------------------------------------
// Controleur/ControleurPasserelle.java                                                                  
//----------------------------------------------------------------------------

//## package Controleur 


//## class ControleurPasserelle 
public class ControleurPasserelle {
    
    protected Display itsDisplay;		//## link itsDisplay 
    
    protected LED itsLED;		//## link itsLED 
    
    protected Passerelle itsPasserelle;		//## link itsPasserelle 
    
    
    // Constructors
    
    //## auto_generated 
    public  ControleurPasserelle(Passerelle pass) {
    	itsPasserelle = pass;
    }
    
    //## operation envoiDonneesDisplay() 
    public void envoiDonneesDisplay() {
        //#[ operation envoiDonneesDisplay() 
        //#]
    }
    
    //## auto_generated 
    public Display getItsDisplay() {
        return itsDisplay;
    }
    
    //## auto_generated 
    public void __setItsDisplay(Display p_Display) {
        itsDisplay = p_Display;
    }
    
    //## auto_generated 
    public void _setItsDisplay(Display p_Display) {
        if(itsDisplay != null)
            {
                itsDisplay.__setItsControleurPasserelle(null);
            }
        __setItsDisplay(p_Display);
    }
    
    //## auto_generated 
    public void setItsDisplay(Display p_Display) {
        if(p_Display != null)
            {
                p_Display._setItsControleurPasserelle(this);
            }
        _setItsDisplay(p_Display);
    }
    
    //## auto_generated 
    public void _clearItsDisplay() {
        itsDisplay = null;
    }
    
    //## auto_generated 
    public LED getItsLED() {
        return itsLED;
    }
    
    //## auto_generated 
    public void __setItsLED(LED p_LED) {
        itsLED = p_LED;
    }
    
    //## auto_generated 
    public void _setItsLED(LED p_LED) {
        if(itsLED != null)
            {
                itsLED.__setItsControleurPasserelle(null);
            }
        __setItsLED(p_LED);
    }
    
    //## auto_generated 
    public void setItsLED(LED p_LED) {
        if(p_LED != null)
            {
                p_LED._setItsControleurPasserelle(this);
            }
        _setItsLED(p_LED);
    }
    
    //## auto_generated 
    public void _clearItsLED() {
        itsLED = null;
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
                itsPasserelle.__setItsControleurPasserelle(null);
            }
        __setItsPasserelle(p_Passerelle);
    }
    
    //## auto_generated 
    public void setItsPasserelle(Passerelle p_Passerelle) {
        if(p_Passerelle != null)
            {
                p_Passerelle._setItsControleurPasserelle(this);
            }
        _setItsPasserelle(p_Passerelle);
    }
    
    //## auto_generated 
    public void _clearItsPasserelle() {
        itsPasserelle = null;
    }
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/Controleur/ControleurPasserelle.java
*********************************************************************/

