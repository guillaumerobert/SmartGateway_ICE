/*********************************************************************
	Rhapsody	: 8.1.3
	Login		: Guillaume Robert
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: Compteur
//!	Generated Date	: Wed, 6, Jan 2016 
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
    
    protected double conso_heures_creuses;		//## attribute conso_heures_creuses 
    
    protected double conso_heures_pleines;		//## attribute conso_heures_pleines 
    
    protected int numero_compteur;		//## attribute numero_compteur 
    
    protected double range_max;		//## attribute range_max 
    
    protected double range_min;		//## attribute range_min 
    
    private Random generateur;
    
    // Constructors
    
    //## operation Compteur() 
    public  Compteur() {
		this.generateur = new Random();
		this.numero_compteur = this.generateur.nextInt();
		this.range_min = 100.0;
		this.range_max = 10000.0;
		
		this.conso_heures_creuses = range_min + (range_max - range_min) * generateur.nextDouble();
		this.conso_heures_pleines = range_min + (range_max - range_min) * generateur.nextDouble();
    }
    
    //## operation consommer() 
    public void consommer() {
		this.conso_heures_creuses += (this.generateur.nextDouble() * 10);
		this.conso_heures_pleines += (this.generateur.nextDouble() * 10);
    }
    
    //## operation to_string() 
	@Override
	public String toString(){
		return "Relevé Compteur N°"+this.numero_compteur+" ::: HP:"+this.conso_heures_pleines+"KWh. HC:"+this.conso_heures_creuses+"KWh.\n";
	}
    
    //## auto_generated 
    public double getConso_heures_creuses() {
        return conso_heures_creuses;
    }
    
    //## auto_generated 
    public void setConso_heures_creuses(double p_conso_heures_creuses) {
        conso_heures_creuses = p_conso_heures_creuses;
    }
    
    //## auto_generated 
    public double getConso_heures_pleines() {
    	return conso_heures_pleines;
    }
    
    //## auto_generated 
    public void setConso_heures_pleines(double p_conso_heures_pleines) {
        conso_heures_pleines = p_conso_heures_pleines;
    }
    
    //## auto_generated 
    public int getNumero_compteur() {
        return numero_compteur;
    }
    
    //## auto_generated 
    public void setNumero_compteur(int p_numero_compteur) {
        numero_compteur = p_numero_compteur;
    }
    
    //## auto_generated 
    public double getRange_max() {
        return range_max;
    }
    
    //## auto_generated 
    public void setRange_max(double p_range_max) {
        range_max = p_range_max;
    }
    
    //## auto_generated 
    public double getRange_min() {
        return range_min;
    }
    
    //## auto_generated 
    public void setRange_min(double p_range_min) {
        range_min = p_range_min;
    }
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/Modele/Compteur.java
*********************************************************************/

