/*********************************************************************
	Rhapsody	: 8.1.3
	Login		: Guillaume Robert
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: RRC
//!	Generated Date	: Wed, 6, Jan 2016 
	File Path	: DefaultComponent/DefaultConfig/Controleur/RRC.java
*********************************************************************/

package Controleur;

//## link itsPasserelle 
import Modele.Passerelle;
//## link itsFournisseurEnergie 
import Modele.FournisseurEnergie;

//----------------------------------------------------------------------------
// Controleur/RRC.java                                                                  
//----------------------------------------------------------------------------

//## package Controleur 


//## class RRC 
public class RRC {
    
    protected FournisseurEnergie itsFournisseurEnergie;		//## link itsFournisseurEnergie 
    
    protected FournisseurEnergie itsFournisseurEnergie_1;		//## link itsFournisseurEnergie_1 
    
    protected Passerelle itsPasserelle;		//## link itsPasserelle 
    
    
    // Constructors
    
    //## operation RRC() 
    public  RRC() {
        //#[ operation RRC() 
        //#]
    }
    
    //## operation demandeDonnees() 
    public void demandeDonnees() {
        //#[ operation demandeDonnees() 
        //#]
    }
    
    //## operation editerFacture() 
    public void editerFacture() {
        //#[ operation editerFacture() 
        //#]
    }
    
    //## auto_generated 
    public FournisseurEnergie getItsFournisseurEnergie() {
        return itsFournisseurEnergie;
    }
    
    //## auto_generated 
    public void setItsFournisseurEnergie(FournisseurEnergie p_FournisseurEnergie) {
        itsFournisseurEnergie = p_FournisseurEnergie;
    }
    
    //## auto_generated 
    public FournisseurEnergie getItsFournisseurEnergie_1() {
        return itsFournisseurEnergie_1;
    }
    
    //## auto_generated 
    public void __setItsFournisseurEnergie_1(FournisseurEnergie p_FournisseurEnergie) {
        itsFournisseurEnergie_1 = p_FournisseurEnergie;
    }
    
    //## auto_generated 
    public void _setItsFournisseurEnergie_1(FournisseurEnergie p_FournisseurEnergie) {
        if(itsFournisseurEnergie_1 != null)
            {
                itsFournisseurEnergie_1.__setItsRRC(null);
            }
        __setItsFournisseurEnergie_1(p_FournisseurEnergie);
    }
    
    //## auto_generated 
    public void setItsFournisseurEnergie_1(FournisseurEnergie p_FournisseurEnergie) {
        if(p_FournisseurEnergie != null)
            {
                p_FournisseurEnergie._setItsRRC(this);
            }
        _setItsFournisseurEnergie_1(p_FournisseurEnergie);
    }
    
    //## auto_generated 
    public void _clearItsFournisseurEnergie_1() {
        itsFournisseurEnergie_1 = null;
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
                itsPasserelle.__setItsRRC(null);
            }
        __setItsPasserelle(p_Passerelle);
    }
    
    //## auto_generated 
    public void setItsPasserelle(Passerelle p_Passerelle) {
        if(p_Passerelle != null)
            {
                p_Passerelle._setItsRRC(this);
            }
        _setItsPasserelle(p_Passerelle);
    }
    
    //## auto_generated 
    public void _clearItsPasserelle() {
        itsPasserelle = null;
    }
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/Controleur/RRC.java
*********************************************************************/

