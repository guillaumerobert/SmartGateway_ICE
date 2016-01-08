package Vue;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

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
	private GlobalPane globalPane;

	private JMenuBar menuBar;
	private JMenu menuEditer;
	private JMenuItem editer;
	
	public MainFrame(GlobalPane globalpane){
		this.menuBar = new JMenuBar();
		this.menuEditer = new JMenu("Actions");
		this.editer = new JMenuItem("Editer facture");
		
		this.menuBar.add(menuEditer);
		this.menuEditer.add(editer);
		this.setJMenuBar(this.menuBar);
		
		this.globalPane = globalpane;
		this.setContentPane(globalpane);
	}
	
	public GlobalPane getGlobalPane(){
		return this.globalPane;
	}

}
