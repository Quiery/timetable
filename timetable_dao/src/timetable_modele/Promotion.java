/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timetable_modele;
import java.util.*;

/**
 * Classe Promotion
 * @author matheocambier
 */
public class Promotion {
    private int id_promotion;
    private String nom;
    private ArrayList<Integer> liste_groupes;

    /**
     * 
     * @param id_promotion
     * @param nom
     * @param liste_groupes 
     * Constructeur de la classe promotion
     */
    public Promotion(int id_promotion, String nom, ArrayList<Integer> liste_groupes) {
        this.id_promotion = id_promotion;
        this.nom = nom;
        this.liste_groupes = liste_groupes;
    }
    /**
     * 
     * @param id_promotion
     * @param nom 
     * Constructeur de la classe promotion
     */
    public Promotion(int id_promotion, String nom) {
        this.id_promotion = id_promotion;
        this.nom = nom;
        liste_groupes=new ArrayList();
    }
    
    /**
     * Constructeur par defaut de la classe promotion
     */
    public Promotion() {
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
    public String getNom() {
        return nom;
    }

    /**
     * Methode GET
     * @return 
     */
    public ArrayList<Integer> getListe_groupes() {
        return liste_groupes;
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
     * @param liste_groupes 
     */
    public void setListe_groupes(ArrayList<Integer> liste_groupes) {
        this.liste_groupes = liste_groupes;
    }
    
    /**
     * Methode ADD
     * @param groupe 
     */
    public void addGroupe(Integer groupe){
    if(!this.liste_groupes.contains(groupe))
      this.liste_groupes.add(groupe);
    }

    /**
     * Methode remove
     * @param groupe 
     */
    public void removeGroupe(Integer groupe){
      this.liste_groupes.remove(groupe);
    }
    
    
}
