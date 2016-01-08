package Vue;

import java.awt.BorderLayout;
import java.awt.Color;

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
		setOpaque(true);
		this.setBackground(new Color(173,183,189));
		
		
		//setBackground(Color.BLACK);
		
		title=new JLabel("<html><body><h1 "
				+ "style ='color: red; "
				+ "font-family: 'Lato', sans-serif; "
				+ "font-size: 54px; font-weight: 300; "
				+ "line-height: 58px; "
				+ "margin: 0 0 58px;"
				+ "'>SmartGateway RTTS</h1></body></html>");
		
		
		titlePanel = new JPanel();
		titlePanel.add(title);
		
		gatewayDisplay = new Display(ctrlPass);
		
		this.add(titlePanel, BorderLayout.NORTH);
		this.add(gatewayDisplay,BorderLayout.CENTER );
		
	}
	
	

}