package Vue;
import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Controleur.RRC;
import Modele.FournisseurEnergie;

public class ParameterFrame extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel mainPanel, titlePanel, pricePanel, editPanel;
	private JLabel lTitre, lPrix, lMonnaie;
	private JTextField prix;
	private JButton bEditer;
	
	/*
	 * A METTRE DANS LE MAIN
	 */
	
	/*GlobalPane gp = new GlobalPane();
	MainFrame fen = new MainFrame(gp);
	RRC rrc = new RRC();
	ParameterFrame pf = new ParameterFrame(rrc.getItsFournisseurEnergie());
	
	fen.pack();
	fen.setVisible(true);
	fen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	pf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	pf.setSize(400, 200);
	pf.setResizable(false);
	pf.setVisible(true);*/
	
	public ParameterFrame(FournisseurEnergie _fe){
		
		this.setLayout(new BorderLayout());

		mainPanel = new JPanel();
		titlePanel = new JPanel();
		pricePanel = new JPanel();
		editPanel = new JPanel();
		
		lTitre = new JLabel("<html><body><h1>Paramétrage facture</h1></body></html>");
		lPrix = new JLabel("Prix");
		lMonnaie = new JLabel("€/kWh");
		prix = new JTextField(10);
		bEditer = new JButton("Editer facture");
		
		prix.setText(Integer.toString(_fe.getTarifElec()));
		
		mainPanel.add(titlePanel, BorderLayout.NORTH);
		mainPanel.add(pricePanel, BorderLayout.CENTER);
		mainPanel.add(editPanel, BorderLayout.SOUTH);
		
		titlePanel.add(lTitre);
		pricePanel.add(lPrix);
		pricePanel.add(prix);
		pricePanel.add(lMonnaie);
		editPanel.add(bEditer);
		
		this.add(mainPanel);
		
	}

}
