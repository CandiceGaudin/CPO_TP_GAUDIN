/*
 * Gaudin
 * TP2
 * relation 1
 */
package tp3_heroic_fantasy_gaudin;
import java.util.ArrayList;

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
        
        ArrayList<Arme> Equipement = new ArrayList<Arme>();
        Equipement.add(Excalibur);
        Equipement.add(Durandal);
        Equipement.add(Chene);
        Equipement.add(Charme);
        
        int taille = Equipement.size();

    }
    
}
