package Vue;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import Controleur.ControleurFournisseur;
import Controleur.RRC;
import Modele.Consommateur;
import Modele.Passerelle;

public class ParameterFrame extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel mainPanel, titlePanel, pricePanel, editPanel, consoPanel;
	private JLabel lTitre, lPrix, lMonnaie, lConso;
	private JList<String> listeConso;
	private Vector<String> vectorListeConsoString;
	private Vector<Consommateur> vectorListeConso;
	private JTextField prix;
	private JButton bEditer;
	private Consommateur c;
	private RRC rrc;
	private Passerelle gateway;
	
	public ParameterFrame(RRC _rrc, Passerelle _gate, ControleurFournisseur _cf){
		
		this.rrc = _rrc;
		this.gateway = _gate;
		this.vectorListeConso = rrc.getAllConsummers(gateway);
		this.vectorListeConsoString = new Vector<>();
		
		for (Consommateur c : this.vectorListeConso) {
			this.vectorListeConsoString.add(c.toString());
		}
		
		this.listeConso = new JList<>(vectorListeConsoString);
		this.listeConso.addListSelectionListener(new ListSelectionListener() {

			@Override
			public void valueChanged(ListSelectionEvent e) {
				c = vectorListeConso.get(listeConso.getSelectedIndex());
				prix.setText(Double.toString(c.getItsFournisseurEnergie().getTarif()));
			}
		});
		
		this.setLayout(new FlowLayout());
		
		mainPanel = new JPanel(new GridLayout(4,1));
		titlePanel = new JPanel();
		pricePanel = new JPanel();
		consoPanel = new JPanel();
		editPanel = new JPanel();
		
		lTitre = new JLabel("<html><body><h1>Paramétrage facture</h1></body></html>");
		lConso = new JLabel("Choisir consommateur");
		lPrix = new JLabel("Prix");
		lMonnaie = new JLabel("€/kWh");
		
		prix = new JTextField(10);
		bEditer = new JButton("Editer facture");
	
		titlePanel.add(lTitre);
		consoPanel.add(lConso);
		consoPanel.add(listeConso);
		pricePanel.add(lPrix);
		pricePanel.add(prix);
		pricePanel.add(lMonnaie);
		editPanel.add(bEditer);
		
		mainPanel.add(titlePanel);
		mainPanel.add(consoPanel);
		mainPanel.add(pricePanel);
		mainPanel.add(editPanel);
		
		this.add(mainPanel);
		
		bEditer.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				/*
				 * TODO : linker facture
				 */
			}
		});
	}

}
