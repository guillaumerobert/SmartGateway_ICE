package Vue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import Controleur.ControleurFournisseur;
import Controleur.RRC;
import Modele.Passerelle;

/**
 * 
 * @author Grobert
 * Fenetre principale de l'application
 *
 */
public class MainFrame extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JMenuBar menuBar;
	private JMenu menuEditer;
	private JMenuItem editer;
	private ParameterFrame pf;
	private ControleurFournisseur ctrlFournisseur;
	private RRC rrc;
	private Passerelle passerelle;
	
	public MainFrame(RRC _rrc, ControleurFournisseur _ctrlFournisseur, Passerelle _gateway){
		
		this.ctrlFournisseur = _ctrlFournisseur;
		this.passerelle = _gateway;
		this.rrc = _rrc;
		
		this.menuBar = new JMenuBar();
		this.menuEditer = new JMenu("Actions");
		this.editer = new JMenuItem("Editer facture");
		
		this.menuBar.add(menuEditer);
		this.menuEditer.add(editer);
		this.setJMenuBar(this.menuBar);
		
		editer.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				pf = new ParameterFrame(rrc, passerelle, ctrlFournisseur);
				
				pf.setSize(500, 500);
				//pf.setResizable(false);
				pf.setVisible(true);
			}
		});
	}

}
