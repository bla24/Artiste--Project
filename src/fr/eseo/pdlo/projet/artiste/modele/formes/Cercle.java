package fr.eseo.pdlo.projet.artiste.modele.formes;

//import fr.eseo.pdlo.projet.artiste.modele.formes.Forme.Coordonnees;

public class Cercle extends Forme {
    private double rayon;

    public Cercle(double x, double y, double rayon) {
        super(new Coordonnees(x, y));
        this.rayon = rayon;
    }

    public double getRayon() {
        return rayon;
    }

    public void setRayon(double rayon) {
        this.rayon = rayon;
    }

    public double aire() {
        return Math.PI * rayon * rayon;
    }

    public double perimetre() {
        return 2 * Math.PI * rayon;
    }
}
