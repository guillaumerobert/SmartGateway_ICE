/*********************************************************************
	Rhapsody	: 8.1.3
	Login		: Guillaume Robert
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: Utilisateur
//!	Generated Date	: Fri, 15, Jan 2016 
	File Path	: DefaultComponent/DefaultConfig/Modele/Utilisateur.java
*********************************************************************/

package Modele;


//----------------------------------------------------------------------------
// Modele/Utilisateur.java                                                                  
//----------------------------------------------------------------------------

//## package Modele 


//## class Utilisateur 
public class Utilisateur {
    
    protected String login;		//## attribute login 
    
    protected String mdp;		//## attribute mdp 
    
    protected String nom;		//## attribute nom 
    
    protected String prenom;		//## attribute prenom 
    
    
    // Constructors
    
    //## auto_generated 
    public  Utilisateur() {
    }
    
    public  Utilisateur(String _login, String _mdp) {
    	this.login = _login;
    	this.mdp = _mdp;
    }
    
    //## auto_generated 
    public String getLogin() {
        return login;
    }
    
    //## auto_generated 
    public void setLogin(String p_login) {
        login = p_login;
    }
    
    //## auto_generated 
    public String getMdp() {
        return mdp;
    }
    
    //## auto_generated 
    public void setMdp(String p_mdp) {
        mdp = p_mdp;
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
    
    public String toString() {
    	return this.nom + " " + this.prenom;
    }
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/Modele/Utilisateur.java
*********************************************************************/

