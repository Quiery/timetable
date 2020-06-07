/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timetable_modele;


/**
 * Classe Utilisateur
 * @author matheocambier
 */
public class Utilisateur {
    protected int id_utilisateur;
    protected String email;
    protected String password;
    protected String nom;
    protected String prenom;
    protected int droit;

    /**
     * 
     * @param id_utilisateur
     * @param email
     * @param password
     * @param nom
     * @param prenom
     * @param droit 
     * Constructeur de la classe Utilisateur
     */
    public Utilisateur(int id_utilisateur, String email, String password, String nom, String prenom, int droit) {
        this.email = email;
        this.password = password;
        this.nom = nom;
        this.prenom = prenom;
        this.droit = droit;
        this.id_utilisateur= id_utilisateur;
    }
    /**
     * Constructeur par defaut de la classe Utilisateur
     */
    public Utilisateur()
    {
    }

    /**
     * Methode GET
     * @return 
     */
    public int getid_utilisateur() {
        return id_utilisateur;
    }

    /**
     * Methode GET
     * @return 
     */
    public String getEmail() {
        return email;
    }

    /**
     * Methode GET
     * @return 
     */
    public String getPassword() {
        return password;
    }

    /**
     * Methode GET
     * @return 
     */
    public String getNom() {
        return nom;
    }

    /**
     * Methode GET
     * @return 
     */
    public String getPrenom() {
        return prenom;
    }

    /**
     * Methode GET
     * @return 
     */
    public int getDroit() {
        return droit;
    }

    /**
     * Methode SET
     * @param email 
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Methode SET
     * @param password 
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Methode SET
     * @param nom 
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * Methode SET
     * @param prenom 
     */
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    /**
     * Methode SET
     * @param droit 
     */
    public void setDroit(int droit) {
        this.droit = droit;
    }
    
    
}
