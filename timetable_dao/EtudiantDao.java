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
public class EtudiantDao extends Dao<Etudiant>{
    public EtudiantDao(Connexion conn) {
    super(conn);
  }

    @Override
  public boolean create(Etudiant obj) {
    return false;
  }

    @Override
  public boolean delete(Etudiant obj) {
    return false;
  }
   
    @Override
  public boolean update(Etudiant obj) {
    return false;
  }
   
    @Override
  public Etudiant find(int id) {
    Etudiant etudiant = new Etudiant();      
      
    try {
        String sql ="Select * from etudiant "
                + "Inner join utilisateur"
                + " on etudiant.id_utilisateur=utilisateur.id_utilisateur"
                + " where etudiant.id_utilisateur="+id+";";
        ResultSet result;
        result = this.connect.requete(sql);
      if(result.first())
      {
        etudiant = new Etudiant(id,result.getInt("numero"),result.getInt("Id_groupe"),result.getString("email"),result.getString("password"),result.getString("nom"),result.getString("prenom"),result.getInt("droit")); 
      }
    } catch (SQLException e) {
    }
    return etudiant;
    
  }
    
}
