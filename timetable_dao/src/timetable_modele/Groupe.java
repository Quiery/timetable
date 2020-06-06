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
public class Groupe {
    private int id_groupe;
    private String nom;
    private int id_promotion;
    private ArrayList<Integer> liste_etudiant;
    private ArrayList<Integer> liste_seance;

    public Groupe(int id_groupe, String nom, int id_promotion, ArrayList<Integer> liste_etudiant, ArrayList<Integer> liste_seance) {
        this.id_groupe = id_groupe;
        this.nom = nom;
        this.id_promotion = id_promotion;
        this.liste_etudiant = liste_etudiant;
        this.liste_seance = liste_seance;
    }
    
    public Groupe(int id_groupe, String nom, int id_promotion) {
        this.id_groupe = id_groupe;
        this.nom = nom;
        this.id_promotion = id_promotion;
        liste_etudiant=new ArrayList();
        liste_seance=new ArrayList();
    }

    

    public Groupe() {
    }

    public int getId_promotion() {
        return id_promotion;
    }
    
    

    public int getId_groupe() {
        return id_groupe;
    }

    public String getNom() {
        return nom;
    }

    public ArrayList<Integer> getListe_etudiant() {
        return liste_etudiant;
    }

    public ArrayList<Integer> getListe_seance() {
        return liste_seance;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setListe_etudiant(ArrayList<Integer> liste_etudiant) {
        this.liste_etudiant = liste_etudiant;
    }

    public void setListe_seance(ArrayList<Integer> liste_seance) {
        this.liste_seance = liste_seance;
    }
    
    
    public void addEtudiant(Integer etudiant){
    if(!this.liste_etudiant.contains(etudiant))
      this.liste_etudiant.add(etudiant);
    }

    public void removeEtudiant(Integer etudiant){
      this.liste_etudiant.remove(etudiant);
    }
    
    public void addSeance(Integer seance){
        
    if(!this.liste_seance.contains(seance))
    {
      this.liste_seance.add(seance);}
    }

    public void removeSeance(Integer seance){
      this.liste_seance.remove(seance);
    }
    
    
    
}
