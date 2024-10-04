/*
 * Gaudin
 * TP1_guessMyNumber
 * TDA
 */
package tp1_guessmynumber_gaudin;


import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author kango
 */
public class TP1_guessMyNumber_GAUDIN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

    int nbr;
    int compte = 1;
    int choix;
        Random generateurAleat = new Random();
    /*for (int i = 0; i < 5; i++) {
    */
        int n = generateurAleat.nextInt(100);
    /*System.out.println(n);
    */
        nbr = 0;
        System.out.println("Choisissez un mode de diffuculte : \n1) Facile \n2) Normal \n3) Difficile");
        Scanner var  = new Scanner(System.in);
        choix = var.nextInt();
        if (choix == 1) {
            System.out.println("Vous avez choisi le mode Facile : Le jeu vous indiquera lorsque l'ecart entre le nombre a deviner et le votre est supperieur a 30");
            while (nbr!=n) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Entrez un nombre entre 1 et 100");
                nbr = sc.nextInt();
                if (nbr>n) {
                    if (nbr-n>30) {
                        System.out.println("Vraiment trop grand");
                    }
                    else {
                    System.out.println("Trop grand");
                    }
            }
                else if (nbr<n) {
                    if (n-nbr>30){
                        System.out.println("Vraiment trop petit");
                    }
                    else {
                        System.out.println("Trop petit");
                    }
            }
           
            compte+=1;
            }
        }
        else if (choix == 2) {
         System.out.println("Vous avez choisi le mode Normal");
            while (nbr!=n) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Entrez un nombre entre 1 et 100");
                nbr = sc.nextInt();
                if (nbr>n) {
                    System.out.println("Trop grand");
                }  
           
                else  {
                        System.out.println("Trop petit");
                    }
            compte+=1;
            }
            }
        else if (choix == 3) {
         System.out.println("Vous avez choisi le mode Difficile. Vous avez donc 7 coups pour trouver le nombre");
            while ((nbr!=n)&&(compte<=7)) {
                Scanner sc = new Scanner(System.in);
            System.out.println("Entrez un nombre entre 1 et 100");
            nbr=sc.nextInt();
                if (nbr>n) {
                    System.out.println("Trop grand");
                }  
                else  {
                        System.out.println("Trop petit");
                    }
           
            compte+=1;
            }
            if ((nbr!=n)&&(compte>7)) {
                System.out.println("Vous n'avez pas trouve le bon nombre en 7 coups, la reponse etait : " + n);
            }
        }
        if (n == nbr) {
            compte-=1;
            System.out.println("Gagne ! Vous avez reussi en "+compte+" tentative(s)");
        }
    }
}
