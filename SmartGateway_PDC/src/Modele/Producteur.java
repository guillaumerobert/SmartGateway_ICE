/*********************************************************************
	Rhapsody	: 8.1.3
	Login		: Guillaume Robert
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: Producteur
//!	Generated Date	: Mon, 11, Jan 2016 
	File Path	: DefaultComponent/DefaultConfig/Modele/Producteur.java
*********************************************************************/

package Modele;

//## auto_generated
import java.util.*;

//----------------------------------------------------------------------------
// Modele/Producteur.java                                                                  
//----------------------------------------------------------------------------

//## package Modele 


//## class Producteur 
public class Producteur {
    
    protected float prix;		//## attribute prix 
    
    protected String typeEnergie;		//## attribute typeEnergie 
    
    protected LinkedList<FournisseurEnergie> itsFournisseurEnergie = new LinkedList<FournisseurEnergie>();		//## link itsFournisseurEnergie 
    
    
    // Constructors
    
    //## auto_generated 
    public  Producteur() {
    }
    
    //## auto_generated 
    public float getPrix() {
        return prix;
    }
    
    //## auto_generated 
    public void setPrix(float p_prix) {
        prix = p_prix;
    }
    
    //## auto_generated 
    public String getTypeEnergie() {
        return typeEnergie;
    }
    
    //## auto_generated 
    public void setTypeEnergie(String p_typeEnergie) {
        typeEnergie = p_typeEnergie;
    }
    
    //## auto_generated 
    public ListIterator<FournisseurEnergie> getItsFournisseurEnergie() {
        ListIterator<FournisseurEnergie> iter = itsFournisseurEnergie.listIterator();
        return iter;
    }
    
    //## auto_generated 
    public void _addItsFournisseurEnergie(FournisseurEnergie p_FournisseurEnergie) {
        itsFournisseurEnergie.add(p_FournisseurEnergie);
    }
    
    //## auto_generated 
    public void addItsFournisseurEnergie(FournisseurEnergie p_FournisseurEnergie) {
        if(p_FournisseurEnergie != null)
            {
                p_FournisseurEnergie._setItsProducteur(this);
            }
        _addItsFournisseurEnergie(p_FournisseurEnergie);
    }
    
    //## auto_generated 
    public void _removeItsFournisseurEnergie(FournisseurEnergie p_FournisseurEnergie) {
        itsFournisseurEnergie.remove(p_FournisseurEnergie);
    }
    
    //## auto_generated 
    public void removeItsFournisseurEnergie(FournisseurEnergie p_FournisseurEnergie) {
        if(p_FournisseurEnergie != null)
            {
                p_FournisseurEnergie.__setItsProducteur(null);
            }
        _removeItsFournisseurEnergie(p_FournisseurEnergie);
    }
    
    //## auto_generated 
    public void _clearItsFournisseurEnergie() {
        itsFournisseurEnergie.clear();
    }
    
    //## auto_generated 
    public void clearItsFournisseurEnergie() {
        ListIterator<FournisseurEnergie> iter = itsFournisseurEnergie.listIterator();
        while (iter.hasNext()){
            (itsFournisseurEnergie.get(iter.nextIndex()))._clearItsProducteur();
            iter.next();
        }
        _clearItsFournisseurEnergie();
    }
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/Modele/Producteur.java
*********************************************************************/

