/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;

/**
 *
 * @author kango
 */
public abstract class Arme {
    private String nom;
    private int niveau_attaque;

    @Override
    public String toString() {
        return "Arme{nom=" + nom + ", niveau_attaque=" + niveau_attaque + '}';
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNiveau_attaque() {
        return niveau_attaque;
    }
    

    public void setNiveau_attaque(int niveau_attaque) {
        if(niveau_attaque <= 100){
            this.niveau_attaque = niveau_attaque;
        }
        
        
        
    }

    public Arme(String nom, int niveau_attaque) {
        this.nom = nom;
        this.niveau_attaque = niveau_attaque;
        if (niveau_attaque > 100){
            niveau_attaque = 100;
        }
        else if (niveau_attaque < 0){
            niveau_attaque = 0;
        }
    }
    
}
