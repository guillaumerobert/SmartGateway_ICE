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
    
    
    // Constructors
    
    //## operation LED() 
    public  LED() {
        //#[ operation LED() 
        //#]
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

