package Vue;

import javax.swing.*;

import Controleur.ControleLogin;
import Modele.Utilisateur;

import java.awt.*;
import java.awt.event.*;

public class LoginDialog extends JDialog {
   /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JTextField login;
	private JTextField password;
	private JPanel pan_principal, pan_label, pan_textField, pan_button;
	private JButton ok, annuler;
	private Utilisateur logger;
	private ControleLogin ctrlL;
   
	public LoginDialog(ControleLogin _ctrlL) {
		this.ctrlL = _ctrlL;
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
    	
    	if (logger != null) {
    		System.out.println("YES existe");
    	} else {
    		System.err.println("N existe pas");
    	}
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
}
