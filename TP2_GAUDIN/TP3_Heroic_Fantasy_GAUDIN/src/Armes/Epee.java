/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;

import Armes.Arme;

/**
 *
 * @author kango
 */
public class Epee extends Arme {
   private int finesse ;

    public int getFinesse() {
        return finesse;
    }

    public void setFinesse(int finesse) {
        if (finesse < 0) {
            finesse = 0;
        }
        if (finesse >= 100) {
            finesse = 100;
        }
        this.finesse = finesse;
    }

    public Epee(int finesse, String nom, int niveau_attaque) {
        super(nom, niveau_attaque);
        this.finesse = finesse;
    }

     @Override
    public String toString() {
        return "Epee{" + "L'indice de finesse de l'arme est =" + finesse + '}';
    }

    

    
    

  
}
