/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timetable_modele;

/**
 * Classe Salle
 * @author matheocambier
 */
public class Salle {
    private int id_salle;
    private String nom;
    private int capacite;
    private int id_site;

    /**
     * 
     * @param id_salle
     * @param nom
     * @param capacite
     * @param id_site 
     * Constructeur de la classe Salle
     */
    public Salle(int id_salle, String nom,int capacite ,int id_site) {
        this.id_salle = id_salle;
        this.nom = nom;
        this.capacite=capacite;
        this.id_site = id_site;
    }

    /**
     * Constructeur par defaut de la classe Salle
     */
    public Salle() {
    }

    /**
     * Methode GET
     * @return 
     */
    public int getId_site() {
        return id_site;
    }

    /**
     * Methode GET
     * @return 
     */
    public int getId_salle() {
        return id_salle;
    }

    /**
     * Methode GET
     * @return 
     */
    public String getNom() {
        return nom;
    }

    /**
     * Methode SET
     * @param nom 
     */
    public void setNom(String nom) {
        this.nom = nom;
    }
    
    
    
}
