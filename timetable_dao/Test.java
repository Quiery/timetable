/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timetable_dao;

import java.sql.Date;
import java.sql.SQLException;
import java.sql.Time;
import java.util.ArrayList;
import timetable_modele.*;

/**
 *
 * @author romai
 */
public class Test {
    
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Connexion co= new Connexion("timetable","root","");
        SeanceDao seancedao=new SeanceDao(co);
        Seance seance=seancedao.find(1);
        Time heure=seance.getHeure_debut();
        Date date=seance.getJour();
        long d=date.getTime();
        System.out.println(d);
        long h=heure.getTime();
        int h2 = (int)h/(1000*60*60)+1;
        System.out.println(h2);
    }
    
}
