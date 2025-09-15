package fr.eseo.pdlo.projet.artiste.verification.modele;

import fr.eseo.pdlo.projet.artiste.modele.formes.Cercle;

public class CercleTest {
    public static void main(String[] args) {
        Cercle cercle = new Cercle(0, 0, 8);
		
		double aire = cercle.aire();
		System.out.println("L'aire du cercle vaut: " + aire);
		
		double perimetre = cercle.perimetre();
		System.out.println("Le perimetre du cercle vaut: " + perimetre);
	}
}
