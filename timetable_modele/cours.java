/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timetable_modele;

/**
 *
 * @author matheocambier
 */
public class Cours {
    private int id_cours;
    private String nom;

    public Cours(String nom) {
        this.nom = nom;
    }

    public int getid_cours() {
        return id_cours;
    }

    public String getNom() {
        return nom;
    }

    public void setid_cours(int id_cours) {
        this.id_cours = id_cours;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    
    

    
}
