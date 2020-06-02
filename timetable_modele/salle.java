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
public class salle {
    int ID_salle;
    String nom;

    public salle(String nom) {
        this.nom = nom;
    }

    public int getID_salle() {
        return ID_salle;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    
    
    
}
