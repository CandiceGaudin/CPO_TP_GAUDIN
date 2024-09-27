        /*
 * Gaudin
 * TP1 manipNombresInt
 * TDA
 */
package manipnombresint;

import java.util.Scanner;

/**
 *
 * @author kango
 */
public class ManipNombresInt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int a;
    int b;
    int somme;
    int produit;
    int difference;
    int quotient;
    int reste;
    Scanner sc = new Scanner(System.in);
    System.out.println("\n Entrer un entier :");
    a=sc.nextInt();
    Scanner sc1 = new Scanner(System.in);
    System.out.println("\n Entrer un autre entier :");
    b=sc1.nextInt();
    somme=a+b;
    produit=a*b;
    difference=a-b;
    quotient=a/b;
    reste=a%b;
    System.out.println("\n Voici la somme: " + somme + ", la difference: " + difference + " et le produit: " + produit + " de a et b.");
    System.out.println("\n Voici le quotient: " +quotient + " et le reste de la division: " + reste + " de a par b.");
    }
    
}
