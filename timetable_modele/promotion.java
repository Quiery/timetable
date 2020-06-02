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
public class promotion {
    int ID_promotion;
    String nom;
    ArrayList<groupe> liste_groupes;

    public promotion(String nom, ArrayList<groupe> liste_groupes) {
        this.nom = nom;
        this.liste_groupes = liste_groupes;
    }

    public int getID_promotion() {
        return ID_promotion;
    }

    public String getNom() {
        return nom;
    }

    public ArrayList<groupe> getListe_groupes() {
        return liste_groupes;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setListe_groupes(ArrayList<groupe> liste_groupes) {
        this.liste_groupes = liste_groupes;
    }
    
    
    
}
