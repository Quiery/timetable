/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package timetable_vue;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import timetable_dao.Connexion;
import timetable_dao.UtilisateurDao;

/**
 * Classe ChoixAdmin : Cette classe ouvre un panel réserver à un administrateur permettant à celui-ci de voir les emplois du temps de tous les utilisateurs
 * @author cleme
 */
public class ChoixAdmin extends JPanel implements ActionListener{
    
    private JButton submit;
    private JTextField text;
    private JPanel panel;
    private JLabel label;

    /**
     * Constructeur de la classe ChoixAdmin
     */
    public ChoixAdmin(){
    
        setLayout(new BorderLayout());
        panel = new JPanel();
        text = new JTextField();
        label = new JLabel("Inserer un email: ");
        
        text.setColumns(10);
        submit = new JButton("Valider");
        submit.addActionListener(this);
        panel.setLayout(new GridLayout(1, 3));
        panel.add(label);
        panel.add(text);
        panel.add(submit);
        
        this.add(panel);
    }
/**
 * Methode actionPerformed : Appelle la classe WeekListButton avec l'ID de la personne dont l'administrateur veut voir l'emploi du temps
 * @param ae 
 */
    @Override
    public void actionPerformed(ActionEvent ae) {
        
        try {
            
            
            Connexion co= new Connexion("timetable","root","");
            UtilisateurDao u= new UtilisateurDao(co);
            int ID = u.search(text.getText());
            WeekListButton w = new WeekListButton(ID);
            panel.removeAll();
            panel.updateUI();
            panel.add(w);
            this.add(panel);
            co.close();
            
                        
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(ChoixAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
