/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timetable_vue;

/**
 *
 * @author cleme
 */
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import timetable_dao.Connexion;
import timetable_dao.UtilisateurDao;
import timetable_modele.Utilisateur;

/**
 * Classe Window : fenètre principale appellant les différents paneaux d'affichage
 * @author cleme
 */
public class Window extends JFrame implements ActionListener {

	
        private JButton button1,button2,button3;
	private int ID;
        private JPanel p0,p1,p2;
	
        /**
         * 
         * @param ID
         * @throws SQLException
         * @throws ClassNotFoundException 
         * Constructeur de la classe Window
         */
	public Window(int ID) throws SQLException, ClassNotFoundException{
            
                this.setTitle("Planning ECE");
                setLayout(new BorderLayout());
                //setSize(1500,1500);
                setBounds(0, 0, 1450, 900);
                setResizable(true);
                setLocationRelativeTo(null);
                setVisible(true);
                this.ID = ID;
                
                                // creation des panneaux
                p0 = new JPanel();
                p1 = new JPanel();
                p2 = new JPanel();

                // mise en page des panneaux
                p0.setLayout(new GridLayout(1, 2));
                p0.setPreferredSize(new Dimension(150,60));
                
                Connexion co= new Connexion("timetable","root","");
                UtilisateurDao u= new UtilisateurDao(co);
                Utilisateur user=u.find(ID);
                int droit=user.getDroit();
                
                if(droit==2)
                {
                    button3 = new JButton("Choisir un étudiant");
                    button3.addActionListener(this);
                    p2.add(button3);
                    this.add("North",p2);
                }
                
                if(droit==3 || droit==4)
                {
                    button1 = new JButton("Emploi du temps");
                    button2 = new JButton("Récapitulatif des cours");
                    
                    button1.addActionListener(this);
                    button2.addActionListener(this);
                    p0.add(button1);
                    p0.add(button2);
                    this.add("North",p0);
                }           

                co.close();
                
                addWindowListener(new WindowAdapter() {
                    @Override
                    public void windowClosing(WindowEvent evt) {
                        System.exit(0); // tout fermer
                    }
                    });
	}
        
	/**
         * Methode actionPerformed : Appelle le paneaux en fonction du choix de l'utilisateur
         * @param e 
         */
        @Override
	public void actionPerformed(ActionEvent e){
            try {
                
                if (e.getSource()==button1) {                    
                    WeekListButton w = new WeekListButton(ID);
                    p1.removeAll();
                    p1.updateUI();
                    p1.add(w);
                    this.add(p1);

                    
                }
                if (e.getSource()==button2) {
                   RecapCours r = new RecapCours();
                   p1.removeAll(); 
                   p1.updateUI();
                   p1.add(r);
                   this.add(p1);
                }
                
                if (e.getSource()==button3) {
                   ChoixAdmin c = new ChoixAdmin();
                   p1.removeAll();
                   p1.updateUI();
                   p1.add(c);
                   this.add(p1);
                }
            } catch (SQLException | ClassNotFoundException ex) {
                Logger.getLogger(Window.class.getName()).log(Level.SEVERE, null, ex);
            }
	}

}
