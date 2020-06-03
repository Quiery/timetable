/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timetable_modele;
import java.util.ArrayList;

/**
 *
 * @author matheocambier
 */
public class Site {
    private int id_site;
    private String nom;
    ArrayList<Integer> id_salle;

    public Site() {
    }

    public Site(int id_site, String nom, ArrayList<Integer> id_salle) {
        this.id_site = id_site;
        this.nom = nom;
        this.id_salle = id_salle;
    }

    public ArrayList<Integer> getId_salle() {
        return id_salle;
    }

    

    

    public int getId_site() {
        return id_site;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    
    
}
