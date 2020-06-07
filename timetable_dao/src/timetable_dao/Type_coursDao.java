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
public class Type_coursDao extends Dao<Type_cours> {
   /**
    * 
    * @param conn 
    * Constructeur de la classe Type_coursDao
    */
    public Type_coursDao(Connexion conn) {
    super(conn);
  }

    /**
     * 
     * @param obj
     * @return 
     * Methode de création de la table type_cours
     */
    @Override
  public boolean create(Type_cours obj) {
    return false;
  }

  /**
   * 
   * @param obj
   * @return 
   * Methode de suppression de la table type_cours
   */
    @Override
  public boolean delete(Type_cours obj) {
    return false;
  }
   
  /**
   * 
   * @param obj
   * @return 
   * Methode de modification de la table type_cours
   */
    @Override
  public boolean update(Type_cours obj) {
    return false;
  }
   
  /**
   * 
   * @param id
   * @return 
   * Methode pour rechercher le type du cours en fonction de son ID
   */
    @Override
  public Type_cours find(int id) {
    Type_cours tc = new Type_cours();      
      
    try {
        String sql ="Select * from type_cours Where ID_type_cours = "+id+";";
        ResultSet result;
        result = this.connect.requete(sql);
      if(result.first())
      {
        tc = new Type_cours(id,result.getString("nom"));
      }
    } catch (SQLException e) {
    }
    return tc;
    
}
}
