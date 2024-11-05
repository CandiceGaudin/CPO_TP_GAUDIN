/*
 * Gaudin
 * TP2
 * convertisseurObjet
 */
package tp2_convertisseurobjet_gaudin;

import java.util.Scanner;

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
        /*double rep1 = 0;
        double rep2 = 0;
        double rep3 = 0;
        double rep4 = 0;*/
        System.out.println("\n Bonjour, saisissez une valeur : ");
    Scanner sc = new Scanner(System.in);
    a=sc.nextDouble();
    
    /* Convertisseur Celcius_vers = new Convertisseur() ;
rep1 = Celcius_vers.CelciusVersKelvin(a);
rep2 = Celcius_vers.CelciusVersFarenheit(a);
System.out.println(a + " degres Celcius est egal a " + rep1 + " Kelvin");
System.out.println(a + " degres Celcius est égal a " + rep2 + " Farenheit");
System.out.println(Celcius_vers);


Convertisseur Kelvin_vers = new Convertisseur() ;
rep3 = Kelvin_vers.KelvinVersFarenheit(a);
rep4 = Kelvin_vers.KelvinVersCelcius(a);
System.out.println(a + " Kelvin est egal a " + rep3 + " Farenheit");
System.out.println(a + " Kelvin est egal a " + rep4 + " degres Celcius");
System.out.println(Kelvin_vers);*/
  
    
Convertisseur Conversion = new Convertisseur();
System.out.println("\n Saisissez la conversion que vous souhaiter effectuer : " + "\n 1) De Celcius vers Kelvin " + "\n 2) De Kelvin vers Celcius " + "\n 3) Farenheit Vers Celcius " + "\n 4) Farenheit Vers Kelvin " + "\n 5) Kelvin Vers Farenheit " + "\n 6) De Farenheit vers Kelvin ");
    Scanner sc1 = new Scanner(System.in);
    int conversion;
    conversion=sc1.nextInt();
    double reponse;
    if (conversion == 1) { 
        reponse = Conversion.CelciusVersKelvin(a);
        System.out.println(a + " degres Celcius est egal a " + reponse + " Kelvin");
    }
    if (conversion == 2) { 
        reponse = Conversion.KelvinVersCelcius(a);
        System.out.println(a + " Kelvin est egal a " + reponse + " degres Celcius");
    }
    if (conversion == 3) { 
        reponse = Conversion.CelciusVersFarenheit(a);
        System.out.println(a + " degres Celcius est égal a " + reponse + " Farenheit");
    }
    if (conversion == 4) { 
        reponse = Conversion.FarenheitVersCelcius(a);
        System.out.println(a + " Farenheit est egal a " + reponse + " degres Celcius");
    }
    if (conversion == 5) { 
        reponse = Conversion.KelvinVersFarenheit(a);
        System.out.println(a + " Kelvin est egal a " + reponse + " Farenheit");
    }
    if (conversion == 6) { 
        reponse = Conversion.FarenheitVersKelvin(a);
        System.out.println(a + " Farenheit est egal a " + reponse + " Kelvin");
    }
    }

    }
    

