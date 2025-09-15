package fr.eseo.pdlo.projet.artiste.verification.modele;


import fr.eseo.pdlo.projet.artiste.modele.formes.Coordonnees;

import fr.eseo.pdlo.projet.artiste.modele.formes.Ligne;

import fr.eseo.pdlo.projet.artiste.modele.formes.Forme;

public class LigneTest{

    public static void main(String [] args){
        Coordonnees c1 = new Coordonnees(10,5);
        double largeur = 25;
        double hauteur = 30;
        
        Ligne l1 = new Ligne();
        Ligne l2 = new Ligne(c1);
        Ligne l3 = new Ligne(largeur, hauteur);
        Ligne l4 = new Ligne(c1, largeur, hauteur);
        
        System.out.println(l1);
        System.out.println(l2);
        System.out.println(l3);
        System.out.println(l4);
        
        l1.deplacerVers(10,10);
        
        System.out.println(l1);
        
        l4.deplacerDe(-10,-5);
        
        System.out.println(l4);
        
        l4.setC2(new Coordonnees(5,5));
        
        System.out.println(l4);
        
        l4.setC1(new Coordonnees(2,9));
        
        System.out.println(l4);
    
    }

}

