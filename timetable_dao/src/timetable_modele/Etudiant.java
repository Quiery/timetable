/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timetable_modele;

/**
 * Classe Etudiant
 * @author matheocambier
 */
public class Etudiant extends Utilisateur {
    private int numero;
    private int id_groupe;

    /**
     * Constructeur par defaut de la classe Etudiant
     */
    public Etudiant() {
        
    }

    /**
     * 
     * @param id_utilisateur
     * @param numero
     * @param id_groupe
     * @param email
     * @param password
     * @param nom
     * @param prenom
     * @param droit 
     * Constructeur de la classe Etudiant
     */
    public Etudiant(int id_utilisateur,int numero, int id_groupe, String email, String password, String nom, String prenom, int droit) {
        super(id_utilisateur, email, password, nom, prenom, droit);
        this.numero = numero;
        this.id_groupe = id_groupe;
    }

    

    /**
     * Methode GET
     * @return 
     */
    public int getNumero() {
        return numero;
    }

    /**
     * Methode GET
     * @return 
     */
    public int getId_groupe() {
        return id_groupe;
    }

    /**
     * Methode SET
     * @param numero 
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * Methode SET
     * @param id_groupe 
     */
    public void setid_groupe(int id_groupe) {
        this.id_groupe = id_groupe;
    }

    
    
}
