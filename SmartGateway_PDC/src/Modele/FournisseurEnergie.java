/*********************************************************************
	Rhapsody	: 8.1.3
	Login		: Guillaume Robert
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: FournisseurEnergie
//!	Generated Date	: Mon, 11, Jan 2016 
	File Path	: DefaultComponent/DefaultConfig/Modele/FournisseurEnergie.java
*********************************************************************/

package Modele;

//## auto_generated
import java.util.*;
//## link itsRRC 
import Controleur.RRC;

//----------------------------------------------------------------------------
// Modele/FournisseurEnergie.java                                                                  
//----------------------------------------------------------------------------

//## package Modele 


//## class FournisseurEnergie 
public class FournisseurEnergie {
    
    protected String nom;		//## attribute nom 
    
    protected double tarif;		//## attribute tarif 
    
    protected LinkedList<Consommateur> itsConsommateur = new LinkedList<Consommateur>();		//## link itsConsommateur 
    
    protected Producteur itsProducteur;		//## link itsProducteur 
    
    protected RRC itsRRC;		//## link itsRRC 
    
    protected RRCModel itsRRCModel;		//## link itsRRCModel 
    
    
    // Constructors
    
    //## auto_generated 
    public  FournisseurEnergie() {
    }
    
    public FournisseurEnergie(String pNom, double pTarif) {
    	nom = pNom;
    	tarif = pTarif;
	}

	//## auto_generated 
    public String getNom() {
        return nom;
    }
    
    //## auto_generated 
    public void setNom(String p_nom) {
        nom = p_nom;
    }
    
    //## auto_generated 
    public double getTarif() {
        return tarif;
    }
    
    //## auto_generated 
    public void setTarif(int p_tarif) {
        tarif = p_tarif;
    }
    
    //## auto_generated 
    public ListIterator<Consommateur> getItsConsommateur() {
        ListIterator<Consommateur> iter = itsConsommateur.listIterator();
        return iter;
    }
    
    //## auto_generated 
    public void _addItsConsommateur(Consommateur p_Consommateur) {
        itsConsommateur.add(p_Consommateur);
    }
    
    //## auto_generated 
    public void addItsConsommateur(Consommateur p_Consommateur) {
        if(p_Consommateur != null)
            {
                p_Consommateur._setItsFournisseurEnergie(this);
            }
        _addItsConsommateur(p_Consommateur);
    }
    
    //## auto_generated 
    public void _removeItsConsommateur(Consommateur p_Consommateur) {
        itsConsommateur.remove(p_Consommateur);
    }
    
    //## auto_generated 
    public void removeItsConsommateur(Consommateur p_Consommateur) {
        if(p_Consommateur != null)
            {
                p_Consommateur.__setItsFournisseurEnergie(null);
            }
        _removeItsConsommateur(p_Consommateur);
    }
    
    //## auto_generated 
    public void _clearItsConsommateur() {
        itsConsommateur.clear();
    }
    
    //## auto_generated 
    public void clearItsConsommateur() {
        ListIterator<Consommateur> iter = itsConsommateur.listIterator();
        while (iter.hasNext()){
            (itsConsommateur.get(iter.nextIndex()))._clearItsFournisseurEnergie();
            iter.next();
        }
        _clearItsConsommateur();
    }
    
    //## auto_generated 
    public Producteur getItsProducteur() {
        return itsProducteur;
    }
    
    //## auto_generated 
    public void __setItsProducteur(Producteur p_Producteur) {
        itsProducteur = p_Producteur;
    }
    
    //## auto_generated 
    public void _setItsProducteur(Producteur p_Producteur) {
        if(itsProducteur != null)
            {
                itsProducteur._removeItsFournisseurEnergie(this);
            }
        __setItsProducteur(p_Producteur);
    }
    
    //## auto_generated 
    public void setItsProducteur(Producteur p_Producteur) {
        if(p_Producteur != null)
            {
                p_Producteur._addItsFournisseurEnergie(this);
            }
        _setItsProducteur(p_Producteur);
    }
    
    //## auto_generated 
    public void _clearItsProducteur() {
        itsProducteur = null;
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
    
    //## auto_generated 
    public RRCModel getItsRRCModel() {
        return itsRRCModel;
    }
    
    //## auto_generated 
    public void setItsRRCModel(RRCModel p_RRCModel) {
        itsRRCModel = p_RRCModel;
    }
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/Modele/FournisseurEnergie.java
*********************************************************************/

