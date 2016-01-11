/*********************************************************************
	Rhapsody	: 8.1.3
	Login		: Guillaume Robert
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: Compteur
//!	Generated Date	: Mon, 11, Jan 2016 
	File Path	: DefaultComponent/DefaultConfig/Modele/Compteur.java
*********************************************************************/

package Modele;


//----------------------------------------------------------------------------
// Modele/Compteur.java                                                                  
//----------------------------------------------------------------------------

//## package Modele 


//## class Compteur 
public class Compteur {
    
    protected double consoHeuresCreuses;		//## attribute consoHeuresCreuses 
    
    protected double consoHeuresPleines;		//## attribute consoHeuresPleines 
    
    protected int numeroCompteur;		//## attribute numeroCompteur 
    
    protected double rangeMax;		//## attribute rangeMax 
    
    protected double rangeMin;		//## attribute rangeMin 
    
    protected Consommateur itsConsommateur;		//## link itsConsommateur 
    
    
    // Constructors
    
    //## operation Compteur() 
    public  Compteur() {
        //#[ operation Compteur() 
        //#]
    }
    
    //## operation consommer() 
    public void consommer() {
        //#[ operation consommer() 
        //#]
    }
    
    //## operation toString() 
    public String toString() {
        //#[ operation toString() 
        //#]
    }
    
    //## auto_generated 
    private double getConsoHeuresCreuses() {
        return consoHeuresCreuses;
    }
    
    //## auto_generated 
    private void setConsoHeuresCreuses(double p_consoHeuresCreuses) {
        consoHeuresCreuses = p_consoHeuresCreuses;
    }
    
    //## auto_generated 
    private double getConsoHeuresPleines() {
        return consoHeuresPleines;
    }
    
    //## auto_generated 
    private void setConsoHeuresPleines(double p_consoHeuresPleines) {
        consoHeuresPleines = p_consoHeuresPleines;
    }
    
    //## auto_generated 
    private int getNumeroCompteur() {
        return numeroCompteur;
    }
    
    //## auto_generated 
    private void setNumeroCompteur(int p_numeroCompteur) {
        numeroCompteur = p_numeroCompteur;
    }
    
    //## auto_generated 
    private double getRangeMax() {
        return rangeMax;
    }
    
    //## auto_generated 
    private void setRangeMax(double p_rangeMax) {
        rangeMax = p_rangeMax;
    }
    
    //## auto_generated 
    private double getRangeMin() {
        return rangeMin;
    }
    
    //## auto_generated 
    private void setRangeMin(double p_rangeMin) {
        rangeMin = p_rangeMin;
    }
    
    //## auto_generated 
    public Consommateur getItsConsommateur() {
        return itsConsommateur;
    }
    
    //## auto_generated 
    public void __setItsConsommateur(Consommateur p_Consommateur) {
        itsConsommateur = p_Consommateur;
    }
    
    //## auto_generated 
    public void _setItsConsommateur(Consommateur p_Consommateur) {
        if(itsConsommateur != null)
            {
                itsConsommateur.__setItsCompteur(null);
            }
        __setItsConsommateur(p_Consommateur);
    }
    
    //## auto_generated 
    public void setItsConsommateur(Consommateur p_Consommateur) {
        if(p_Consommateur != null)
            {
                p_Consommateur._setItsCompteur(this);
            }
        _setItsConsommateur(p_Consommateur);
    }
    
    //## auto_generated 
    public void _clearItsConsommateur() {
        itsConsommateur = null;
    }
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/Modele/Compteur.java
*********************************************************************/

