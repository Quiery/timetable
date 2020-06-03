/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timetable_modele;
import java.util.ArrayList;
import java.sql.*;

/**
 *
 * @author matheocambier
 */
public class Seance {
    private int id_seance;
    private int semaine;
    private Date jour;
    private Time heure_debut;
    private Time heure_fin;
    private int etat;
    private int id_cours;
    private int id_type_cours;
    private ArrayList<Integer> liste_salles;
    private ArrayList<Integer> liste_groupes;
    private ArrayList<Integer> liste_enseignants;

    public Seance(int id_seance, int semaine, Date jour, Time heure_debut, Time heure_fin, int etat, int id_cours, int id_type_cours, ArrayList<Integer> liste_salles, ArrayList<Integer> liste_groupes, ArrayList<Integer> liste_enseignants) {
        this.id_seance = id_seance;
        this.semaine = semaine;
        this.jour = jour;
        this.heure_debut = heure_debut;
        this.heure_fin = heure_fin;
        this.etat = etat;
        this.id_cours = id_cours;
        this.id_type_cours = id_type_cours;
        this.liste_salles = liste_salles;
        this.liste_groupes = liste_groupes;
        this.liste_enseignants = liste_enseignants;
    }




    public int getId_seance() {
        return id_seance;
    }

    public int getSemaine() {
        return semaine;
    }

    public Date getJour() {
        return jour;
    }



    public int getEtat() {
        return etat;
    }

    public int getId_cours() {
        return id_cours;
    }

    public int getId_type_cours() {
        return id_type_cours;
    }



    public ArrayList<Integer> getListe_salles() {
        return liste_salles;
    }

    public ArrayList<Integer> getListe_groupes() {
        return liste_groupes;
    }

    public ArrayList<Integer> getListe_enseignants() {
        return liste_enseignants;
    }

    public Time getHeure_debut() {
        return heure_debut;
    }

    public Time getHeure_fin() {
        return heure_fin;
    }

    
    
    
}
