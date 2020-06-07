/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timetable_modele;
import java.util.ArrayList;
import java.sql.*;

/**
 * Classe Seance
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

    /**
     * 
     * @param id_seance
     * @param semaine
     * @param jour
     * @param heure_debut
     * @param heure_fin
     * @param etat
     * @param id_cours
     * @param id_type_cours
     * @param liste_salles
     * @param liste_groupes
     * @param liste_enseignants 
     * Constructeur de la classe Seance
     */
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

    /**
     * Constructeur par defaut de la classe Seance
     */
    public Seance(){
    }
    
    /**
     * 
     * @param id_seance
     * @param semaine
     * @param jour
     * @param heure_debut
     * @param heure_fin
     * @param etat
     * @param id_cours
     * @param id_type_cours 
     * Constructeur de la classe Seance
     */
    public Seance(int id_seance, int semaine, Date jour, Time heure_debut, Time heure_fin, int etat, int id_cours, int id_type_cours) {
        this.id_seance = id_seance;
        this.semaine = semaine;
        this.jour = jour;
        this.heure_debut = heure_debut;
        this.heure_fin = heure_fin;
        this.etat = etat;
        this.id_cours = id_cours;
        this.id_type_cours = id_type_cours;
        this.liste_salles=new ArrayList();
        this.liste_groupes =new ArrayList();
        this.liste_enseignants =new ArrayList();
    }


    /**
     * Methode GET
     * @return 
     */
    public int getId_seance() {
        return id_seance;
    }

    /**
     * Methode GET
     * @return 
     */
    public int getSemaine() {
        return semaine;
    }

    /**
     * Methode GET
     * @return 
     */
    public Date getJour() {
        return jour;
    }

    /**
     * Methode GET
     * @return 
     */
    public int getEtat() {
        return etat;
    }

    /**
     * Methode GET
     * @return 
     */
    public int getId_cours() {
        return id_cours;
    }

    /**
     * Methode GET
     * @return 
     */
    public int getId_type_cours() {
        return id_type_cours;
    }

    /**
     * Methode GET
     * @return 
     */
    public ArrayList<Integer> getListe_salles() {
        return liste_salles;
    }

    /**
     * Methode GET
     * @return 
     */
    public ArrayList<Integer> getListe_groupes() {
        return liste_groupes;
    }

    /**
     * Methode GET
     * @return 
     */
    public ArrayList<Integer> getListe_enseignants() {
        return liste_enseignants;
    }

    /**
     * Methode GET
     * @return 
     */
    public Time getHeure_debut() {
        return heure_debut;
    }

    /**
     * Methode GET
     * @return 
     */
    public Time getHeure_fin() {
        return heure_fin;
    }

    /**
     * Methode ADD
     * @param enseignant 
     */
    public void addEnseignant(Integer enseignant){
    if(!this.liste_enseignants.contains(enseignant))
      this.liste_enseignants.add(enseignant);
    }

    /**
     * Methode remove
     * @param enseignant 
     */
    public void removeEnseignant(Integer enseignant){
      this.liste_enseignants.remove(enseignant);
    }
    
    /**
     * Methode ADD
     * @param groupe 
     */
    public void addGroupe(Integer groupe){
        
    if(!this.liste_groupes.contains(groupe))
    {
      this.liste_groupes.add(groupe);}
    }

    /**
     * Methode remove
     * @param groupe 
     */
    public void removeGroupe(Integer groupe){
      this.liste_groupes.remove(groupe);
    }
    
    /**
     * Methode ADD
     * @param salle 
     */
    public void addSalle(Integer salle){
    if(!this.liste_salles.contains(salle))
      this.liste_salles.add(salle);
    }

    /**
     * Methode remove
     * @param salle 
     */
    public void removeSalle(Integer salle){
      this.liste_salles.remove(salle);
    }
    
    
}
