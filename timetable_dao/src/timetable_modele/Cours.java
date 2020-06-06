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

    public Cours(int id_cours, String nom) {
        this.id_cours = id_cours;
        this.nom = nom;
    }

    public Cours() {
    }

    

    public int getId_cours() {
        return id_cours;
    }

    public String getNom() {
        return nom;
    }

    
}
