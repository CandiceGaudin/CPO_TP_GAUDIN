/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;
import java.util.ArrayList;
import Armes.Arme;
import Armes.Baton;
import Armes.Epee;

/**
 *
 * @author kango
 */
public class Personnage {
    private String nom;
    private int niveau_de_vie;
   
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNiveauDeVie() {
        return niveau_de_vie;
    }

    public void setNiveauDeVie(int niveau_de_vie) {
        this.niveau_de_vie = niveau_de_vie;
    }
    
     public Personnage(String nom, int niveau_de_vie) {
        this.nom = nom;
        this.niveau_de_vie = niveau_de_vie;
     }
    
     
    public ArrayList Sac_d_Armes = new ArrayList<Arme>(); 

    public void ajout_Arme(Arme newArme) {
        if (Sac_d_Armes==null){
            Sac_d_Armes.add(newArme);
        }
        else if (Sac_d_Armes.size()<5){
            Sac_d_Armes.add(newArme);
        }
    }
     Arme Arme_en_main = null;

    public Arme getArme_en_main() {
        return Arme_en_main;
    }
   
    public Arme Porter_une_arme(Arme Arme_a_porter){
        for (int i=0 ; i<Sac_d_Armes.size() ; i++){
            if (Arme_a_porter==Sac_d_Armes.get(i)){
                Arme_en_main = Arme_a_porter;
                System.out.println(Arme_a_porter + " a été affectée comme arme de prédilection");
            }
            else {
                System.out.println(Arme_a_porter + " n'est pas dans votre inventaire");
            }
        }
        return Arme_en_main;
    }
    static int compteurPersonnages;
    public static int compteur() {
        compteurPersonnages++;
        return compteurPersonnages;
    }
   
    @Override
    public String toString() {
        if (Arme_en_main!=null){
        return "Personnage{" + "nom=" + nom + ", NiveauDeVie=" + niveau_de_vie + "arme de prédilection : "+ Arme_en_main +'}';
        }
        else {
            return "Personnage{" + "nom=" + nom + ", NiveauDeVie=" + niveau_de_vie + "}";
        }
    }
}

