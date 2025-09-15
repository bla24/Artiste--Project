package fr.eseo.pdlo.projet.artiste.verification.modele;

import fr.eseo.pdlo.projet.artiste.modele.formes.Forme;
import fr.eseo.pdlo.projet.artiste.modele.formes.Rectangle;
import fr.eseo.pdlo.projet.artiste.modele.formes.Cercle;

public class VerificationForme {
	
	public static void main(String[] args) {
		
		public static boolean estValide(Forme forme) {
			return forme.aire() > 0 && forme.perimetre() > 0;
		}
	}
}
