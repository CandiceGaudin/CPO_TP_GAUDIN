/*
 * Gaudin
 * TP2
 * convertisseurObjet
 */
package tp2_convertisseurobjet_gaudin;

/**
 *
 * @author kango
 */
public class TP2_convertisseurObjet_GAUDIN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double a;
        double rep1 = 0;
        double rep2 = 0;
        double rep3 = 0;
        double rep4 = 0;
        System.out.println("\n Bonjour, saisissez une valeur : ");
    Scanner sc = new Scanner(System.in);
    a=sc.nextDouble();
    
     Convertisseur Celcius_vers = new Convertisseur() ;
Celcius_vers.CelciusVersKelvin(a) = rep1;
Celcius_vers.CelciusVersFarenheit(a) = rep2;
System.out.println("nombre de conversion = 2");

// Je ne comprends pas pourquoi le logiciel veux une variable et pas une valeur...
// J'ai essayé de faire en sorte que les deux objets créé effectuent chacun deux conversions,
//et pour cela j'ai demandé a l'utilisateur de me donner une valeur que je pourrai donc inséré dans les fonctions et ainsi avoir un résultat

Convertisseur Kelvin_vers = new Convertisseur() ;
Kelvin_vers.KelvinVersFarenheit(a) = rep3;
Kelvin_vers.KelvinVersCelcius(a) = rep4;
System.out.println("nombre de conversion = 2");

    }
    
}
