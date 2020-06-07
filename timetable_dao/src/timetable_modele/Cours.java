/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timetable_modele;

/**
 * Classe Cours
 * @author matheocambier
 */
public class Cours {
    private int id_cours;
    private String nom;

    /**
     * Constructeur de la classe Cours
     * @param id_cours
     * @param nom 
     */
    public Cours(int id_cours, String nom) {
        this.id_cours = id_cours;
        this.nom = nom;
    }

    /**
     * Constructeur par defaut de la classe cours
     */
    public Cours() {
    }

    

    /**
     * Methode GET
     * @return 
     */
    public int getId_cours() {
        return id_cours;
    }

    /**
     * Methode GET
     * @return 
     */
    public String getNom() {
        return nom;
    }

    
}
