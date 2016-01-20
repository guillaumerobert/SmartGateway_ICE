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

import java.util.Random;

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
    
    private Random generateur;
    
    
    // Constructors
    
    //## operation Compteur() 
    public  Compteur(Consommateur _conso) {
    	this.generateur = new Random();
		this.numeroCompteur = this.generateur.nextInt((99999-1)+1);
		this.rangeMin = 100.0;
		this.rangeMax = 10000.0;
		this.itsConsommateur = _conso;
		
		this.consoHeuresCreuses = rangeMin + (rangeMax - rangeMin) * generateur.nextDouble();
		this.consoHeuresPleines = rangeMin + (rangeMax - rangeMin) * generateur.nextDouble();
    }
    
    //## operation consommer() 
    public void consommer() {
    	this.consoHeuresCreuses += (this.generateur.nextDouble() * 10);
		this.consoHeuresPleines += (this.generateur.nextDouble() * 10);
    }
    
    //## operation toString() 
    public String toString() {
    	return "Relevé Compteur N°"+this.numeroCompteur+" ::: HP:"+this.consoHeuresPleines+"KWh. HC:"+this.consoHeuresCreuses+"KWh.\n";
    }
    
    //## auto_generated 
    public double getConsoHeuresCreuses() {
        return (double)Math.round(consoHeuresCreuses * 100) / 100;
    }
    
    //## auto_generated 
    public void setConsoHeuresCreuses(double p_consoHeuresCreuses) {
        consoHeuresCreuses = p_consoHeuresCreuses;
    }
    
    //## auto_generated 
    public double getConsoHeuresPleines() {
        return (double)Math.round(consoHeuresPleines * 100) / 100;
    }
    
    //## auto_generated 
    public void setConsoHeuresPleines(double p_consoHeuresPleines) {
        consoHeuresPleines = p_consoHeuresPleines;
    }
    
    //## auto_generated 
    public int getNumeroCompteur() {
        return numeroCompteur;
    }
    
    //## auto_generated 
    public void setNumeroCompteur(int p_numeroCompteur) {
        numeroCompteur = p_numeroCompteur;
    }
    
    //## auto_generated 
    public double getRangeMax() {
        return rangeMax;
    }
    
    //## auto_generated 
    public void setRangeMax(double p_rangeMax) {
        rangeMax = p_rangeMax;
    }
    
    //## auto_generated 
    public double getRangeMin() {
        return rangeMin;
    }
    
    //## auto_generated 
    public void setRangeMin(double p_rangeMin) {
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
    
    public double getConsoTotale() {
    	return (double)Math.round((this.consoHeuresCreuses + this.consoHeuresPleines) * 100) / 100;
    }
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/Modele/Compteur.java
*********************************************************************/

