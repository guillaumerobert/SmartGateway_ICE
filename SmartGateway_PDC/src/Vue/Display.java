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

//## link itsPasserelle 
import Modele.Passerelle;
//## link itsControleurPasserelle 
import Controleur.ControleurPasserelle;

//----------------------------------------------------------------------------
// Vue/Display.java                                                                  
//----------------------------------------------------------------------------

//## package Vue 


//## class Display 
public class Display {
    
    protected ControleurPasserelle itsControleurPasserelle;		//## link itsControleurPasserelle 
    
    protected Passerelle itsPasserelle;		//## link itsPasserelle 
    
    
    // Constructors
    
    //## operation Display() 
    public  Display() {
        //#[ operation Display() 
        //#]
    }
    
    //## operation afficherConso() 
    public void afficherConso() {
        //#[ operation afficherConso() 
        //#]
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

