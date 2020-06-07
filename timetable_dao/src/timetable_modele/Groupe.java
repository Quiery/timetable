/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timetable_modele;
import java.util.*;

/**
 * Classe Groupe
 * @author matheocambier
 */
public class Groupe {
    private int id_groupe;
    private String nom;
    private int id_promotion;
    private ArrayList<Integer> liste_etudiant;
    private ArrayList<Integer> liste_seance;

    /**
     * 
     * @param id_groupe
     * @param nom
     * @param id_promotion
     * @param liste_etudiant
     * @param liste_seance 
     * Constructeur de la classe Groupe
     */
    public Groupe(int id_groupe, String nom, int id_promotion, ArrayList<Integer> liste_etudiant, ArrayList<Integer> liste_seance) {
        this.id_groupe = id_groupe;
        this.nom = nom;
        this.id_promotion = id_promotion;
        this.liste_etudiant = liste_etudiant;
        this.liste_seance = liste_seance;
    }
    
    /**
     * 
     * @param id_groupe
     * @param nom
     * @param id_promotion 
     * Constructeur de la classe Groupe
     */
    public Groupe(int id_groupe, String nom, int id_promotion) {
        this.id_groupe = id_groupe;
        this.nom = nom;
        this.id_promotion = id_promotion;
        liste_etudiant=new ArrayList();
        liste_seance=new ArrayList();
    }

    
    /**
     * Constructeur par defaut de la classe Groupe
     */
    public Groupe() {
    }

    /**
     * Methode GET
     * @return 
     */
    public int getId_promotion() {
        return id_promotion;
    }
    
    /**
     * Methode GET
     * @return 
     */
    public int getId_groupe() {
        return id_groupe;
    }

    /**
     * Methode GET
     * @return 
     */
    public String getNom() {
        return nom;
    }

    /**
     * Methode GET
     * @return 
     */
    public ArrayList<Integer> getListe_etudiant() {
        return liste_etudiant;
    }

    /**
     * Methode GET
     * @return 
     */
    public ArrayList<Integer> getListe_seance() {
        return liste_seance;
    }

    /**
     * Methode SET
     * @param nom 
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * Methode SET
     * @param liste_etudiant 
     */
    public void setListe_etudiant(ArrayList<Integer> liste_etudiant) {
        this.liste_etudiant = liste_etudiant;
    }

    /**
     * Methode SET
     * @param liste_seance 
     */
    public void setListe_seance(ArrayList<Integer> liste_seance) {
        this.liste_seance = liste_seance;
    }
    
    
    /**
     * Methode ADD
     * @param etudiant 
     */
    public void addEtudiant(Integer etudiant){
    if(!this.liste_etudiant.contains(etudiant))
      this.liste_etudiant.add(etudiant);
    }

    /**
     * Methode remove
     * @param etudiant 
     */
    public void removeEtudiant(Integer etudiant){
      this.liste_etudiant.remove(etudiant);
    }
    
    /**
     * Methode ADD
     * @param seance 
     */   
    public void addSeance(Integer seance){
        
    if(!this.liste_seance.contains(seance))
    {
      this.liste_seance.add(seance);}
    }

    /**
     * Methode remove
     * @param seance 
     */
    public void removeSeance(Integer seance){
      this.liste_seance.remove(seance);
    }
    
    
    
}
