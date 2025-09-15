package fr.eseo.pdlo.projet.artiste.verification.modele;

import fr.eseo.pdlo.projet.artiste.modele.formes.Coordonnees;

public class CoordonneesTest {
	
	public static void main(String[] args) {
		Coordonnees coord1 = new Coordonnees(3.5, 4.8);
		Coordonnees coord2 = new Coordonnees(8.4, 9.6);
		
		System.out.println(coord1.toString());
		System.out.println(coord2);
		
		coord2.deplacerVers(5,3);
        
        System.out.println(coord2);
        
        coord2.deplacerDe(-0.5,3.25);
        
        System.out.println(coord2);
        
        System.out.println("La distance vaut: " + coord1.distanceVers(coord2));
        
        System.out.println("L'angle vaut: " + coord1.angleVers(coord2) + "en degre");
	}
}