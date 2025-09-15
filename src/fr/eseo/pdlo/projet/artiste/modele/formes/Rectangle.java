package fr.eseo.pdlo.projet.artiste.modele.formes;

public class Rectangle extends Forme {
    private double largeur;
    private double hauteur;

    public Rectangle(double x, double y, double largeur, double hauteur) {
        super(new Coordonnees(x, y));
        this.largeur = largeur;
        this.hauteur = hauteur;
    }

    public double getLargeur() {
        return largeur;
    }

    public double getHauteur() {
        return hauteur;
    }

    public void setLargeur(double largeur) {
        this.largeur = largeur;
    }

    public void setHauteur(double hauteur) {
        this.hauteur = hauteur;
    }

    public double aire() {
        return largeur * hauteur;
    }

    public double perimetre() {
        return 2 * (largeur + hauteur);
    }
}
