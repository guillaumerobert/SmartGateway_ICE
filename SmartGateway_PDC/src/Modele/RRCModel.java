/*********************************************************************
	Rhapsody	: 8.1.3
	Login		: Guillaume Robert
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: RRCModel
//!	Generated Date	: Mon, 11, Jan 2016 
	File Path	: DefaultComponent/DefaultConfig/Modele/RRCModel.java
*********************************************************************/

package Modele;

//## auto_generated
import java.util.*;
//## link itsRRC 
import Controleur.RRC;

//----------------------------------------------------------------------------
// Modele/RRCModel.java                                                                  
//----------------------------------------------------------------------------

//## package Modele 


//## class RRCModel 
public class RRCModel {
    
    protected Passerelle itsPasserelle;		//## link itsPasserelle 
    
    protected LinkedList<Passerelle> itsPasserelle_1 = new LinkedList<Passerelle>();		//## link itsPasserelle_1 
    
    protected RRC itsRRC;		//## link itsRRC 
    
    private Map<Integer, LinkedList<Passerelle>> donneesSaveParMois = new HashMap<>();
    
    // Constructors
    
    //## auto_generated 
    public  RRCModel() {
    	
    	for (int i = 1; i < 13; i++)
    		donneesSaveParMois.put(i, new LinkedList<Passerelle>());
    }
    
    //## auto_generated 
    public Passerelle getItsPasserelle() {
        return itsPasserelle;
    }
    
    //## auto_generated 
    public void setItsPasserelle(Passerelle p_Passerelle) {
        itsPasserelle = p_Passerelle;
    }
    
    //## auto_generated 
    public ListIterator<Passerelle> getItsPasserelle_1() {
        ListIterator<Passerelle> iter = itsPasserelle_1.listIterator();
        return iter;
    }
    
    // AJOUT
    public Passerelle getItsPasserelleNumber(int pNb) {
        return itsPasserelle_1.get(pNb);
    }
    
    //## auto_generated 
    public void _addItsPasserelle_1(Passerelle p_Passerelle) {
        itsPasserelle_1.add(p_Passerelle);
    }
    
    //## auto_generated 
    public void addItsPasserelle_1(Passerelle p_Passerelle) {
        if(p_Passerelle != null)
            {
                p_Passerelle._setItsRRCModel(this);
            }
        _addItsPasserelle_1(p_Passerelle);
    }
    
    //## auto_generated 
    public void _removeItsPasserelle_1(Passerelle p_Passerelle) {
        itsPasserelle_1.remove(p_Passerelle);
    }
    
    //## auto_generated 
    public void removeItsPasserelle_1(Passerelle p_Passerelle) {
        if(p_Passerelle != null)
            {
                p_Passerelle.__setItsRRCModel(null);
            }
        _removeItsPasserelle_1(p_Passerelle);
    }
    
    //## auto_generated 
    public void _clearItsPasserelle_1() {
        itsPasserelle_1.clear();
    }
    
    //## auto_generated 
    public void clearItsPasserelle_1() {
        ListIterator<Passerelle> iter = itsPasserelle_1.listIterator();
        while (iter.hasNext()){
            (itsPasserelle_1.get(iter.nextIndex()))._clearItsRRCModel();
            iter.next();
        }
        _clearItsPasserelle_1();
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
                itsRRC.setItsRRCModel(null);
            }
        __setItsRRC(p_RRC);
    }
    
    //## auto_generated 
    public void setItsRRC(RRC p_RRC) {
        if(p_RRC != null)
            {
                p_RRC.setItsRRCModel(this);
            }
        _setItsRRC(p_RRC);
    }
    
    //## auto_generated 
    public void _clearItsRRC() {
        itsRRC = null;
    }
    
    // AJOUT
    public void setDonneesDuMois(Passerelle _p, int _numMois) { // on set seulement sur l'annee en cours
    	
    	if (donneesSaveParMois.get(_numMois).isEmpty() && _numMois >= 1 && _numMois <= 12)
    			donneesSaveParMois.get(_numMois).add(_p);
    }
    
    // AJOUT
    public Compteur getDonneesDuMois(int _numMois, int _numCpt) {
    	LinkedList<Passerelle> pass = donneesSaveParMois.get(_numMois);
    	for(Passerelle p : pass) {
    		return p.getCompteurNumber(_numCpt);
    	}
    	
    	return null;
    }
    
    // AJOUT
    public ArrayList<Compteur> getDonneesDuCompteurParMois(int _numCpt) {
    	
    	ArrayList<Compteur> compteurs = new ArrayList<>();
    	
    	for (int i = 1; i < 13; i++) {
    		compteurs.add(getDonneesDuMois(i, _numCpt));
    	}
    	
    	return compteurs;
    }
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/Modele/RRCModel.java
*********************************************************************/

