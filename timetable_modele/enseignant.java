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
public class enseignant extends utilisateur{
    ArrayList<cours> liste_cours;
    ArrayList<seance> liste_seances;

    public enseignant(ArrayList<cours> liste_cours, ArrayList<seance> liste_seances, String email, String password, String nom, String prenom, int droit) {
        super(email, password, nom, prenom, droit);
        this.liste_cours = liste_cours;
        this.liste_seances = liste_seances;
    }

    public ArrayList<cours> getListe_cours() {
        return liste_cours;
    }

    public ArrayList<seance> getListe_seances() {
        return liste_seances;
    }

    public void setListe_cours(ArrayList<cours> liste_cours) {
        this.liste_cours = liste_cours;
    }

    public void setListe_seances(ArrayList<seance> liste_seances) {
        this.liste_seances = liste_seances;
    }
    
    
    
}
