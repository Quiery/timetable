package timetable_dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import timetable_modele.*;

/**
 *
 * @author romai
 * Classe permettant de traiter les informations de la BDD
 */
public class SalleDao extends Dao<Salle>{
    /**
     * 
     * @param conn 
     * Constructeur de la classe SalleDao
     */
    public SalleDao(Connexion conn) {
    super(conn);
  }

    /**
     * 
     * @param obj
     * @return 
     * Methode de création de la table salle
     */
    @Override
  public boolean create(Salle obj) {
    return false;
  }

  /**
   * 
   * @param obj
   * @return 
   * Methode de suppression de la table salle
   */
    @Override
  public boolean delete(Salle obj) {
    return false;
  }
   
  /**
   * 
   * @param obj
   * @return 
   * Methode de modification de la table salle
   */
    @Override
  public boolean update(Salle obj) {
    return false;
  }
   
  /**
   * 
   * @param id
   * @return 
   * Methode pour rechercher une salle en focntion de son ID
   */
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

