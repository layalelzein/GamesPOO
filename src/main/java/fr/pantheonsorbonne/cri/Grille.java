package fr.pantheonsorbonne.cri;

public class Grille {
    public static final int DIMENSION_GRILLE = 3;
    private int[][] grille;

    // Constructeur de la classe
    public Grille() {
        grille = new int[DIMENSION_GRILLE][DIMENSION_GRILLE]; // Initialise une grille de 3x3 cases avec des valeurs par défaut (0)
    }

    // Méthode pour afficher la grille
    public void afficherGrille() {
        for (int ligne = 0; ligne < DIMENSION_GRILLE; ligne++) {
            for (int colonne = 0; colonne < DIMENSION_GRILLE; colonne++) {
                System.out.print(grille[ligne][colonne] + " ");
            }
            System.out.println(); // Passer à la ligne suivante
        }
    }

    //Vérifie si la case est vide
    public boolean estCaseVide(int ligne, int  colonne){
        if(grille[ligne][colonne]==0){
            return true;
        }
        return false;
    }

    // Méthode pour insérer un chiffre dans une case de la grille
    public void setCase(int ligne,  int colonne, int chiffre) {
        grille[ligne][colonne]=chiffre;
    }

    public int returnCase(int ligne, int colonne){
        return grille[ligne][colonne];
    }

    // Vérifie si le chiffre existe déjà dans la grille
    public boolean chiffreExiste(int chiffre){
        for (int ligne = 0; ligne < Grille.DIMENSION_GRILLE; ligne++) {
            for (int colonne = 0; colonne < Grille.DIMENSION_GRILLE; colonne++) {
                if(chiffre== grille[ligne][colonne]){
                    return true;
                }
            }
        }
        return false;
    }

    public boolean appartientADiago1(int ligne,  int colonne, int chiffre){
        for(int i=0;i<DIMENSION_GRILLE;i++){
            if( (ligne==i&&colonne==i)){
                return true;
            }
        }
        return false;
    }

    public boolean appartientADiago2(int ligne,  int colonne, int chiffre){
        for(int i=0;i<DIMENSION_GRILLE;i++){
            if( (ligne==i&&colonne==DIMENSION_GRILLE-i-1)){
                return true;
            }
        }
        return false;
    }
}