package fr.pantheonsorbonne.cri;

public class JoueurSomme15 extends Chiffre1a9 {
    public JoueurSomme15(String nom) {
        super(nom);
    }

    @Override
    public boolean aGagne(Grille grille, int[] cellule) {
        int sommeLigne = 0;
        boolean gain = false;
        for (int i = 0; i < Grille.DIMENSION_GRILLE; i++) {
            if (grille.returnCase(cellule[0], i) == 0) {
                break;
            } else {
                sommeLigne += grille.returnCase(cellule[0], i);
            }
            if (sommeLigne == 15) {
                gain = true;
            }
        }
        int sommeColonne = 0;
        for (int i = 0; i < Grille.DIMENSION_GRILLE; i++) {
            if (grille.returnCase(i, cellule[1]) == 0) {
                break;
            } else {
                sommeColonne += grille.returnCase(i, cellule[1]);
            }
            if (sommeColonne == 15) {
                gain = true;
            }
        }

        if (grille.appartientADiago1(cellule[0], cellule[1], super.chiffre)) {
            int sommeDiago1 = 0;
            for (int i = 0; i < Grille.DIMENSION_GRILLE; i++) {
                if (grille.returnCase(i, i) == 0) {
                    break;
                } else {
                    sommeDiago1 += grille.returnCase(i, i);
                }
            }
            if (sommeDiago1 == 15) {
                gain = true;
            }
        }

        if (grille.appartientADiago2(cellule[0], cellule[1], super.chiffre)) {
            int sommeDiago2 = 0;
            for (int i = 0; i < Grille.DIMENSION_GRILLE; i++) {
                if (grille.returnCase(Grille.DIMENSION_GRILLE - i - 1, i) == 0) {
                    break;
                } else {
                    sommeDiago2 += grille.returnCase(Grille.DIMENSION_GRILLE - i - 1, i);
                }
            }
            if (sommeDiago2 == 15) {
                gain = true;
            }
        }
        return gain;
    }

}
