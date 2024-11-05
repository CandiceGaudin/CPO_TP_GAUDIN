/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_1_gaudin;

/**
 *
 * @author kango
 */
public class Voiture {
    String marque; 
    String modele;
    int PuissanceCV;
    Personne proprietaire;
    public Voiture(String UnModele, String UneMarque, int UnePuissance) {
        modele = UnModele;
        marque = UneMarque;
        PuissanceCV = UnePuissance;
        proprietaire = null;
    }
    @Override
    public String toString() { 
        return "Voiture{" + "marque=" + marque + ", modele=" + modele + ", PuissanceCV=" + PuissanceCV + '}';
    }

    
}
