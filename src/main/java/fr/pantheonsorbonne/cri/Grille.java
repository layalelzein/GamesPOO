package fr.pantheonsorbonne.cri;

public abstract class Grille {
    private int[][] grille;
    public static final int DIMENSION_GRILLE = 3;

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

    // Méthode pour insérer un chiffre dans une case de la grille aprés avoir vérifier que la case est bien vide
    public void setCase(int ligne,  int colonne, int chiffre) {//throws caseInvalideException
        if(estCaseVide(ligne,colonne)){
            grille[ligne][colonne]=chiffre;
        }else{
            System.out.println("Case invalide. Veuillez réessayer.");
            //throw caseInvalideException;
        }
    }

    //Vérifie si la case est vide
    public boolean estCaseVide(int ligne, int  colonne){
        if(grille[ligne][colonne]==0){
            return true;
        }
        return false;
    }


    // Vérifie si le chiffre existe déjà dans la grille
    public boolean chiffreExiste(int chiffre){
        for (int ligne = 0; ligne < DIMENSION_GRILLE; ligne++) {
            for (int colonne = 0; colonne < DIMENSION_GRILLE; colonne++) {
                if(chiffre== grille[ligne][colonne]){
                    return true;
                }
            }
        }
        return false;
    }

    public abstract boolean aGagne(Joueur j);
    
    /*public static void main(String[] args) {
        InitGrille grille = new InitGrille(); // Crée une instance de la classe InitGrille
        grille.afficherGrille(); // Affiche la grille initiale
    }*/
}