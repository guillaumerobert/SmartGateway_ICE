/*********************************************************************
	Rhapsody	: 8.1.3
	Login		: Guillaume Robert
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: Consommateur
//!	Generated Date	: Mon, 11, Jan 2016 
	File Path	: DefaultComponent/DefaultConfig/Modele/Consommateur.java
*********************************************************************/

package Modele;


//----------------------------------------------------------------------------
// Modele/Consommateur.java                                                                  
//----------------------------------------------------------------------------

//## package Modele 


//## class Consommateur 
public class Consommateur {
    
    protected String adresse;		//## attribute adresse 
    
    protected String nom;		//## attribute nom 
    
    protected String prenom;		//## attribute prenom 
    
    protected Compteur itsCompteur;		//## link itsCompteur 
    
    protected FournisseurEnergie itsFournisseurEnergie;		//## link itsFournisseurEnergie 
    
    
    // Constructors
    
    //## auto_generated 
    public  Consommateur(String _nom, String _prenom) {
    	nom = _nom;
    	prenom = _prenom;
    }
    
    public Consommateur(String _nom, String _prenom, FournisseurEnergie _fe) {
    	nom = _nom;
    	prenom = _prenom;
    	itsFournisseurEnergie = _fe;
	}

	//## auto_generated 
    public String getAdresse() {
        return adresse;
    }
    
    //## auto_generated 
    public void setAdresse(String p_adresse) {
        adresse = p_adresse;
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
    public String getPrenom() {
        return prenom;
    }
    
    //## auto_generated 
    public void setPrenom(String p_prenom) {
        prenom = p_prenom;
    }
    
    //## auto_generated 
    public Compteur getItsCompteur() {
        return itsCompteur;
    }
    
    //## auto_generated 
    public void __setItsCompteur(Compteur p_Compteur) {
        itsCompteur = p_Compteur;
    }
    
    //## auto_generated 
    public void _setItsCompteur(Compteur p_Compteur) {
        if(itsCompteur != null)
            {
                itsCompteur.__setItsConsommateur(null);
            }
        __setItsCompteur(p_Compteur);
    }
    
    //## auto_generated 
    public void setItsCompteur(Compteur p_Compteur) {
        if(p_Compteur != null)
            {
                p_Compteur._setItsConsommateur(this);
            }
        _setItsCompteur(p_Compteur);
    }
    
    //## auto_generated 
    public void _clearItsCompteur() {
        itsCompteur = null;
    }
    
    //## auto_generated 
    public FournisseurEnergie getItsFournisseurEnergie() {
        return itsFournisseurEnergie;
    }
    
    //## auto_generated 
    public void __setItsFournisseurEnergie(FournisseurEnergie p_FournisseurEnergie) {
        itsFournisseurEnergie = p_FournisseurEnergie;
    }
    
    //## auto_generated 
    public void _setItsFournisseurEnergie(FournisseurEnergie p_FournisseurEnergie) {
        if(itsFournisseurEnergie != null)
            {
                itsFournisseurEnergie._removeItsConsommateur(this);
            }
        __setItsFournisseurEnergie(p_FournisseurEnergie);
    }
    
    //## auto_generated 
    public void setItsFournisseurEnergie(FournisseurEnergie p_FournisseurEnergie) {
        if(p_FournisseurEnergie != null)
            {
                p_FournisseurEnergie._addItsConsommateur(this);
            }
        _setItsFournisseurEnergie(p_FournisseurEnergie);
    }
    
    //## auto_generated 
    public void _clearItsFournisseurEnergie() {
        itsFournisseurEnergie = null;
    }
    
    public String toString() {
    	return this.nom + " " + this.prenom;
    }
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/Modele/Consommateur.java
*********************************************************************/

