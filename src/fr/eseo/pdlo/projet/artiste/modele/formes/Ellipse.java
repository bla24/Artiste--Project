package fr.eseo.pdlo.projet.artiste.modele.formes;

import java.text.DecimalFormat;

import fr.eseo.pdlo.projet.artiste.modele.formes.Coordonnees;
import fr.eseo.pdlo.projet.artiste.modele.formes.Forme;

public class Ellipse extends Forme{
    
    public Ligne(){
        super();
    }
    
    public Ligne(double largeur, double hauteur){
        super(largeur, hauteur);
    }
    
    public Ligne(Coordonnees position){
        super(position);
    }
    
    public Ligne(Coordonnees position, double largeur, double hauteur){
        super(position, largeur, hauteur);
    }
    
    public Coordonnees getC1(){
        return this.getPosition();
    }
    
    public Coordonnees getC2(){
        return new Coordonnees(getC1().getAbscisse()+getLargeur(), getC1().getOrdonnee()+getHauteur());
    }
    
    public void setC1(Coordonnees coordonnees){
        
        this.setLargeur(getC2().getAbscisse() - coordonnees.getAbscisse());
        this.setHauteur(getC2().getOrdonnee() - coordonnees.getOrdonnee());
        this.setPosition(coordonnees);
    }
    
    public void setC2(Coordonnees coordonnees){
        this.setLargeur(coordonnees.getAbscisse() - this.getPosition().getAbscisse());
        this.setHauteur(coordonnees.getOrdonnee() - this.getPosition().getOrdonnee());
    }
    
    public double aire(){
        return 0;
    }
    
    public double perimetre(){
        return Math.sqrt(Math.pow(getC2().getAbscisse()-getC1().getAbscisse(),2)+Math.pow(getC2().getOrdonnee()-getC1().getOrdonnee(),2));
    }
    
    public String toString(){
        DecimalFormat df = new DecimalFormat("0.0#");
        StringBuilder sb = new StringBuilder();
        sb.append("[Ligne] c1 : ");
        sb.append(getC1());
        sb.append(" c2 : ");
        sb.append(getC2());
        sb.append(" longeur : ");
        sb.append(df.format(perimetre()));
        sb.append(" angle : ");
        sb.append(df.format(getC1().angleVers(getC2())));
        sb.append("\u00B0");
        return sb.toString();
    }
}
