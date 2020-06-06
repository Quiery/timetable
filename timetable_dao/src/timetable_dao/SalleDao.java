package timetable_dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import timetable_modele.*;

/**
 *
 * @author romai
 */
public class SalleDao extends Dao<Salle>{
    public SalleDao(Connexion conn) {
    super(conn);
  }

    @Override
  public boolean create(Salle obj) {
    return false;
  }

    @Override
  public boolean delete(Salle obj) {
    return false;
  }
   
    @Override
  public boolean update(Salle obj) {
    return false;
  }
   
    @Override
  public Salle find(int id) {
    Salle masalle = new Salle();      
      
    try {
        String sql ="Select * from salle Where ID_salle = "+id+";";
        ResultSet result;
        result = this.connect.requete(sql);
      if(result.first())
        masalle = new Salle(id,result.getString("nom"),result.getInt("capacite"),result.getInt("ID_site"));         
    } catch (SQLException e) {
    }
    return masalle;
    
  }
} 

