package Vue;

import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Controleur.ControleurPasserelle;


public class GlobalPane extends JPanel{
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel titlePanel;
	private JLabel title;
	private ControleurPasserelle ctrlPass;
	private Display gatewayDisplay;

	
	public GlobalPane(ControleurPasserelle ctrlP){
		ctrlPass = ctrlP;
		setLayout(new BorderLayout());
		title=new JLabel("<html><body><h1>SmartGateway RTTS</h1></body></html>");
		titlePanel = new JPanel();
		titlePanel.add(title);
		
		gatewayDisplay = new Display(ctrlPass);
		
		this.add(titlePanel, BorderLayout.NORTH);
		this.add(gatewayDisplay,BorderLayout.CENTER );

		
	}
	
	

}