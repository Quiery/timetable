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
public class Groupe {
    private int id_groupe;
    private String nom;
    private ArrayList<Etudiant> liste_etudiant;
    private ArrayList<Seance> liste_seance;

    public Groupe(String nom, ArrayList<Etudiant> liste_etudiant, ArrayList<Seance> liste_seance) {
        this.nom = nom;
        this.liste_etudiant = liste_etudiant;
        this.liste_seance = liste_seance;
    }

    public int getid_groupe() {
        return id_groupe;
    }

    public String getNom() {
        return nom;
    }

    public ArrayList<Etudiant> getListe_etudiant() {
        return liste_etudiant;
    }

    public ArrayList<Seance> getListe_seance() {
        return liste_seance;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setListe_etudiant(ArrayList<Etudiant> liste_etudiant) {
        this.liste_etudiant = liste_etudiant;
    }

    public void setListe_seance(ArrayList<Seance> liste_seance) {
        this.liste_seance = liste_seance;
    }
    
    
    
}
