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
public class UtilisateurDao extends Dao<Utilisateur>{
    /**
     * Constructeur de la classe UtilisateurDao
     * @param conn 
     */
    public UtilisateurDao(Connexion conn) {
    super(conn);
  }

    /**
     * 
     * @param obj
     * @return 
     * Methode de création de la table utilisateur
     */
    @Override
  public boolean create(Utilisateur obj) {
    return false;
  }

  /**
   * 
   * @param obj
   * @return 
   * Methode de suppression de la table utilisateur
   */
    @Override
  public boolean delete(Utilisateur obj) {
    return false;
  }
   
  /**
   * 
   * @param obj
   * Methode de modification de la table utilisateur
   * @return 
   */
    @Override
  public boolean update(Utilisateur obj) {
    return false;
  }
   /**
    * 
    * @param id
    * @return 
    * Methode pour rechercher un utilisateur en fonction de son ID
    */
    @Override
  public Utilisateur find(int id) {
    Utilisateur user = new Utilisateur();      
      
    try {
        String sql ="Select * from utilisateur Where ID_utilisateur = "+id+";";
        ResultSet result;
        result = this.connect.requete(sql);
      if(result.first())
      {
        user = new Utilisateur(id,result.getString("email"),result.getString("password"),result.getString("nom"),result.getString("prenom"),result.getInt("droit"));
      }
    } catch (SQLException e) {
    }
    return user;
    
}
  /**
   * 
   * @param email
   * @return 
   * Methode pour rechercher l'ID de l'utilisateur en fonction de son email
   */
  public int search (String email) {
    int id=0;
    try {
        String sql ="Select ID_utilisateur from utilisateur Where email = '"+email+"' ;";
        ResultSet result;
        result = this.connect.requete(sql);
      if(result.first())
      {
        id=result.getInt("ID_utilisateur");
      }
    } catch (SQLException e) {
    }
    return id;

}
  /**
   * 
   * @param email
   * @param mdp
   * @return 
   * Methode pour rechercher un ID en fonction de son email et de son password
   */
  public int login (String email,String mdp) {
    int id=0;      
    try {
        String sql ="Select id_utilisateur from utilisateur Where email = '"+email+"' and password = '"+mdp+"';";
        ResultSet result;
        result = this.connect.requete(sql);
      if(result.first())
      {
        id=result.getInt("id_utilisateur");
      }
    } catch (SQLException e) {
    }
    return id;
    
}
    
}
