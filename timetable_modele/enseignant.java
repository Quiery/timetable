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
    private ArrayList<Integer> liste_cours;
    private ArrayList<Integer> liste_seances;

    public Enseignant() {
    }

    public Enseignant(ArrayList<Integer> liste_cours, ArrayList<Integer> liste_seances, int id_utilisateur, String email, String password, String nom, String prenom, int droit) {
        super(id_utilisateur, email, password, nom, prenom, droit);
        this.liste_cours = liste_cours;
        this.liste_seances = liste_seances;
    }

    
    
    public ArrayList<Integer> getListe_cours() {
        return liste_cours;
    }

    public ArrayList<Integer> getListe_seances() {
        return liste_seances;
    }

    public void setListe_cours(ArrayList<Integer> liste_cours) {
        this.liste_cours = liste_cours;
    }

    public void setListe_seances(ArrayList<Integer> liste_seances) {
        this.liste_seances = liste_seances;
    }
    
    
    
}
