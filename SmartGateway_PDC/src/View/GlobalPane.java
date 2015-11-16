package View;

import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GlobalPane extends JPanel{
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel titlePanel;
	private JLabel title;
	private PasserellePanel gateway;

	
	public GlobalPane(){
		setLayout(new BorderLayout());
		title=new JLabel("<html><body><h1>SmartGateway RTTC</h1></body></html>");
		titlePanel = new JPanel();
		titlePanel.add(title);
		
		gateway = new PasserellePanel();

		this.add(titlePanel, BorderLayout.NORTH);
		this.add(gateway, BorderLayout.CENTER);

		
	}
	
	

}