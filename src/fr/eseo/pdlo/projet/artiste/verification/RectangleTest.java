package fr.eseo.pdlo.projet.artiste.verification.modele;

import fr.eseo.pdlo.projet.artiste.modele.formes.Rectangle;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(0, 0, 8, 9);
		
		double aire = rectangle.aire();
		System.out.println("L'aire du rectangle vaut: " + aire);
		
		double perimetre = rectangle.perimetre();
		System.out.println("Le perimetre du rectangle vaut: " + perimetre);
	}
}
