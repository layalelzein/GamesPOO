package fr.pantheonsorbonne.cri;

public class Jeu2JoueursSomme15 extends Jeu2Joueurs{
    private GrilleSomme15 grille=new GrilleSomme15();

    public Jeu2JoueursSomme15(GrilleSomme15 grille, Joueur joueur1, Joueur joueur2){
        this.grille=grille;
        super(joueur1,joueur2);
    }
}
