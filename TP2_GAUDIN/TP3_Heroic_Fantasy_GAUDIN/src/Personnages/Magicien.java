/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

/**
 *
 * @author kango
 */
public class Magicien extends Personnage {
     private boolean confirmé;

     public boolean setConfirme() {
        return confirmé;
    }
     
     public Magicien(String nom, int niveauDeVie, boolean confirmé) {
        super(nom, niveau_de_vie);
        this.confirmé = confirmé;
    }
    static int compteurMagicien;
    public static int compteur(){
        compteurMagicien++;
        return compteurMagicien;
    }
    
    
    
    
    
}
