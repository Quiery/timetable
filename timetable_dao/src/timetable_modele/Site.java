/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timetable_modele;
import java.util.ArrayList;

/**
 * Classe Site  
 * @author matheocambier
 */
public class Site {
    private int id_site;
    private String nom;
    ArrayList<Integer> id_salle;

    /**
     * Constructeur par defaut de la classe Site
     */
    public Site() {
    }

    /**
     * 
     * @param id_site
     * @param nom
     * @param id_salle 
     * Constructeur de la classe Site
     */
    public Site(int id_site, String nom, ArrayList<Integer> id_salle) {
        this.id_site = id_site;
        this.nom = nom;
        this.id_salle = id_salle;
    }
    
    /**
     * 
     * @param id_site
     * @param nom 
     * Constructeur de la classe Site
     */
    public Site(int id_site, String nom) {
        this.id_site = id_site;
        this.nom = nom;
        this.id_salle=new ArrayList();
    }

    /**
     * Methode GET
     * @return 
     */
    public ArrayList<Integer> getId_salle() {
        return id_salle;
    }


    /**
     * Methode GET
     * @return 
     */
    public int getId_site() {
        return id_site;
    }

    /**
     * Methode GET
     * @return 
     */
    public String getNom() {
        return nom;
    }

    /**
     * Methode SET
     * @param nom 
     */
    public void setNom(String nom) {
        this.nom = nom;
    }
    
    /**
     * Methode ADD
     * @param salle 
     */
    public void addSalle(Integer salle){
    if(!this.id_salle.contains(salle))
      this.id_salle.add(salle);
    }

    /**
     * Methode remove
     * @param salle 
     */
    public void removeSalle(Integer salle){
      this.id_salle.remove(salle);
    }
    
    
}
