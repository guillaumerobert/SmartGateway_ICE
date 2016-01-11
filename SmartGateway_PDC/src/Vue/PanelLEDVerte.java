package Vue;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

public class PanelLEDVerte extends JPanel {

	public PanelLEDVerte() 
	{	
		this.setPreferredSize(new Dimension(181, 195));
	}
	
	public void paintComponent(Graphics g)
    {
    	g.setColor(Color.GREEN);
    	g.fillOval(60,60,60,60);
    }
}
