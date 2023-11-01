package fr.pantheonsorbonne.cri;

import java.util.Random;

public abstract class Chiffre1a9 extends Joueur {

    public Chiffre1a9(String nom) {
        super(nom);
    }

    @Override
    public void demanderChiffre(Grille grille) {
        do {
            super.chiffre = new Random().nextInt(9) + 1; // génère un chiffre entier aléatoire entre 1 et 9
        } while (!estChiffreValide(grille));
        System.out.println("Vous avez choisi le chiffre: " + super.chiffre);
    }

    @Override
    public boolean estChiffreValide(Grille grille) {
        if (super.chiffre <= 9 && super.chiffre >= 1 && (!grille.chiffreExiste(super.chiffre))) {
            return true;
        }
        return false;
    }

    @Override
    public abstract boolean aGagne(Grille grille, int[] cellule);

}
