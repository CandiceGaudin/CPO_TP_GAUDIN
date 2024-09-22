/*
* GAUDIN
*2A
* TP0 Exercice 1
*role: affichage d'un message
* 22/09/2024
 */
package exo1;

import java.util.Scanner;

/**
 *
 * @author kango
 */
public class Exo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        System.out.println("Bonjour");
        String prenom;
        Scanner sc;
        sc = new Scanner(System.in);
        System.out.println("Quel est votre prenom ?");
        prenom = sc.nextLine();
        System.out.println("Au revoir");
    }
    
}
