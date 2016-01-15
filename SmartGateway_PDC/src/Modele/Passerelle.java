/*********************************************************************
	Rhapsody	: 8.1.3
	Login		: Guillaume Robert
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: Passerelle
//!	Generated Date	: Mon, 11, Jan 2016 
	File Path	: DefaultComponent/DefaultConfig/Modele/Passerelle.java
*********************************************************************/

package Modele;

//## link itsLED 
import Vue.LED;
//## auto_generated
import java.util.*;
//## link itsDisplay 
import Vue.Display;
//## link itsRRC 
import Controleur.RRC;
//## link itsControleurDisplay 
import Controleur.ControleurDisplay;

//----------------------------------------------------------------------------
// Modele/Passerelle.java                                                                  
//----------------------------------------------------------------------------

//## package Modele 


//## class Passerelle 
public class Passerelle {
    
    protected boolean enLigne;		//## attribute enLigne 
    
    protected boolean recoitSignal;		//## attribute recoitSignal 
    
    protected LinkedList<Compteur> compteurs = new LinkedList<Compteur>();		//## link compteur 
    
    protected ControleurDisplay itsControleurDisplay;		//## link itsControleurDisplay 
    
    protected Display itsDisplay;		//## link itsDisplay 
    
    protected Display itsDisplay_1;		//## link itsDisplay_1 
    
    protected LED itsLED;		//## link itsLED 
    
    protected LEDModel itsLEDModel;		//## link itsLEDModel 
    
    protected LED itsLED_1;		//## link itsLED_1 
    
    protected RRC itsRRC;		//## link itsRRC 
    
    protected RRCModel itsRRCModel;		//## link itsRRCModel 
    
    
    
    // Constructors
    
    //## operation Passerelle() 
    public  Passerelle(RRCModel rrcm) {
        this.compteurs = new LinkedList<Compteur>();
        itsRRCModel = rrcm;
    }
    
    /**
     * @param c
    */
    //## operation ajouterCompteur(Compteur) 
    public void ajouterCompteur(final Compteur c) {
        this.compteurs.add(c);
    }
    
   //## operation getResumeParCompteurs() 
    public String getResumeParCompteurs() {
    	StringBuilder sb = new StringBuilder();
		for(Compteur cpt : this.compteurs){
			sb.append("---------------------------------\n");
			sb.append(cpt.toString());
			sb.append("\n");
			sb.append("---------------------------------\n");
		}
		return sb.toString();
    }
    
    //## operation getTotalConsumption() 
    public double getTotalConsumption() {
    	double total = 0;
		for(Compteur cpt : this.compteurs){
			total += (cpt.getConsoHeuresCreuses() + cpt.getConsoHeuresPleines());
		}
		return total;
    }
    
    //## operation pushRRC() 
    public void pushRRC() {
        //#[ operation pushRRC() 
        //#]
    }
    
    //## auto_generated 
    public boolean getEnLigne() {
        return enLigne;
    }
    
    //## auto_generated 
    public void setEnLigne(boolean p_enLigne) {
        enLigne = p_enLigne;
    }
    
    //## auto_generated 
    public boolean getRecoitSignal() {
        return recoitSignal;
    }
    
    //## auto_generated 
    public void setRecoitSignal(boolean p_recoitSignal) {
        recoitSignal = p_recoitSignal;
    }
    
    //## auto_generated 
    public ListIterator<Compteur> getCompteur() {
        ListIterator<Compteur> iter = compteurs.listIterator();
        return iter;
    }
    
    // AJOUT
    public Compteur getCompteurNumber(int pNum) {
        return compteurs.get(pNum);
    }
    
    //## auto_generated 
    public void addCompteur(Compteur p_Compteur) {
        compteurs.add(p_Compteur);
    }
    
    //## auto_generated 
    public void removeCompteur(Compteur p_Compteur) {
        compteurs.remove(p_Compteur);
    }
    
    //## auto_generated 
    public void clearCompteur() {
        compteurs.clear();
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
                itsControleurDisplay.__setItsPasserelle(null);
            }
        __setItsControleurDisplay(p_ControleurDisplay);
    }
    
    //## auto_generated 
    public void setItsControleurDisplay(ControleurDisplay p_ControleurDisplay) {
        if(p_ControleurDisplay != null)
            {
                p_ControleurDisplay._setItsPasserelle(this);
            }
        _setItsControleurDisplay(p_ControleurDisplay);
    }
    
    //## auto_generated 
    public void _clearItsControleurDisplay() {
        itsControleurDisplay = null;
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
                itsDisplay.__setItsPasserelle(null);
            }
        __setItsDisplay(p_Display);
    }
    
    //## auto_generated 
    public void setItsDisplay(Display p_Display) {
        if(p_Display != null)
            {
                p_Display._setItsPasserelle(this);
            }
        _setItsDisplay(p_Display);
    }
    
    //## auto_generated 
    public void _clearItsDisplay() {
        itsDisplay = null;
    }
    
    //## auto_generated 
    public Display getItsDisplay_1() {
        return itsDisplay_1;
    }
    
    //## auto_generated 
    public void setItsDisplay_1(Display p_Display) {
        itsDisplay_1 = p_Display;
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
                itsLED.__setItsPasserelle(null);
            }
        __setItsLED(p_LED);
    }
    
    //## auto_generated 
    public void setItsLED(LED p_LED) {
        if(p_LED != null)
            {
                p_LED._setItsPasserelle(this);
            }
        _setItsLED(p_LED);
    }
    
    //## auto_generated 
    public void _clearItsLED() {
        itsLED = null;
    }
    
    //## auto_generated 
    public LEDModel getItsLEDModel() {
        return itsLEDModel;
    }
    
    //## auto_generated 
    public void setItsLEDModel(LEDModel p_LEDModel) {
        itsLEDModel = p_LEDModel;
    }
    
    //## auto_generated 
    public LED getItsLED_1() {
        return itsLED_1;
    }
    
    //## auto_generated 
    public void setItsLED_1(LED p_LED) {
        itsLED_1 = p_LED;
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
                itsRRC.__setItsPasserelle(null);
            }
        __setItsRRC(p_RRC);
    }
    
    //## auto_generated 
    public void setItsRRC(RRC p_RRC) {
        if(p_RRC != null)
            {
                p_RRC._setItsPasserelle(this);
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
    public void __setItsRRCModel(RRCModel p_RRCModel) {
        itsRRCModel = p_RRCModel;
    }
    
    //## auto_generated 
    public void _setItsRRCModel(RRCModel p_RRCModel) {
        if(itsRRCModel != null)
            {
                itsRRCModel._removeItsPasserelle_1(this);
            }
        __setItsRRCModel(p_RRCModel);
    }
    
    //## auto_generated 
    public void setItsRRCModel(RRCModel p_RRCModel) {
        if(p_RRCModel != null)
            {
                p_RRCModel._addItsPasserelle_1(this);
            }
        _setItsRRCModel(p_RRCModel);
    }
    
    //## auto_generated 
    public void _clearItsRRCModel() {
        itsRRCModel = null;
    }
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/Modele/Passerelle.java
*********************************************************************/

