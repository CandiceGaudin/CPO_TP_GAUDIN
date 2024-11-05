/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_1_gaudin;

/**
 *
 * @author kango
 */
public class Personne {
    String nom; 
    String prenom;
    int nbVoiture; 
    Voiture [] liste_voitures;
    public Personne(String UnNom, String UnPrenom){
        UnNom = nom;
        UnPrenom = prenom;
        liste_voitures = new Voiture [3];
        nbVoiture = 0;
    }
@Override
    public String toString() { 
        return "Personne{" + "nom=" + nom + ", prenom=" + prenom + '}';
    }
    
    public boolean ajouter_une_voiture(Voiture voiture_a_ajouter) { 
        boolean voiture_ajoutee;
        if ((voiture_a_ajouter.proprietaire!=null)&&(nbVoiture>=3)) { 
            voiture_ajoutee = false; 
        }
        else { 
            liste_voitures[nbVoiture] = voiture_a_ajouter; 
            nbVoiture++; 
            voiture_a_ajouter.proprietaire=this; 
            voiture_ajoutee = true; 
        }
        return voiture_ajoutee;
    }
}
