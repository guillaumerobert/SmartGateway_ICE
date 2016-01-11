package Vue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import Controleur.ControleurFournisseur;

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
	
	public MainFrame(ControleurFournisseur ctrlFournisseur){
		this.menuBar = new JMenuBar();
		this.menuEditer = new JMenu("Actions");
		this.editer = new JMenuItem("Editer facture");
		
		this.menuBar.add(menuEditer);
		this.menuEditer.add(editer);
		this.setJMenuBar(this.menuBar);
		
		editer.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO : Appeler ParameterFrame avec la liste des consommateurs en param
			}
		});
	}

}
