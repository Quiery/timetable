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
public class Promotion {
    private int id_promotion;
    private String nom;
    private ArrayList<Integer> liste_groupes;

    public Promotion(int id_promotion, String nom, ArrayList<Integer> liste_groupes) {
        this.id_promotion = id_promotion;
        this.nom = nom;
        this.liste_groupes = liste_groupes;
    }

    public Promotion() {
    }

    

    public int getId_promotion() {
        return id_promotion;
    }

    public String getNom() {
        return nom;
    }

    public ArrayList<Integer> getListe_groupes() {
        return liste_groupes;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setListe_groupes(ArrayList<Integer> liste_groupes) {
        this.liste_groupes = liste_groupes;
    }
    
    
    
}
