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
 */
public class PromotionDao extends Dao<Promotion>{
    public PromotionDao(Connexion conn) {
    super(conn);
  }

    @Override
  public boolean create(Promotion obj) {
    return false;
  }

    @Override
  public boolean delete(Promotion obj) {
    return false;
  }
   
    @Override
  public boolean update(Promotion obj) {
    return false;
  }
   
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
