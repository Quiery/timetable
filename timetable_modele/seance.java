/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timetable_modele;
import java.util.*;
import java.text.*;

/**
 *
 * @author matheocambier
 */
public class Seance {
    private int id_seance;
    private int semaine;
    private Date jour;
    private String heure_debut;
    private String heure_fin;
    private int etat;
    private Cours matiere;
    private Type_cours maniere;
    private ArrayList<Salle> liste_salles;
    private ArrayList<Groupe> liste_groupes;
    private ArrayList<Enseignant> liste_enseignants;

    public Seance(int semaine, Date jour, String heure_debut, String heure_fin, int etat, Cours matiere, Type_cours maniere, ArrayList<Salle> liste_salles, ArrayList<Groupe> liste_groupes, ArrayList<Enseignant> liste_enseignants) {
        this.semaine = semaine;
        this.jour = jour;
        this.heure_debut = heure_debut;
        this.heure_fin = heure_fin;
        this.etat = etat;
        this.matiere = matiere;
        this.maniere = maniere;
        this.liste_salles = liste_salles;
        this.liste_groupes = liste_groupes;
        this.liste_enseignants = liste_enseignants;
    }

    public int getid_seance() {
        return id_seance;
    }

    public int getSemaine() {
        return semaine;
    }

    public Date getJour() {
        return jour;
    }

    public String getHeure_debut() {
        return heure_debut;
    }

    public String getHeure_fin() {
        return heure_fin;
    }

    public int getEtat() {
        return etat;
    }

    public Cours getMatiere() {
        return matiere;
    }

    public Type_cours getManiere() {
        return maniere;
    }

    public ArrayList<Salle> getListe_salles() {
        return liste_salles;
    }

    public ArrayList<Groupe> getListe_groupes() {
        return liste_groupes;
    }

    public ArrayList<Enseignant> getListe_enseignants() {
        return liste_enseignants;
    }

    public void setSemaine(int semaine) {
        this.semaine = semaine;
    }

    public void setJour(Date jour) {
        this.jour = jour;
    }

    public void setHeure_debut(String heure_debut) {
        this.heure_debut = heure_debut;
    }

    public void setHeure_fin(String heure_fin) {
        this.heure_fin = heure_fin;
    }

    public void setEtat(int etat) {
        this.etat = etat;
    }

    public void setMatiere(Cours matiere) {
        this.matiere = matiere;
    }

    public void setManiere(Type_cours maniere) {
        this.maniere = maniere;
    }

    public void setListe_salles(ArrayList<Salle> liste_salles) {
        this.liste_salles = liste_salles;
    }

    public void setListe_groupes(ArrayList<Groupe> liste_groupes) {
        this.liste_groupes = liste_groupes;
    }

    public void setListe_enseignants(ArrayList<Enseignant> liste_enseignants) {
        this.liste_enseignants = liste_enseignants;
    }
    
    
}
