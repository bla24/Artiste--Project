package fr.eseo.pdlo.projet.artiste.modele.formes;

import fr.eseo.pdlo.projet.artiste.modele.formes.Coordonnees;

public abstract class Forme {

    public static final double LARGEUR_PAR_DEFAUT = 100.0;
    public static final double HAUTEUR_PAR_DEFAUT = 50.0;
    
    private Coordonnees position;
    private double largeur;
    private double hauteur;
    
    public Forme(){
        this(new Coordonnees(), LARGEUR_PAR_DEFAUT, HAUTEUR_PAR_DEFAUT);
    }
    
    public Forme(Coordonnees position) {
        this(position, LARGEUR_PAR_DEFAUT, HAUTEUR_PAR_DEFAUT);
    }
    
    public Forme(double largeur, double hauteur){
        this(new Coordonnees(), largeur, hauteur);
    }
    
    public Forme(Coordonnees position, double largeur, double hauteur){
        this.setPosition(position);
        this.setLargeur(largeur);
        this.setHauteur(hauteur);
    }
    
    public Coordonnees getPosition(){
        return this.position;
    }
    
    public double getLargeur(){
        return largeur;
    }
    
    public double getHauteur(){
        return hauteur;
    }
    
    public void setPosition(Coordonnees position){
        this.position = position;
    }
    
    public void setLargeur(double largeur){
        this.largeur = largeur;
    }
    
    public void setHauteur(double hauteur){
        this.hauteur = hauteur;
    }

    public void deplacerDe(double deltaX, double deltaY){
        this.position.deplacerDe(deltaX, deltaY);
    }
    
    public void deplacerVers(double nouvelleAbscisse, double nouvelleOrdonnee){
        this.position.deplacerVers(nouvelleAbscisse, nouvelleOrdonnee);
    }
    
    public double getMinX(){
        return Math.min(position.getAbscisse(), position.getAbscisse()+this.getLargeur());
    }
    
    public double getMinY(){
        return Math.min(position.getOrdonnee(), position.getOrdonnee()+this.getHauteur());
    }
    
    public double getMaxX(){
        return Math.max(position.getAbscisse(), position.getAbscisse()+this.getLargeur());
    }
    
    public double getMaxY(){
        return Math.max(position.getOrdonnee(), position.getOrdonnee()+this.getHauteur());
    }
    
    public abstract double aire();
    
    public abstract double perimetre();
}
