package View;
import javax.swing.JFrame;

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
	
	public MainFrame(GlobalPane globalpane){
		this.globalPane = globalpane;
		this.setContentPane(globalpane);
	}
	
	public GlobalPane getGlobalPane(){
		return this.globalPane;
	}

}
