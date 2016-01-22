/*********************************************************************
	Rhapsody	: 8.1.3
	Login		: Guillaume Robert
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: RRC
//!	Generated Date	: Mon, 11, Jan 2016 
	File Path	: DefaultComponent/DefaultConfig/Controleur/RRC.java
*********************************************************************/

package Controleur;

//## link itsRRCModel 
import Modele.RRCModel;
//## link itsPasserelle 
import Modele.Passerelle;
//## link itsFournisseurEnergie 
import Modele.FournisseurEnergie;

import java.util.Iterator;
import java.util.Vector;

import Modele.Compteur;
import Modele.Consommateur;

//----------------------------------------------------------------------------
// Controleur/RRC.java                                                                  
//----------------------------------------------------------------------------

//## package Controleur 


//## class RRC 
public class RRC {
    
    protected FournisseurEnergie itsFournisseurEnergie;		//## link itsFournisseurEnergie 
    
    protected FournisseurEnergie itsFournisseurEnergie_1;		//## link itsFournisseurEnergie_1 
    
    protected Passerelle itsPasserelle;		//## link itsPasserelle 
    
    protected RRCModel itsRRCModel;		//## link itsRRCModel 
    
    
    // Constructors
    
    //## operation RRC() 
    public  RRC(RRCModel _rrcm) {
    	itsRRCModel = _rrcm;
    }
    
    //## operation demandeDonnees() 
    public Compteur demandeDonnees(int pNumPasserelle, int pNumCompteur, int pNumMois) {
    	return itsRRCModel.getDonneesDuMois(pNumMois, pNumCompteur);
    }
    
    //## operation transmettreDonnees() 
    public void transmettreDonnees(Passerelle pPass, int pNumMois) {
    	
    	itsRRCModel.setDonneesDuMois(pPass, pNumMois);
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
    
    //## auto_generated 
    public RRCModel getItsRRCModel() {
        return itsRRCModel;
    }
    
    //## auto_generated 
    public void setItsRRCModel(RRCModel p_RRCModel) {
        itsRRCModel = p_RRCModel;
    }
    
 // AJOUT
    public Vector<Consommateur> getAllConsummers(Passerelle _gateway) {
   
    	Vector<Consommateur> listeConso = new Vector<>(); 	
    	Iterator<Compteur> it = _gateway.getCompteurs();
    	Consommateur c;
    	
        while(it.hasNext())
        {
        	c = it.next().getItsConsommateur();
    		listeConso.add(c);
    	}
        
        return listeConso;
    }
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/Controleur/RRC.java
*********************************************************************/

