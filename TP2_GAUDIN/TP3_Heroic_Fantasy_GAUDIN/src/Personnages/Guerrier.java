/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

/**
 *
 * @author kango
 */
public class Guerrier extends Personnage{
     private boolean à_cheval;

     public void setACheval(boolean à_cheval) {
        this.à_cheval = à_cheval;
    }
     
     public Guerrier( String nom, int niveauDeVie, boolean à_cheval) {
        super(nom, niveau_de_vie);
        this.à_cheval = à_cheval;
    }
    static int compteurGuerrier;
    public static int compteur(){
        compteurGuerrier++;
        return compteurGuerrier;
    }
    
}
