package Vue;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

public class PanelLEDRouge extends JPanel {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public PanelLEDRouge() 
	{
		this.setPreferredSize(new Dimension(50,50));
	}
	
	public void paintComponent(Graphics g)
    {
    	g.setColor(Color.RED);
    	g.fillOval(60,60,60,60);

    }

}
