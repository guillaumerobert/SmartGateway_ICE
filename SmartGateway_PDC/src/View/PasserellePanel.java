package View;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

import java.awt.BorderLayout;

import javax.swing.JLabel;

public class PasserellePanel extends JPanel {
	
	private JLabel gatewayRepresentation;
	private LED ledRepresentation;
	
	public PasserellePanel() {
		this.setLayout(new BorderLayout());
		
		this.gatewayRepresentation = new JLabel(new ImageIcon( "C:/Users/S219/Documents1/Gateway.jpg"));
		this.add(gatewayRepresentation, BorderLayout.CENTER);
		
		this.ledRepresentation = new LED();
		this.add(ledRepresentation, BorderLayout.EAST);
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
