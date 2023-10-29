package fr.pantheonsorbonne.cri;

public class GrilleSomme15 extends Grille{
    public GrilleSomme15() {
        super();
    }

    public boolean estChiffreValide(int chiffre){
        if(chiffre>=1&&chiffre<=9){
            return true;
        }
        return false;
    }
}
