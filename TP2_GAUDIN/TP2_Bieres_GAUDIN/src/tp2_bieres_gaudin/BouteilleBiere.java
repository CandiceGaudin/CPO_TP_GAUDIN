/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_bieres_gaudin;

/**
 *
 * @author kango
 */
public class BouteilleBiere {

    String Nom;
    double degreAlcool;
    String brasserie;
    boolean ouverte;
    public boolean Decapsuler() {
        if (ouverte==false) {
            ouverte = true;
        }
            else {
                    System.out.println("erreur : biere déjà ouverte");
                    }
        return ouverte;
        }
    
   public void lireEtiquette() {
System.out.println("Bouteille de " + Nom +" (" + degreAlcool +
 " degres) \nBrasserie : " + brasserie ) ;

   }
   @Override
public String toString() {
String chaine_a_retourner;
chaine_a_retourner = Nom + " (" + degreAlcool + " degrés) Ouverte ? ";
if (ouverte == true ) chaine_a_retourner += "oui" ;
else chaine_a_retourner += "non" ;
return chaine_a_retourner ;
}
   /* En dessous c'est le constructeur, sinon on peut faire boutton droit puis insert code pour faire la meme chose mais plus rapidement */
public BouteilleBiere(String unNom, double unDegre, String
uneBrasserie) {
 Nom = unNom;
 degreAlcool = unDegre;
 brasserie = uneBrasserie;
 ouverte = false;

}
}