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
public class UtilisateurDao extends Dao<Utilisateur>{
    public UtilisateurDao(Connexion conn) {
    super(conn);
  }

    @Override
  public boolean create(Utilisateur obj) {
    return false;
  }

    @Override
  public boolean delete(Utilisateur obj) {
    return false;
  }
   
    @Override
  public boolean update(Utilisateur obj) {
    return false;
  }
   
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
  
  public int login (String email,String mdp) {
    int id=0;      
    try {
        String sql ="Select ID_utilisateur from utilisateur Where email = '"+email+"' and password = '"+mdp+"' ;";
        ResultSet result;
        result = this.connect.requete(sql);
        System.out.println(email);
        System.out.println(mdp);
      if(result.first())
      {
        id=result.getInt("ID_utilisateur");
      }
    } catch (SQLException e) {
    }
    return id;
    
}

    
}
