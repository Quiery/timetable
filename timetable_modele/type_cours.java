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
public class Type_cours {

    private int id_type_cours;
    private String nom;

    public Type_cours() {
    }

    public Type_cours(int id_type_cours, String nom) {
        this.id_type_cours = id_type_cours;
        this.nom = nom;
    }

    

    public int getid_type_cours() {
        return id_type_cours;
    }

    public String getNom() {
        return nom;
    }


    public void setNom(String nom) {
        this.nom = nom;
    }
    
    
    
}
