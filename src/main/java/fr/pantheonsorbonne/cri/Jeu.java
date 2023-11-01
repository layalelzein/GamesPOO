package fr.pantheonsorbonne.cri;

import java.util.Random;

public abstract class Jeu {
    protected Grille grille= new Grille();
    private Joueur joueur1;
    private Joueur joueur2;
    public static final int PREMIER_JOUEUR = new Random().nextInt(2); // Génère soit 0, soit 1

    public Jeu(Grille grille, Joueur joueur1, Joueur joueur2) {
        this.joueur1 = joueur1;
        this.joueur2 = joueur2;
        this.grille=grille;
    }

    public void tourDesJoueurs() {
        Joueur joueurActuel = (PREMIER_JOUEUR == 0) ? joueur1 : joueur2; //détermine quel joueur commence aléatoirement
        boolean partieTerminee = false;
        int coupsJoues = 0;
        System.out.println("Le joueur " + joueurActuel.getNom() + " commence.");
        int nbCoupMax= Grille.DIMENSION_GRILLE*Grille.DIMENSION_GRILLE; // 9 coups maximum pour une grille 3x3

        System.out.println("Grille initiale:\n");
        grille.afficherGrille();

        //Tant qu'aucun joueur ne gagne et quela grille n'est pas remplie
        while (!partieTerminee && coupsJoues < nbCoupMax) {
            System.out.println("\nTour de " + joueurActuel.getNom());

            int [] cellule= new int[2];

            joueurActuel.jouer(grille,cellule);
            coupsJoues++;

            // Vérifier si le joueur actuel a gagné
            if (joueurActuel.aGagne(grille,cellule)) {
                partieTerminee = true;
                System.out.println(joueurActuel.getNom() + " a gagné !");
            }

            grille.afficherGrille();
            // Passer au joueur suivant
            joueurActuel = (joueurActuel == joueur1) ? joueur2 : joueur1;
        }

        if (!partieTerminee) {
            System.out.println("La partie est un match nul !");
        }

    }

}