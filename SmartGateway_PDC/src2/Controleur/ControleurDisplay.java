/*********************************************************************
	Rhapsody	: 8.1.3
	Login		: Guillaume Robert
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: ControleurDisplay
//!	Generated Date	: Mon, 11, Jan 2016 
	File Path	: DefaultComponent/DefaultConfig/Controleur/ControleurDisplay.java
*********************************************************************/

package Controleur;

//## link itsLED 
import Vue.LED;
//## link itsDisplay 
import Vue.Display;
//## link itsPasserelle 
import Modele.Passerelle;

//----------------------------------------------------------------------------
// Controleur/ControleurDisplay.java                                                                  
//----------------------------------------------------------------------------

//## package Controleur 


//## class ControleurDisplay 
public class ControleurDisplay {
    
    protected Display itsDisplay;		//## link itsDisplay 
    
    protected LED itsLED;		//## link itsLED 
    
    protected Passerelle itsPasserelle;		//## link itsPasserelle 
    
    protected Passerelle itsPasserelle_1;		//## link itsPasserelle_1 
    
    
    // Constructors
    
    //## auto_generated 
    public  ControleurDisplay() {
    }
    
    //## operation majDisplay() 
    public void majDisplay() {
        //#[ operation majDisplay() 
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
                itsDisplay.__setItsControleurDisplay(null);
            }
        __setItsDisplay(p_Display);
    }
    
    //## auto_generated 
    public void setItsDisplay(Display p_Display) {
        if(p_Display != null)
            {
                p_Display._setItsControleurDisplay(this);
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
                itsLED.__setItsControleurDisplay(null);
            }
        __setItsLED(p_LED);
    }
    
    //## auto_generated 
    public void setItsLED(LED p_LED) {
        if(p_LED != null)
            {
                p_LED._setItsControleurDisplay(this);
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
                itsPasserelle.__setItsControleurDisplay(null);
            }
        __setItsPasserelle(p_Passerelle);
    }
    
    //## auto_generated 
    public void setItsPasserelle(Passerelle p_Passerelle) {
        if(p_Passerelle != null)
            {
                p_Passerelle._setItsControleurDisplay(this);
            }
        _setItsPasserelle(p_Passerelle);
    }
    
    //## auto_generated 
    public void _clearItsPasserelle() {
        itsPasserelle = null;
    }
    
    //## auto_generated 
    public Passerelle getItsPasserelle_1() {
        return itsPasserelle_1;
    }
    
    //## auto_generated 
    public void setItsPasserelle_1(Passerelle p_Passerelle) {
        itsPasserelle_1 = p_Passerelle;
    }
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/Controleur/ControleurDisplay.java
*********************************************************************/

