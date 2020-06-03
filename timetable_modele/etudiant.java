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
public class Etudiant extends Utilisateur {
    private int numero;
    private int id_groupe;

    public Etudiant() {
    }

    public Etudiant(int numero, int id_groupe, int id_utilisateur, String email, String password, String nom, String prenom, int droit) {
        super(id_utilisateur, email, password, nom, prenom, droit);
        this.numero = numero;
        this.id_groupe = id_groupe;
    }

    

    public int getNumero() {
        return numero;
    }

    public int getId_groupe() {
        return id_groupe;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setid_groupe(int id_groupe) {
        this.id_groupe = id_groupe;
    }

    
    
}
