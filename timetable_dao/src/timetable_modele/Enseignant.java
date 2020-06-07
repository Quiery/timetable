/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timetable_modele;
import java.util.*;

/**
 * Classe enseignant
 * @author matheocambier
 */
public class Enseignant extends Utilisateur{
    private ArrayList<Integer> liste_cours;
    private ArrayList<Integer> liste_seances;

    public Enseignant() {
    }

    /**
     * 
     * @param liste_cours
     * @param liste_seances
     * @param id_utilisateur
     * @param email
     * @param password
     * @param nom
     * @param prenom
     * @param droit 
     * Constructeur de la classe Enseignant
     */
    public Enseignant(ArrayList<Integer> liste_cours, ArrayList<Integer> liste_seances, int id_utilisateur, String email, String password, String nom, String prenom, int droit) {
        super(id_utilisateur, email, password, nom, prenom, droit);
        this.liste_cours = liste_cours;
        this.liste_seances = liste_seances;
    }
    
    /**
     * 
     * @param id_utilisateur
     * @param email
     * @param password
     * @param nom
     * @param prenom
     * @param droit 
     * Constructeur de la classe Enseignant
     */
    public Enseignant(int id_utilisateur, String email, String password, String nom, String prenom, int droit) {
        super(id_utilisateur, email, password, nom, prenom, droit);
        liste_cours=new ArrayList();
        liste_seances=new ArrayList();        
    }

    

    /**
     * Methode GET
     * @return 
     */
    public ArrayList<Integer> getListe_cours() {
        return liste_cours;
    }

    /**
     * Methode GET
     * @return 
     */
    public ArrayList<Integer> getListe_seances() {
        return liste_seances;
    }

    /**
     * Methode SET
     * @param liste_cours 
     */
    public void setListe_cours(ArrayList<Integer> liste_cours) {
        this.liste_cours = liste_cours;
    }

    /**
     * Methode SET
     * @param liste_seances 
     */
    public void setListe_seances(ArrayList<Integer> liste_seances) {
        this.liste_seances = liste_seances;
    }
    
    /**
     * Methode ADD
     * @param cours 
     */
    public void addCours(Integer cours){
    if(!this.liste_cours.contains(cours))
      this.liste_cours.add(cours);
    }

    /**
     * Methode remove
     * @param cours 
     */
    public void removeCours(Integer cours){
      this.liste_cours.remove(cours);
    }
    
    /**
     * Methode ADD
     * @param seance 
     */
    public void addSeance(Integer seance){
        
    if(!this.liste_seances.contains(seance))
    {
      this.liste_seances.add(seance);}
    }

    /**
     * Methode remove
     * @param seance 
     */
    public void removeSeance(Integer seance){
      this.liste_seances.remove(seance);
    }
    
    
}
