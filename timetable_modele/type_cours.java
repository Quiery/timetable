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
public class type_cours {

    int ID_type_cours;
    String nom;

    public type_cours(String nom) {
        this.nom = nom;
    }

    public int getID_type_cours() {
        return ID_type_cours;
    }

    public String getNom() {
        return nom;
    }


    public void setNom(String nom) {
        this.nom = nom;
    }
    
    
    
}
