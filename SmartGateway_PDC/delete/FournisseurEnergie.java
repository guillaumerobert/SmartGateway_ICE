/*********************************************************************
	Rhapsody	: 8.1.3
	Login		: Guillaume Robert
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: FournisseurEnergie
//!	Generated Date	: Wed, 6, Jan 2016 
	File Path	: DefaultComponent/DefaultConfig/Modele/FournisseurEnergie.java
*********************************************************************/

package Modele;

//## link itsRRC 
import Controleur.RRC;

//----------------------------------------------------------------------------
// Modele/FournisseurEnergie.java                                                                  
//----------------------------------------------------------------------------

//## package Modele 


//## class FournisseurEnergie 
public class FournisseurEnergie {
    
    protected int tarifElec;		//## attribute tarifElec 
    
    protected RRC itsRRC;		//## link itsRRC 
    
    
    // Constructors
    
    //## auto_generated 
    public  FournisseurEnergie() {
    }
    
    //## operation getTarif() 
    public int getTarif() {
        //#[ operation getTarif() 
        //#]
    	return 0 ; // TODO
    }
    
    //## operation setTarif() 
    public void setTarif() {
        //#[ operation setTarif() 
        //#]
    }
    
    //## auto_generated 
    public int getTarifElec() {
        return tarifElec;
    }
    
    //## auto_generated 
    public void setTarifElec(int p_tarifElec) {
        tarifElec = p_tarifElec;
    }
    
    //## auto_generated 
    public RRC getItsRRC() {
        return itsRRC;
    }
    
    //## auto_generated 
    public void __setItsRRC(RRC p_RRC) {
        itsRRC = p_RRC;
    }
    
    //## auto_generated 
    public void _setItsRRC(RRC p_RRC) {
        if(itsRRC != null)
            {
                itsRRC.__setItsFournisseurEnergie_1(null);
            }
        __setItsRRC(p_RRC);
    }
    
    //## auto_generated 
    public void setItsRRC(RRC p_RRC) {
        if(p_RRC != null)
            {
                p_RRC._setItsFournisseurEnergie_1(this);
            }
        _setItsRRC(p_RRC);
    }
    
    //## auto_generated 
    public void _clearItsRRC() {
        itsRRC = null;
    }
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/Modele/FournisseurEnergie.java
*********************************************************************/

