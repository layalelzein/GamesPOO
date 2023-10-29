package fr.pantheonsorbonne.cri;

public abstract class Joueur {
    private String nom;

    public Joueur(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    // Méthode pour vérifier si un chiffre est valide
    public abstract boolean chiffreValide(int chiffre);

    // Méthode pour choisir une case et la remplir avec un chiffre
    public void choisirCase(Grille grille, int ligne, int colonne, int chiffre) { //throws  chiffreInvalideException
        if (chiffreValide(chiffre)) {
            grille.setCase(ligne, colonne, chiffre); //renvoie une erreur si la case n'est pas valide
        } else {
            System.out.println("Chiffre invalide. Veuillez réessayer.");
            //throw chiffreInvalideException;
        }
    }

}
