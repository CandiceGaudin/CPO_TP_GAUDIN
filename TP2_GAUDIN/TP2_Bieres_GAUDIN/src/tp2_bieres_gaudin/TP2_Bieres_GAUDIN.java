/*
 * Gaudin
 * TP2_Bieres
 * TDA
 */
package tp2_bieres_gaudin;


/**
 *
 * @author kango
 */
public class TP2_Bieres_GAUDIN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   /* BouteilleBiere uneBiere = new BouteilleBiere() ;
uneBiere.Nom = "Cuvée des trolls";
uneBiere.degreAlcool = 7.0 ;
uneBiere.brasserie = "Dubuisson";
uneBiere.ouverte = false;
uneBiere.lireEtiquette();

BouteilleBiere uneSecondeBiere = new BouteilleBiere() ;
uneSecondeBiere.Nom = "Leffe";
uneSecondeBiere.degreAlcool = 6.6 ;
uneSecondeBiere.brasserie = "Abbaye de Leffe";
uneSecondeBiere.lireEtiquette();*/
   
BouteilleBiere uneBiere = new BouteilleBiere("Cuvée des trolls",
7.0 ,"Dubuisson");
uneBiere.lireEtiquette();

BouteilleBiere uneSecondeBiere = new BouteilleBiere("Leffe",    6.6, "Abbaye de Leffe") ;
uneSecondeBiere.lireEtiquette();

BouteilleBiere BiereLambda = new BouteilleBiere("Biere",
6.0 ,"Laboisson");
BiereLambda.lireEtiquette();

BouteilleBiere autreautreBiere = new BouteilleBiere("Blonde",
7.0 ,"Celle a cote de ta maison");
autreautreBiere.lireEtiquette();

BouteilleBiere laDerniereBiere = new BouteilleBiere("Raiponse",
7.5 ,"Le cannard boiteux");




























































uneBiere.lireEtiquette();
    }

}
