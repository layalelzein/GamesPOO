package fr.pantheonsorbonne.cri;

import java.util.Random;
import java.util.Scanner;

public class Jeu2Joueurs {
    private Grille grille;
    private Joueur joueur1;
    private Joueur joueur2;
    public static final int PREMIER_JOUEUR = new Random().nextInt(2); // Génère soit 0, soit 1

    Scanner sc = new Scanner(System.in);


    public Jeu2Joueurs(Joueur joueur1, Joueur joueur2) {
        grille = new Grille();
        this.joueur1 = joueur1;
        this.joueur2 = joueur2;
    }

    public void jouer() {
        Joueur joueurActuel = (PREMIER_JOUEUR == 0) ? joueur1 : joueur2; //détermine quel joueur commence aléatoirement
        boolean partieTerminee = false;
        int coupsJoues = 0;
        System.out.println("Le joueur " + joueurActuel.getNom() + " commence.");
        int nbCoupMax= Grille.DIMENSION_GRILLE*Grille.DIMENSION_GRILLE; // 9 coups maximum pour une grille 3x3

        //Tant qu'aucun joueur ne gagne et quela ggrille n'est pas remplie
        while (!partieTerminee && coupsJoues < nbCoupMax) {
            System.out.println("Tour de " + joueurActuel.getNom());
            grille.afficherGrille();

            // Demander au joueur de choisir une case et un chiffre
            System.out.print("Choisissez une ligne (0, 1 ou 2) : ");
            int ligne = sc.nextInt();
            System.out.print("Choisissez une colonne (0, 1 ou 2) : ");
            int colonne = sc.nextInt();
            System.out.print("Choisissez un chiffre (1-9) : ");
            int chiffre = sc.nextInt();

            joueurActuel.choisirCase(grille, ligne, colonne, chiffre);

            coupsJoues++;

            // Vérifier si le joueur actuel a gagné
            if (grille.aGagne(joueurActuel)) {
                partieTerminee = true;
                System.out.println(joueurActuel.getNom() + " a gagné !");
            }

            // Passer au joueur suivant
            joueurActuel = (joueurActuel == joueur1) ? joueur2 : joueur1;
        }

        if (!partieTerminee) {
            System.out.println("La partie est un match nul !");
        }

        grille.afficherGrille();
        sc.close();
    }*/

    /*public static void main(String[] args) {
        Jeu2Joueurs jeu = new Jeu2Joueurs();
        jeu.jouer();
    }*/
}