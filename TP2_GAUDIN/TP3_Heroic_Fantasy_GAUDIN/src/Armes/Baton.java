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
public class Baton extends Arme {
    private int age ;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            age = 0;
        }
        if (age >= 100) {
            age = 99;
        }
        this.age = age;
    }

    public Baton(int age, String nom, int niveau_attaque) {
        super(nom, niveau_attaque);
        this.age = age;
        
        
    }

    @Override
    public String toString() {
        return "Baton{" + "age=" + age + '}';
    }
    
    
}
