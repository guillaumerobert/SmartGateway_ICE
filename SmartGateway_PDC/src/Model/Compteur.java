package Model;
import java.util.Random;



/** 
 * 
 * @author Grobert
 * Classe Compteur : Simule un compteur d'electricité
 * Dispose des methodes de génération de relevé de consommation
 * Relevé pseudo aleatoire 
 *
 */
public class Compteur {
	
	private int numeroCompteur;
	private double consoHeuresCreuses;
	private double consoHeuresPleines;
	
	private double rangeMin;
	private double rangeMax;
	
	private Random generateur;
	
	public Compteur(){
		this.generateur = new Random();
		this.numeroCompteur = this.generateur.nextInt();
		this.rangeMin = 100.0;
		this.rangeMax = 10000.0;
		
		this.consoHeuresCreuses = rangeMin + (rangeMax - rangeMin) * generateur.nextDouble();
		this.consoHeuresPleines = rangeMin + (rangeMax - rangeMin) * generateur.nextDouble();
	}
	
	public double getHpConsumption(){
		return this.consoHeuresPleines;
	}
	
	public double getHcConsumption(){
		return this.consoHeuresCreuses;
	}
	
	/**
	 * Incremente aléatoirement la consommation effective , d'un maximum de 10 KWh
	 */
	public void consommer(){
		this.consoHeuresCreuses += (this.generateur.nextDouble() * 10);
		this.consoHeuresPleines += (this.generateur.nextDouble() * 10);
	}
	
	@Override
	public String toString(){
		return "Relevé Compteur N°"+this.numeroCompteur+" ::: HP:"+this.consoHeuresPleines+"KWh. HC:"+this.consoHeuresCreuses+"KWh.\n";
	}

}
