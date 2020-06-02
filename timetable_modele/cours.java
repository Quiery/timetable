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
public class cours {
    int ID_cours;
    String nom;

    public cours(String nom) {
        this.nom = nom;
    }

    public int getID_cours() {
        return ID_cours;
    }

    public String getNom() {
        return nom;
    }

    public void setID_cours(int ID_cours) {
        this.ID_cours = ID_cours;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    
    

    
}
