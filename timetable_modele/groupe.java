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
public class groupe {
    int ID_groupe;
    String nom;
    ArrayList<etudiant> liste_etudiant;
    ArrayList<seance> liste_seance;

    public groupe(String nom, ArrayList<etudiant> liste_etudiant, ArrayList<seance> liste_seance) {
        this.nom = nom;
        this.liste_etudiant = liste_etudiant;
        this.liste_seance = liste_seance;
    }

    public int getID_groupe() {
        return ID_groupe;
    }

    public String getNom() {
        return nom;
    }

    public ArrayList<etudiant> getListe_etudiant() {
        return liste_etudiant;
    }

    public ArrayList<seance> getListe_seance() {
        return liste_seance;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setListe_etudiant(ArrayList<etudiant> liste_etudiant) {
        this.liste_etudiant = liste_etudiant;
    }

    public void setListe_seance(ArrayList<seance> liste_seance) {
        this.liste_seance = liste_seance;
    }
    
    
    
}
