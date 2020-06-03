/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timetable_modele;
import java.util.*;

/**
 *
 * @author matheocambier
 */
public class Enseignant extends Utilisateur{
    private ArrayList<Cours> liste_cours;
    private ArrayList<Seance> liste_seances;

    public Enseignant(ArrayList<Cours> liste_cours, ArrayList<Seance> liste_seances, String email, String password, String nom, String prenom, int droit) {
        super(email, password, nom, prenom, droit);
        this.liste_cours = liste_cours;
        this.liste_seances = liste_seances;
    }

    public ArrayList<Cours> getListe_cours() {
        return liste_cours;
    }

    public ArrayList<Seance> getListe_seances() {
        return liste_seances;
    }

    public void setListe_cours(ArrayList<Cours> liste_cours) {
        this.liste_cours = liste_cours;
    }

    public void setListe_seances(ArrayList<Seance> liste_seances) {
        this.liste_seances = liste_seances;
    }
    
    
    
}
