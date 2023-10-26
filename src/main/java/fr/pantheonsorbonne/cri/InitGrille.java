public class InitGrille {
    private int[][] grille;

    // Constructeur de la classe
    public InitGrille() {
        grille = new int[3][3]; // Initialise une grille de 3x3 cases avec des valeurs par défaut (0)
    }

    // Méthode pour afficher la grille
    public void afficherGrille() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(grille[i][j] + " ");
            }
            System.out.println(); // Passer à la ligne suivante
        }
    }

    /*public static void main(String[] args) {
        InitGrille grille = new InitGrille(); // Crée une instance de la classe InitGrille
        grille.afficherGrille(); // Affiche la grille initiale
    }*/
}