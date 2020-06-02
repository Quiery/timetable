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
public class etudiant extends utilisateur {
    int numero;
    groupe td;

    public etudiant(int numero, groupe td, String email, String password, String nom, String prenom, int droit) {
        super(email, password, nom, prenom, droit);
        this.numero = numero;
        this.td = td;
    }

    public int getNumero() {
        return numero;
    }

    public groupe getTd() {
        return td;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setTd(groupe td) {
        this.td = td;
    }

    
    
}
