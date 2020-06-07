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
 * Classe permettant de traiter les informations de la BDD
 * @author romai
 */
public class PromotionDao extends Dao<Promotion>{
    /**
     * 
     * @param conn 
     * Constructeur de la classe PromotionDao
     */
    public PromotionDao(Connexion conn) {
    super(conn);
  }

    /**
     * @param obj
     * @return 
     * Methode de création de la table promotion
     */
    @Override
  public boolean create(Promotion obj) {
    return false;
  }
    
  /**
   * 
   * @param obj
   * @return 
   * Methode de suppression de la table promotion
   */
    @Override
  public boolean delete(Promotion obj) {
    return false;
  }
   
  /**
   * 
   * @param obj
   * @return 
   * Methode de modification de la table promotion
   */
    @Override
  public boolean update(Promotion obj) {
    return false;
  }
   
  /**
   * 
   * @param id
   * @return 
   * Methode pour rechercher la promotion en fonction de son ID
   */
    @Override
  public Promotion find(int id) {
    Promotion promotion = new Promotion();      
      
    try {
        String sql ="Select * from promotion Where ID_promotion = "+id+";";
        ResultSet result;
        result = this.connect.requete(sql);
      if(result.first())
      {
        promotion = new Promotion(id,result.getString("nom"));
        
        sql ="Select ID_groupe from groupe where id_promotion="+id+";";
        result = this.connect.requete(sql);
        while(result.next()){
            promotion.addGroupe(result.getInt("ID_cours"));
        }
      }
    } catch (SQLException e) {
    }
    return promotion;
    
  }
}
