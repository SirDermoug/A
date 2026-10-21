package dermougah.at08;

import java.util.Scanner;
public class At08Ex13 {
    public static final float PI = 3.14159f;
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        char choix;
        
        System.out.println("Sélectionnez une figure en inscrivant la lettre correspondante");
        System.out.println("a -> Carré   -   b -> Rectangle   -   c -> Cercle");
        System.out.print("Votre choix > ");
        choix = clavier.next().toLowerCase().charAt(0);   
        switch (choix) {
         case 'a':
              traiteCarre(clavier);
              break;
            case 'b':
             traiteRectangle(clavier);
                 break;
            case 'c':
                traiteCercle(clavier);
                break;
            default:
             System.out.println("Choix invalide.");
    }
    }
    public static void traiteCarre(Scanner cl) {
        float cote, aire, perimetre;
        System.out.print("Entrez la longueur du côté du carré?");
        cote = cl.nextFloat();
        aire = cote * cote;
        perimetre = 4 * cote;
        System.out.println("Le périmètre est de " + (int) perimetre);
        System.out.println("L'aire est de " + (int) aire);
    }
    public static void traiteRectangle(Scanner cl) {
        float longueur, largeur, aire, perimetre;
        System.out.print("Inscrivez la longueur et la largeur du rectangle?"); 
        longueur = cl.nextFloat();
        largeur = cl.nextFloat();
        aire = longueur * largeur;
        perimetre = 2 * (longueur + largeur);
        System.out.println("Le périmètre est de " + (int) perimetre);
        System.out.println("L'aire est de " + (int) aire);
    }
    public static void traiteCercle(Scanner cl) {
        float rayon, aire, perimetre;;
        System.out.print("Inscrivez le rayon du cercle?");
        rayon = cl.nextFloat();
        aire = PI * rayon * rayon;
        perimetre = 2 * PI * rayon;
    
     System.out.println("Le périmètre est de " + perimetre);
     System.out.println("L'aire est de " + aire);
    }
    }
    