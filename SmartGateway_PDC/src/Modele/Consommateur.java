/*********************************************************************
	Rhapsody	: 8.1.3
	Login		: Guillaume Robert
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: Consommateur
//!	Generated Date	: Fri, 15, Jan 2016 
	File Path	: DefaultComponent/DefaultConfig/Modele/Consommateur.java
*********************************************************************/

package Modele;


//----------------------------------------------------------------------------
// Modele/Consommateur.java                                                                  
//----------------------------------------------------------------------------

//## package Modele 


//## class Consommateur 
public class Consommateur extends Utilisateur {
    
    protected String adresse;		//## attribute adresse 
    
    protected int nivAuthorisation;		//## attribute nivAuthorisation 
    
    protected Compteur itsCompteur;		//## link itsCompteur 
    
    protected FournisseurEnergie itsFournisseurEnergie;		//## link itsFournisseurEnergie 
    
    
    // Constructors
    
    //## auto_generated 
    public Consommateur(String _nom, String _pren, String _login, String _mdp, String _adr, FournisseurEnergie _fe, int _aut) {
    	super.nom = _nom;
    	super.prenom = _pren;
    	super.login = _login;
    	super.mdp = _mdp;
    	
    	itsFournisseurEnergie = _fe;
    	adresse = _adr;
    	nivAuthorisation = _aut;
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
    public int getNivAuthorisation() {
        return nivAuthorisation;
    }
    
    //## auto_generated 
    public void setNivAuthorisation(int p_nivAuthorisation) {
        nivAuthorisation = p_nivAuthorisation;
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
    
    public String getTotalPrixMensuel(/* String pMois */) {
    	return Double.toString(itsCompteur.getConsoTotale()*itsFournisseurEnergie.getTarif());
    }
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/Modele/Consommateur.java
*********************************************************************/

