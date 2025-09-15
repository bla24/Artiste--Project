package fr.eseo.pdlo.projet.artiste.modele.formes;

//import fr.eseo.pdlo.projet.artiste.modele.formes.Coordonnees;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class Coordonnees {
	
	public static final double ABSCISSE_PAR_DEFAUT = 0.0;
	public static final double ORDONNEE_PAR_DEFAUT = 0.0;
	
	
	private double abscisse;
	private double ordonnee;
	
	public Coordonnees() {
		this(ABSCISSE_PAR_DEFAUT, ORDONNEE_PAR_DEFAUT);
	}

	public Coordonnees(double abscisse, double ordonnee) {
		this.abscisse = abscisse;
		this.ordonnee = ordonnee;
	}
	public double getAbscisse() {
		return abscisse;
	}
	public void setAbscisse(double abscisse){
		this.abscisse = abscisse;
	}
	public double getOrdonnee() {
		return ordonnee;
	}
	public void setOrdonnee(double ordonnee){
		this.ordonnee = ordonnee;
	}
	public void deplacerDe(double deltaX, double deltaY){
		this.abscisse += deltaX;
		this.ordonnee += deltaY;
	}
	public void deplacerVers(double nouvelleAbscisse, double nouvelleOrdonnee){
		this.abscisse = nouvelleAbscisse;
		this.ordonnee = nouvelleOrdonnee;
	}
	public double angleVers(Coordonnees autreCoordonnees){
		double rad = Math.atan2(autreCoordonnees.ordonnee - this.ordonnee, autreCoordonnees.abscisse - this.abscisse);
		double deg = Math.toDegrees(rad);
		return deg;
	}
	public double distanceVers(Coordonnees autreCoordonnees){
		return Math.hypot(autreCoordonnees.abscisse - this.abscisse, autreCoordonnees.ordonnee - this.ordonnee);
	}
	
	public String toString() {
		DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.FRANCE);
        DecimalFormat df = new DecimalFormat("0.0#");
        df.setDecimalFormatSymbols(symbols);
        return "(" + df.format(this.abscisse) + "," + df.format(this.ordonnee) + ")";
    }
}
