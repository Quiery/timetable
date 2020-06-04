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
public class Utilisateur {
    protected int id_utilisateur;
    protected String email;
    protected String password;
    protected String nom;
    protected String prenom;
    protected int droit;

    public Utilisateur() {
    }

    public Utilisateur(int id_utilisateur, String email, String password, String nom, String prenom, int droit) {
        this.id_utilisateur = id_utilisateur;
        this.email = email;
        this.password = password;
        this.nom = nom;
        this.prenom = prenom;
        this.droit = droit;
    }

    

    public int getId_utilisateur() {
        return id_utilisateur;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public int getDroit() {
        return droit;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setDroit(int droit) {
        this.droit = droit;
    }
    
    
}
