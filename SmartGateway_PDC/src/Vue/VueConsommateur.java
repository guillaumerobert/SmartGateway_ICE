package Vue;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.itextpdf.text.DocumentException;

import Modele.Consommateur;
import Modele.Compteur;


public class VueConsommateur extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel titre,conso,compteur,releveHC,releveHP,releveTotal,coutUnitaire,totalTTC,
					compteurValeur, releveHCValeur, releveHPValeur, releveTotalValeur, coutUnitaireValeur, totalTTCValeur;
	private JPanel haut, corps, bas;
	private Vector<String> vectorMois;
	private JComboBox<String> listeMois;
	private String mois, nomComplet, compteurValeurString, releveHCValeurString, releveHPValeurString, releveTotalValeurString, coutUnitaireValeurString, totalTTCValeurString;
	private JButton btnEditer;
	private ArrayList<Compteur> compteursDuUserParMois;
	private Consommateur c;
	
	public VueConsommateur(Consommateur pC, ArrayList<Compteur> pCompteursDuUserParMois){
			
			this.c = pC;	
			this.compteursDuUserParMois = pCompteursDuUserParMois;
			this.mois = "JANVIER";
			
			this.vectorMois = new Vector<>();
			
			this.vectorMois.add("Janvier");
			this.vectorMois.add("Février");
			this.vectorMois.add("Mars");
			this.vectorMois.add("Avril");
			this.vectorMois.add("Mai");
			this.vectorMois.add("Juin");
			this.vectorMois.add("Juillet");
			this.vectorMois.add("Août");
			this.vectorMois.add("Septembre");
			this.vectorMois.add("Octobre");
			this.vectorMois.add("Novembre");
			this.vectorMois.add("Décembre");
	}
	
	public void draw() {
			this.setLayout(new BorderLayout());
			
			haut = new JPanel();
			haut.setLayout(new GridLayout(2,1));
			
			corps = new JPanel();
			corps.setLayout(new GridLayout(6,2));
			
			bas = new JPanel();
			bas.setLayout(new FlowLayout());
			
			nomComplet = c.getNom() + " " + c.getPrenom();
			
			titre = new JLabel("Hello " + nomComplet);
			titre.setFont(new Font("Arial", Font.BOLD, 25));
			conso = new JLabel("-- Votre consommation du mois de " + mois + " --");
			this.mettreEnGras(conso);
			
			compteur = new JLabel("Compteur numéro : ");
			compteurValeurString = Integer.toString(c.getItsCompteur().getNumeroCompteur());
			compteurValeur = new JLabel(compteurValeurString);
			this.mettreEnGras(compteurValeur);
			
			releveHC = new JLabel("Heures Creuses : ");
			releveHCValeurString = Double.toString(c.getItsCompteur().getConsoHCMois()); // A REMPLA PAR LES DATA DU RRC MODEL
			//releveHCValeurString = this.consoHeuresCreusesDuMoisDe(0);
			releveHCValeur = new JLabel(releveHCValeurString);
			this.mettreEnGras(releveHCValeur);
			
			releveHP = new JLabel("Heures Pleines : ");
			releveHPValeurString = Double.toString(c.getItsCompteur().getConsoHeuresPleines()); // A REMPLA PAR LES DATA DU RRC MODEL
			//releveHPValeurString = this.consoHeuresPleinesDuMoisDe(0);
			
			releveHPValeur = new JLabel(releveHPValeurString);
			this.mettreEnGras(releveHPValeur);
			
			releveTotal = new JLabel("Total consommés en h : ");
			releveTotalValeurString = Double.toString(c.getItsCompteur().getConsoTotale());
			//releveTotalValeurString = this.consoHeuresTotalesDuMoisDe(0);
			releveTotalValeur = new JLabel(releveTotalValeurString);
			this.mettreEnGras(releveTotalValeur);
			
			coutUnitaire = new JLabel("Cout unitaire TTC du kw/h : ");
			coutUnitaireValeurString = Double.toString(c.getItsFournisseurEnergie().getTarif());
			coutUnitaireValeur = new JLabel(coutUnitaireValeurString);
			this.mettreEnGras(coutUnitaireValeur);
			
			totalTTC = new JLabel("Total TTC en € : ");
			totalTTCValeurString = c.getTotalPrixMensuel();
			totalTTCValeur = new JLabel(totalTTCValeurString);
			this.mettreEnGras(totalTTCValeur);
			
			btnEditer = new JButton("Editer facture");
			btnEditer.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					Facture _f = new Facture(mois, nomComplet, compteurValeurString, releveHCValeurString, releveHPValeurString, releveTotalValeurString, coutUnitaireValeurString, totalTTCValeurString);
					
					try {
						_f.genererFacture();
						System.out.println("Facture générée avec succès.");
					} catch (MalformedURLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (DocumentException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				
			});
			
			this.listeMois = new JComboBox<>(vectorMois);
			this.listeMois.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					mois = vectorMois.get(listeMois.getSelectedIndex()).toUpperCase();
					conso.setText("Votre consommation du mois de " + mois);
					
					releveHCValeurString = consoHeuresCreusesDuMoisDe(listeMois.getSelectedIndex());
					releveHCValeur.setText(releveHCValeurString);
					
					releveHPValeurString = consoHeuresPleinesDuMoisDe(listeMois.getSelectedIndex());
					releveHPValeur.setText(releveHPValeurString);
					
					releveTotalValeurString = consoHeuresTotalesDuMoisDe(listeMois.getSelectedIndex());
					releveTotalValeur.setText(releveTotalValeurString);
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
	
	private String consoHeuresCreusesDuMoisDe(int pNumMois) {
		return Double.toString(c.getItsCompteur().getConsoHCMois());
		//return Double.toString(compteursDuUserParMois.get(pNumMois).getConsoHeuresCreuses());
	}
	
	private String consoHeuresPleinesDuMoisDe(int pNumMois) {
		return Double.toString(c.getItsCompteur().getConsoHPMois());
		//return Double.toString(compteursDuUserParMois.get(pNumMois).getConsoHeuresPleines());
	}
	
	private String consoHeuresTotalesDuMoisDe(int pNumMois) {
		return Double.toString(c.getItsCompteur().getConsoHCMois() + c.getItsCompteur().getConsoHPMois());
		//return Double.toString(compteursDuUserParMois.get(pNumMois).getConsoTotale());
	}
}