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
public class Salle {
    private int id_salle;
    private String nom;
    private int capacite;
    private int id_site;

    public Salle(int id_salle, String nom,int capacite ,int id_site) {
        this.id_salle = id_salle;
        this.nom = nom;
        this.capacite=capacite;
        this.id_site = id_site;
    }

    public Salle() {
    }

    public int getId_site() {
        return id_site;
    }


    public int getId_salle() {
        return id_salle;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    
    
    
}
