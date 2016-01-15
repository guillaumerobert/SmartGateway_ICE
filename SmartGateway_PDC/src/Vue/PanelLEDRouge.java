package Vue;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class PanelLEDRouge extends JPanel {
	
	private JLabel labelEnLigne;
	
	
	public PanelLEDRouge() 
	{
		setLayout(null);
		labelEnLigne = new JLabel("Statut en ligne");
		labelEnLigne.setHorizontalAlignment(SwingConstants.CENTER);
		labelEnLigne.setBounds(40, 25, 86, 14);
		this.add(labelEnLigne);
		this.setPreferredSize(new Dimension(50,50));
	}
	
	public void paintComponent(Graphics g)
    {
    	g.setColor(Color.RED);
    	g.drawOval(60,60,60,60);
    }

}
