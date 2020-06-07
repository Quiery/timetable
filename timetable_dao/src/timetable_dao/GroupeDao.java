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
public class GroupeDao extends Dao<Groupe>{
    /**
     * 
     * @param conn 
     * Constructeur de la classe GroupeDao
     */
    public GroupeDao(Connexion conn) {
    super(conn);
  }

    /**
     * 
     * @param obj
     * @return 
     * Methode de création de la table groupe
     */
    @Override
  public boolean create(Groupe obj) {
    return false;
  }

  /**
   * 
   * @param obj
   * @return 
   * Methode de suppression de la table groupe
   */
    @Override
  public boolean delete(Groupe obj) {
    return false;
  }
   
  /**
   * 
   * @param obj
   * @return 
   * Methode de modification de la table groupe
   */
    @Override
  public boolean update(Groupe obj) {
    return false;
  }
   
  /**
   * 
   * @param id
   * @return 
   * Methode pour rechercher le groupe en fonction de son ID
   */
    @Override
  public Groupe find(int id) {
    Groupe groupe = new Groupe();      
      
    try {
        String sql ="Select * from groupe where id_groupe="+id+";";
        ResultSet result;
        result = this.connect.requete(sql);
      if(result.first())
      {
        groupe = new Groupe(id,result.getString("nom"),result.getInt("id_promotion")); 
        
        sql ="Select ID_utilisateur from etudiant where id_groupe="+id+";";
        result = this.connect.requete(sql);
        while(result.next()){
            groupe.addEtudiant(result.getInt("ID_utilisateur"));
        }
        
        sql ="Select ID_seance from seance_groupes where id_groupe= "+id+" ;";
        result = this.connect.requete(sql);
        while(result.next()){
            groupe.addSeance(result.getInt("ID_seance"));
        }
      }
    } catch (SQLException e) {
    }
    return groupe;
    
  }
    
}
