package Vue;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Modele.Consommateur;


public class VueConsommateur extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel titre,conso,compteur,releveHC,releveHP,releveTotal,coutUnitaire,totalTTC,aReglerAvant,
					compteurValeur, releveHCValeur, releveHPValeur, releveTotalValeur, coutUnitaireValeur, totalTTCValeur;
	private JPanel haut, corps, bas;
	private Vector<String> vectorMois;
	private JComboBox<String> listeMois;
	private String mois, nomComplet, compteurValeurString, releveHCValeurString, releveHPValeurString, releveTotalValeurString, coutUnitaireValeurString, totalTTCValeurString;
	private JButton btnEditer;
	
	public VueConsommateur(Consommateur c){
		
			this.setLayout(new BorderLayout());
			
			haut = new JPanel();
			haut.setLayout(new GridLayout(2,1));
			
			corps = new JPanel();
			corps.setLayout(new GridLayout(6,2));
			
			bas = new JPanel();
			bas.setLayout(new FlowLayout());
			
			nomComplet = c.getNom() + " " + c.getPrenom();
			mois = "JANVIER";
			
			titre = new JLabel("Hello " + nomComplet);
			titre.setFont(new Font("Arial", Font.BOLD, 25));
			conso = new JLabel("-- Votre consommation du mois de " + mois + " --");
			this.mettreEnGras(conso);
			
			compteur = new JLabel("Compteur numéro : ");
			compteurValeurString = Integer.toString(c.getItsCompteur().getNumeroCompteur());
			compteurValeur = new JLabel(compteurValeurString);
			this.mettreEnGras(compteurValeur);
			
			releveHC = new JLabel("Heures Creuses : ");
			releveHCValeurString = Double.toString(c.getItsCompteur().getConsoHeuresCreuses());
			releveHCValeur = new JLabel(releveHCValeurString);
			this.mettreEnGras(releveHCValeur);
			
			releveHP = new JLabel("Heures Pleines : ");
			releveHPValeurString = Double.toString(c.getItsCompteur().getConsoHeuresPleines());
			releveHPValeur = new JLabel(releveHPValeurString);
			this.mettreEnGras(releveHPValeur);
			
			releveTotal = new JLabel("Total : ");
			releveTotalValeurString = Double.toString(c.getItsCompteur().getConsoTotale());
			releveTotalValeur = new JLabel(releveTotalValeurString);
			this.mettreEnGras(releveTotalValeur);
			
			coutUnitaire = new JLabel("Cout unitaire TTC du kw/h : ");
			coutUnitaireValeurString = "x €";
			coutUnitaireValeur = new JLabel(coutUnitaireValeurString);
			this.mettreEnGras(coutUnitaireValeur);
			
			totalTTC = new JLabel("Total TTC : ");
			totalTTCValeurString = "x €";
			totalTTCValeur = new JLabel(totalTTCValeurString);
			this.mettreEnGras(totalTTCValeur);
			
			btnEditer = new JButton("Editer facture");
			btnEditer.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					Facture _f = new Facture(mois, nomComplet, compteurValeurString, releveHCValeurString, releveHPValeurString, releveTotalValeurString, coutUnitaireValeurString, totalTTCValeurString);
					_f.genererFacture();
				}
				
			});
			
			this.vectorMois = new Vector<>();
			vectorMois.add("Janvier");
			vectorMois.add("Février");
			vectorMois.add("Mars");
			vectorMois.add("Avril");
			vectorMois.add("Mai");
			vectorMois.add("Juin");
			vectorMois.add("Juillet");
			vectorMois.add("Août");
			vectorMois.add("Septembre");
			vectorMois.add("Octobre");
			vectorMois.add("Novembre");
			vectorMois.add("Décembre");
			
			this.listeMois = new JComboBox<>(vectorMois);
			this.listeMois.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					mois = vectorMois.get(listeMois.getSelectedIndex()).toUpperCase();
					conso.setText("Votre consommation du mois de " + mois);
				}
			});
			
			haut.add(titre);
			haut.add(listeMois);
			haut.add(conso);
			
			corps.add(compteur);
			corps.add(compteurValeur);
			corps.add(releveHC);
			corps.add(releveHCValeur);
			corps.add(releveHP);
			corps.add(releveHPValeur);
			corps.add(releveTotal);
			corps.add(releveTotalValeur);
			corps.add(coutUnitaire);
			corps.add(coutUnitaireValeur);
			corps.add(totalTTC);
			corps.add(totalTTCValeur);
			
			bas.add(btnEditer);
			
			this.add(haut, BorderLayout.NORTH);
			this.add(corps, BorderLayout.CENTER);
			this.add(bas, BorderLayout.SOUTH);
			
			this.setTitle("Mon espace");
	}
	
	private void mettreEnGras(JLabel _lab) {
		 _lab.setFont(new Font("Arial", Font.BOLD, 14));
	}
}