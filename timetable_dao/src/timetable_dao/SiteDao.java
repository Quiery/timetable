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
public class SiteDao extends Dao<Site>{
    
    /**
     * 
     * @param conn 
     * Constructeur de la classe SiteDao
     */
    public SiteDao(Connexion conn) {
    super(conn);
  }

    /**
     * 
     * @param obj
     * @return 
     * Methode de création de la table site
     */
    @Override
  public boolean create(Site obj) {
    return false;
  }

  /**
   * 
   * @param obj
   * Methode de suppression de la table site
   * @return 
   */
    @Override
  public boolean delete(Site obj) {
    return false;
  }
   
  /**
   * 
   * @param obj
   * @return 
   * Methode de modification de la table site
   */
    @Override
  public boolean update(Site obj) {
    return false;
  }
   
  /**
   * 
   * @param id
   * @return 
   * Methode pour rechercher le site lié à la salle
   */
    @Override
  public Site find(int id) {
    Site site = new Site();      
      
    try {
        String sql ="Select * from site Where ID_site = "+id+";";
        ResultSet result;
        result = this.connect.requete(sql);
      if(result.first())
      {
        site = new Site(id,result.getString("nom"));
        
        sql ="Select ID_salle from salle where id_site="+id+";";
        result = this.connect.requete(sql);
        while(result.next()){
            site.addSalle(result.getInt("ID_salle"));
        }
      }
    } catch (SQLException e) {
    }
    return site;
    
  }
    
}
