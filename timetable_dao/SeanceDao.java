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
public class SeanceDao extends Dao<Seance>{
    public SeanceDao(Connexion conn) {
    super(conn);
  }

    @Override
  public boolean create(Seance obj) {
    return false;
  }

    @Override
  public boolean delete(Seance obj) {
    return false;
  }
   
    @Override
  public boolean update(Seance obj) {
    return false;
  }
   
    @Override
  public Seance find(int id) {
    Seance seance = new Seance();      
      
    try {
        String sql ="Select * from seance where id_seance="+id+";";
        ResultSet result;
        result = this.connect.requete(sql);
      if(result.first())
      {
        seance = new Seance(id,result.getInt("semaine"),result.getDate("date"),result.getTime("heure_debut"),result.getTime("heure_fin"),result.getInt("etat"),result.getInt("id_cours"),result.getInt("id_type_cours"));
        
        sql ="Select ID_utilisateur from seance_enseignant where id_seance="+id+";";
        result = this.connect.requete(sql);
        while(result.next()){
            seance.addEnseignant(result.getInt("ID_utilisateur"));
        }
        
        sql ="Select ID_groupe from seance_groupes where id_seance="+id+";";
        result = this.connect.requete(sql);
        while(result.next()){
            seance.addGroupe(result.getInt("ID_groupe"));
        }
        
        sql ="Select ID_salle from seance_salles where id_seance="+id+";";
        result = this.connect.requete(sql);
        while(result.next()){
            seance.addSalle(result.getInt("ID_salle"));
        }
      }
    } catch (SQLException e) {
    }
    return seance;
    
  }
    
}
