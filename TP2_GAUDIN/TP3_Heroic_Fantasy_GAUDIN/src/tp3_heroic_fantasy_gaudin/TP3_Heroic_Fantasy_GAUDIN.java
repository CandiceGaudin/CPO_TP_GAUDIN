/*
 * Gaudin
 * TP2
 * relation 1
 */
package tp3_heroic_fantasy_gaudin;
import java.util.ArrayList;
import Armes.Arme;
import Armes.Baton;
import Armes.Epee;
import Personnages.Personnage;
import Personnages.Magicien;
import Personnages.Guerrier;

/**
 *
 * @author kango
 */
public class TP3_Heroic_Fantasy_GAUDIN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Epee Excalibur = new Epee (7, "Excalibur", 5);
        Epee Durandal = new Epee (4,"Durandal", 7);
        Baton Chene = new Baton (4, "Chene", 5);
        Baton Charme = new Baton (5, "Charme", 6); 
        Baton Saul = new Baton(6,"Saul", 9);
        Epee Needle = new Epee (8,"Needle", 4);
        
        /*ArrayList<Arme> Equipement = new ArrayList<Arme>();
        Equipement.add(Excalibur);
        Equipement.add(Durandal);
        Equipement.add(Chene);
        Equipement.add(Charme);
        
        int taille = Equipement.size();
        for (int i=0 ; i<longueur ; i++) {
            System.out.println("L'arme "+i+" est : "+armes.get(i));
        }*/
        
          Magicien Magicien1 = new Magicien("Gandalf", 65, true);
        /*Magicien Magicien2 = new Magicien("Garcimore", 44, false);
        Guerrier Guerrier1 = new Guerrier("Conan", 75, false); */
        Guerrier Guerrier2 = new Guerrier("Lannister", 45, true);
        /*ArrayList<Personnage> personnage = new ArrayList<Personnage>();
        personnage.add(Guerrier1);
        personnage.add(Guerrier2);
        personnage.add(Magicien1);
        personnage.add(Magicien2);
        int taille = personnage.size();
        for (int j=0; j<taille; j++) {
            System.out.println("Le personnage "+j+" est : "+personnage.get(j));
        }*/
        Guerrier2.ajout_Arme(Excalibur);
        Guerrier2.ajout_Arme(Charme);
        Guerrier2.ajout_Arme(Needle);
        Magicien1.ajout_Arme(Durandal);
        Magicien1.ajout_Arme(Chene);
        Magicien1.ajout_Arme(Saul);
        System.out.println(Magicien1.Sac_d_Armes.size());
        System.out.println(Magicien1);
        int taille1=Magicien1.Sac_d_Armes.size();
        for (int i=0;i>taille1 ;i++){
            System.out.println(Magicien1.Sac_d_Armes.get(i));
        }
        System.out.println(Guerrier2);
       
       
       
       
    }
    
}
