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
public class CoursDao extends Dao<Cours>{
    public CoursDao(Connexion conn) {
    super(conn);
  }

    @Override
  public boolean create(Cours obj) {
    return false;
  }

    @Override
  public boolean delete(Cours obj) {
    return false;
  }
   
    @Override
  public boolean update(Cours obj) {
    return false;
  }
   
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
