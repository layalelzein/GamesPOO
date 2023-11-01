package fr.pantheonsorbonne.cri;

import java.util.Random;

public abstract class Joueur {
    protected String nom;
    protected int chiffre;

    public Joueur(String nom) {
        this.nom = nom;
        chiffre=0;
    }

    public String getNom() {
        return nom;
    }

    public void jouer(Grille grille, int [] cellule){
        demanderCase(grille, cellule);
        demanderChiffre(grille);
        grille.setCase(cellule[0], cellule[1], chiffre);
    }

    // Demander au joueur de choisir une case
    public void demanderCase(Grille grille, int [] cellule){
        do{
            cellule[0]=new Random().nextInt(3);
            cellule[1]=new Random().nextInt(3);
        }while(!grille.estCaseVide(cellule[0],cellule[1]));
        System.out.println("Vous avez choisi la case "+cellule[0]+":"+cellule[1]);
    }

    // Demander au joueur de choisir un chiffre
    public abstract void demanderChiffre(Grille grille);

    // Méthode pour vérifier si un chiffre est valide
    public abstract boolean estChiffreValide(Grille grille);

    public abstract boolean aGagne(Grille grille, int[] cellule);
}
