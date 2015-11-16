package View;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;


/**
 * 
 * @author GRobert
 * LEDs de la passerelle. Indique si la passerelle est connectée a ses compteurs, et si un signal de reveil est recu  
 *
 */
public class LED extends JPanel {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel led1,led2;
	
	public LED(){
		this.setLayout(new GridLayout(2,1));
		this.led1 = new JLabel("•");
		this.led2 = new JLabel("•");
		led1.setForeground(Color.GREEN);
		led2.setForeground(Color.RED);
		
//		This is bullshit		
//		led1.setMinimumSize(new Dimension(50,50));
//		led1.setMaximumSize(new Dimension(100,100));
		
		
		this.add(led1);
		this.add(led2);
	}
	
	
}
