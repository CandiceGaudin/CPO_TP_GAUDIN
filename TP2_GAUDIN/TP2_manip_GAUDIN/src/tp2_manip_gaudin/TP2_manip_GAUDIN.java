/*
 * Gaudin
 * TP2
 * manip
 */
package tp2_manip_gaudin;

/**
 *
 * @author kango
 */
public class TP2_manip_GAUDIN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Tartiflette_1 assiette1 = new Tartiflette(500); 
        Tartiflette assiette2 = new Tartiflette(600); 
        Tartiflette assiette3=assiette2;
        //(4) En réalité les assiette2 et assiette3 référencent la meme tartiflette.
        System.out.println("nb de calories de Assiette 2 : " +assiette2.nbCalories) ;
        System.out.println("nb de calories de Assiette 3 : " +assiette3.nbCalories) ;
        assiette2.nbCalories+=10;
        System.out.println("nb de calories de Assiette 2 : " +assiette2.nbCalories) ;
        System.out.println("nb de calories de Assiette 3 : " +assiette3.nbCalories) ;
        Tartiflette assiette4 = assiette2; 
        assiette2 = assiette1;
        assiette1 = assiette4;
        System.out.println("nb de calories de Assiette 2 : " +assiette2.nbCalories) ;
        System.out.println("nb de calories de Assiette 1 : " +assiette1.nbCalories) ;        
        //(6) Les deux lignes sont fausses car l'une référence une classe, et l'autre référence un objet d'une autre classe. Non
        Moussaka Tab[];
        Tab = new Moussaka[10];
        for (int j=0; j<=9; j++) { 
            Tab[j] = new Moussaka(400+10*j);
            int k=j+1;
            System.out.println("l'assiette "+k+" de moussaka a "+Tab[j].nbCalories +" calories");
        }
    }
    
}
