# 🎨 Être un Artiste – Éditeur Graphique en Java  

## 📌 Description  
**Être un Artiste** est un éditeur graphique développé en **Java** suivant l’architecture **MVC (Modèle – Vue – Contrôleur)**.  
Inspiré de logiciels comme *MS Paint*, *Dia* ou *Inkscape*, il permet de tracer, modifier et enregistrer des dessins numériques composés de formes géométriques.  

## 🚀 Fonctionnalités  
- ✏️ Tracer des **formes géométriques** : lignes, ellipses, cercles (extensible vers rectangles, carrés, étoiles…).  
- 📐 Calcul automatique de l’**aire, du périmètre, des coordonnées et des angles**.  
- 🎯 Détection de point dans une forme (`contient`).  
- 🌈 Gestion des **couleurs** via l’interface `Coloriable`.  
- 🖌️ **Remplissage des formes** (aucun ou uniforme) avec l’interface `Remplissable`.  
- 💾 **Sauvegarde et ouverture** de dessins.  

## 🛠️ Architecture  
Le projet repose sur le modèle **MVC** :  
- **Modèle** → gestion des données (coordonnées, formes, couleurs, remplissage).  
- **Vue** → affichage graphique et interaction utilisateur.  
- **Contrôleur** → gestion des actions (dessin, sélection, modification).  

## 📂 Organisation du code  
fr.eseo.pdlo.projet.artiste
├── modele → Coordonnees, Forme, Ligne, Ellipse, Cercle, interfaces
├── vue → affichage graphique
├── controleur → gestion des actions utilisateur
├── verification → tests JUnit

markdown
Copier le code

## ✅ Tests  
Chaque classe du modèle est validée par des **tests unitaires JUnit** :  
- `CoordonneesTest`  
- `LigneTest`  
- `EllipseTest`  
- `CercleTest`
- `RectangleTest`

## 🔮 Extensions possibles  
- ➕ Ajout de nouvelles formes (rectangle, carré, polygone…).  
- 🖼️ Remplissages avancés (motifs, images, dégradés).  
- 📤 Export des dessins en différents formats d’image.  

---

👨‍💻 Projet réalisé dans le cadre d’un bureau d’études – Septembre 2025.  
