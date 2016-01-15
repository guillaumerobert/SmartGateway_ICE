package Vue;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class PanelLEDVerte extends JPanel {

	
	private JLabel labelReveil;
	
	public PanelLEDVerte() 
	{	
		setLayout(null);
		labelReveil = new JLabel("Statut du reveil");
		labelReveil.setHorizontalAlignment(SwingConstants.CENTER);
		labelReveil.setBounds(44, 31, 91, 14);
		this.add(labelReveil);
		this.setPreferredSize(new Dimension(181, 195));
	}
	
	public void paintComponent(Graphics g)
    {
    	g.setColor(Color.GREEN);
    	g.drawOval(60,60,60,60);
    }
}
