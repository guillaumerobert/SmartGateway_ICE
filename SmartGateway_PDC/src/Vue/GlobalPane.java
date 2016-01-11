package Vue;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

import Controleur.ControleurDisplay;
import Controleur.ControleurLED;


public class GlobalPane extends JPanel{
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel titlePanel;
	private JLabel title;
	private ControleurDisplay ctrlDisplay;
	private ControleurLED ctrlLED;
	private Display gatewayDisplay;

	public GlobalPane(ControleurDisplay _ctrlDisplay, ControleurLED _ctrlLED){
		
		ctrlDisplay = _ctrlDisplay;
		ctrlLED = _ctrlLED;
		setLayout(new BorderLayout());
		setOpaque(true);
		this.setBackground(new Color(173,183,189));
		
		//setBackground(Color.BLACK);

// SetFont pourri :		
//		title=new JLabel("<html><body><h1 "
//				+ "style ='color: red; "
//				+ "font-family: 'Lato', sans-serif; "
//				+ "font-size: 54px; font-weight: 300; "
//				+ "line-height: 58px; "
//				+ "margin: 0 0 58px;"
//				+ "'>SmartGateway RTTS</h1></body></html>");
		
		// FIXME : Trouver une bonne font java sans passer par le html
		title = new JLabel("SmartGateway RTTS");
		title.setFont(new Font("Serif",Font.BOLD,25));
		
		
		titlePanel = new JPanel();
		titlePanel.add(title);
		
		gatewayDisplay = new Display(ctrlDisplay);
		
		// TODO : Panel LEDs
		JPanel panelLed = new JPanel();
		panelLed.setOpaque(true);
		panelLed.add(new JLabel("<html><body><h2 style='color:orange;'>TODO <br>LEDS</h2></body></html>"));
		
		this.add(titlePanel, BorderLayout.NORTH);
		this.add(gatewayDisplay,BorderLayout.CENTER );
		this.add(panelLed, BorderLayout.EAST);
		
	}
	
	

}