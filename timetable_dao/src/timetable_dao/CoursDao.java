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
public class CoursDao extends Dao<Cours>{
    /**
     * 
     * @param conn 
     * Constructeur de la classe CoursDao
     */
    public CoursDao(Connexion conn) {
    super(conn);
  }

    /**
     * 
     * @param obj
     * @return 
     * Methode de création de la table cours
     */
    @Override
  public boolean create(Cours obj) {
    return false;
  }
/**
 * 
 * @param obj
 * @return 
 * Methode de suppression de la table cours
 */
    @Override
  public boolean delete(Cours obj) {
    return false;
  }
   
  /**
   * 
   * @param obj
   * @return 
   * Methode de modification de la table cours
   */
    @Override
  public boolean update(Cours obj) {
    return false;
  }
  
   /**
    * 
    * @param id
    * @return 
    * Methode pour rechercher un cours en fonction de son ID
    */
    @Override
  public Cours find(int id) {
    Cours cours = new Cours();      
      
    try {
        String sql ="Select * from cours Where ID_cours = "+id+";";
        ResultSet result;
        result = this.connect.requete(sql);
      if(result.first())
        cours = new Cours(id,result.getString("nom"));         
    } catch (SQLException e) {
    }
    return cours;
    
  }
    
}
