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
    private ArrayList<Groupe> liste_groupes;

    public Promotion(String nom, ArrayList<Groupe> liste_groupes) {
        this.nom = nom;
        this.liste_groupes = liste_groupes;
    }

    public int getid_promotion() {
        return id_promotion;
    }

    public String getNom() {
        return nom;
    }

    public ArrayList<Groupe> getListe_groupes() {
        return liste_groupes;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setListe_groupes(ArrayList<Groupe> liste_groupes) {
        this.liste_groupes = liste_groupes;
    }
    
    
    
}
