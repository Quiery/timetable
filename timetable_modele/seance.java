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
public class seance {
    int ID_seance;
    int semaine;
    Date jour;
    String heure_debut;
    String heure_fin;
    int etat;
    cours matiere;
    type_cours maniere;
    ArrayList<salle> liste_salles;
    ArrayList<groupe> liste_groupes;
    ArrayList<enseignant> liste_enseignants;

    public seance(int semaine, Date jour, String heure_debut, String heure_fin, int etat, cours matiere, type_cours maniere, ArrayList<salle> liste_salles, ArrayList<groupe> liste_groupes, ArrayList<enseignant> liste_enseignants) {
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

    public int getID_seance() {
        return ID_seance;
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

    public cours getMatiere() {
        return matiere;
    }

    public type_cours getManiere() {
        return maniere;
    }

    public ArrayList<salle> getListe_salles() {
        return liste_salles;
    }

    public ArrayList<groupe> getListe_groupes() {
        return liste_groupes;
    }

    public ArrayList<enseignant> getListe_enseignants() {
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

    public void setMatiere(cours matiere) {
        this.matiere = matiere;
    }

    public void setManiere(type_cours maniere) {
        this.maniere = maniere;
    }

    public void setListe_salles(ArrayList<salle> liste_salles) {
        this.liste_salles = liste_salles;
    }

    public void setListe_groupes(ArrayList<groupe> liste_groupes) {
        this.liste_groupes = liste_groupes;
    }

    public void setListe_enseignants(ArrayList<enseignant> liste_enseignants) {
        this.liste_enseignants = liste_enseignants;
    }
    
    
}
