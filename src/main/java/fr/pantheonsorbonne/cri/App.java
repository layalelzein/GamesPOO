package fr.pantheonsorbonne.cri;

import java.util.Scanner;

public final class App {

    private App() {

    };
    
    public static void main(final String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("À quel jeu voulez-vous jouer?: \n0 : Somme 15\n1 : Course à 3\n2 : Atteindre 10\n4 : Bataille de Parité\n4 : Échelle de Trois");
        int rep=sc.nextInt();
        if(rep==0){
            System.out.println("Vous avez choisi le  jeu Somme 15");
            JoueurSomme15 joueur1= new JoueurSomme15("mayane");
            JoueurSomme15 joueur2= new JoueurSomme15("odelia");
            Grille grille= new Grille();
            JeuSomme15 somme15= new JeuSomme15(grille,joueur1,joueur2);
            somme15.tourDesJoueurs();
        }

        sc.close();
    }
}
