/*********************************************************************
	Rhapsody	: 8.1.3
	Login		: Guillaume Robert
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: VueLogin
//!	Generated Date	: Fri, 15, Jan 2016 
	File Path	: DefaultComponent/DefaultConfig/Vue/VueLogin.java
*********************************************************************/

package Vue;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

//## link itsControleLogin 
import Controleur.ControleLogin;
import Controleur.ControleurDisplay;
import Controleur.ControleurFournisseur;
import Controleur.ControleurLED;
import Controleur.RRC;
import Modele.Passerelle;
import Modele.Utilisateur;

//----------------------------------------------------------------------------
// Vue/VueLogin.java                                                                  
//----------------------------------------------------------------------------

//## package Vue 


//## class VueLogin 
public class VueLogin extends JDialog {
    
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected ControleLogin itsControleLogin;		//## link itsControleLogin 

    private JTextField login;
	private JTextField password;
    
	private JPanel pan_principal, pan_label, pan_textField, pan_button;
	private JButton ok, annuler;
	private Utilisateur logger;
	private ControleLogin ctrlL;
	private ControleurDisplay ctrlDisplay;
	private ControleurLED ctrlLED;
	private ControleurFournisseur ctrlFournisseur;
	private Passerelle gateway;
	
	private RRC rrc;
   
	
	// Constructors
    
    //## auto_generated 
	  
	public VueLogin(ControleLogin _ctrlL, RRC _rrc, ControleurDisplay _ctrlDisplay, ControleurLED _ctrlLED, ControleurFournisseur _ctrlFournisseur, Passerelle _gateway) {
		this.ctrlL = _ctrlL;
		this.rrc = _rrc;
		this.ctrlDisplay = _ctrlDisplay;
		this.ctrlLED = _ctrlLED;
		this.ctrlFournisseur = _ctrlFournisseur;
		this.gateway = _gateway;
		init();
	}
   
	private void init() {
		
      setTitle("Identification" );
      pan_principal = new JPanel(new BorderLayout());
      pan_label = new JPanel(new GridLayout(2,1));
      pan_textField = new JPanel(new GridLayout(2,1));
      pan_button = new JPanel(new GridLayout(1,2));
      pan_principal.add(pan_label, BorderLayout.WEST);
      pan_principal.add(pan_textField, BorderLayout.CENTER);
      pan_principal.add(pan_button, BorderLayout.SOUTH);
      pan_label.add(new JLabel(" Login  " ));
      pan_label.add(new JLabel(" Password  " ));
      ok = new JButton("OK" );
      annuler = new JButton("Annuler");
      
      ok.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
   
    	logger = ctrlL.login(login.getText(), password.getText());
    	ctrlL.gererAuthentification(logger, rrc, ctrlDisplay, ctrlLED, ctrlFournisseur, gateway);
    }
 });
 
      annuler.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
       System.exit(0);
    }
 });
     
      pan_button.add(annuler);
      pan_button.add(ok);
      login = new JTextField(20);
      password = new JPasswordField(20);
      login.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
       password.requestFocus();
    }
 });
      password.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
       ok.doClick(300);
    }
 });
      pan_textField.add(login);
      pan_textField.add(password);
     
      this.setContentPane(pan_principal);
      this.pack();
   }
	
	//## auto_generated 
    public ControleLogin getItsControleLogin() {
        return itsControleLogin;
    }
    
    //## auto_generated 
    public void setItsControleLogin(ControleLogin p_ControleLogin) {
        itsControleLogin = p_ControleLogin;
    }
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/Vue/VueLogin.java
*********************************************************************/

