/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timetable_dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import timetable_modele.*;

/**
 * 
 * @author romai
 * Classe permettant de traiter les informations de la BDD
 */
public class EnseignantDao extends Dao<Enseignant> {
    /**
     * Constructeur de la classe EnseignantDao
     * @param conn 
     */
    public EnseignantDao(Connexion conn) {
    super(conn);
  }
/**
 * 
 * @param obj
 * @return 
 * Methode de création de la table enseignant
 */
    @Override
  public boolean create(Enseignant obj) {
    return false;
  }

/**
 * 
 * @param obj
 * @return 
 * Methode de suppression de la table enseignant
 */
    @Override
  public boolean delete(Enseignant obj) {
    return false;
  }
/**
 * 
 * @param obj
 * @return 
 * Methode de modification de la table enseignant
 */   
    @Override
  public boolean update(Enseignant obj) {
    return false;
  }
  
/**
 * 
 * @param id
 * @return
 * Methode pour rechercher un enseignant en fonction de l'ID utilisateur
 */   
    @Override
  public Enseignant find(int id) {
    Enseignant enseignant = new Enseignant();      
      
    try {
        String sql ="Select * from enseignant "
                + "Inner join utilisateur"
                + " on enseignant.id_utilisateur=utilisateur.id_utilisateur"
                + " where enseignant.id_utilisateur="+id+";";
        ResultSet result;
        result = this.connect.requete(sql);
      if(result.first())
      {
        enseignant = new Enseignant(id,result.getString("email"),result.getString("password"),result.getString("nom"),result.getString("prenom"),result.getInt("droit"));
        
        sql ="Select ID_cours from enseignant where id_utilisateur="+id+";";
        result = this.connect.requete(sql);
        while(result.next()){
            enseignant.addCours(result.getInt("ID_cours"));
        }
        
        sql ="Select ID_seance from seance_enseignant where id_utilisateur="+id+";";
        result = this.connect.requete(sql);
        while(result.next()){
            enseignant.addSeance(result.getInt("ID_seance"));
        }
      }
    } catch (SQLException e) {
    }
    return enseignant;
    
  }
    
}
