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
import java.util.Calendar;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 * Classe WeekListButton : Affiche un tableau de 52 buttons représentant les 52 semaines d'une année
 * @author cleme  
 */
public class WeekListButton extends JPanel implements ActionListener{
    
    private int semaine;
    private JButton[] button;
    private Calendar cal;
    private JPanel panel, panel2;
    private int ID;
    
    /**
     * Constructeur de la classe WeekListButton
     * @param ID
     * @throws SQLException
     * @throws ClassNotFoundException 
     */
    public WeekListButton(int ID) throws SQLException, ClassNotFoundException        
    {
        setLayout(new BorderLayout());
        panel = new JPanel();
        panel2 = new JPanel();
        button = new JButton[52];
        this.ID = ID;
        cal = Calendar.getInstance(Locale.FRANCE);
        semaine = cal.get(Calendar.WEEK_OF_YEAR);
        panel.setLayout(new GridLayout(2, 52));

                           
        for(int i=0;i<52;i++)
        {
            String j = Integer.toString(i+1);
            button[i]= new JButton(j);
            button[i].addActionListener(this);
            panel.add(button[i]);
        }
   
        TimeTable t = new TimeTable(ID,semaine);
        panel2.add(t);
        
        
               
        this.add("North",panel);
        this.add(panel2);        

        
    }
    
    /**
     * Methode actionPerformed : Appelle la classe TimeTable en envoyant la semaine choisi précedemment
     * @param ae 
     */
    @Override
    public void actionPerformed(ActionEvent ae) 
    {
        try {
            for(int i =0;i<52;i++)
            {
                if(ae.getSource()== button[i])
                {
                    panel2.removeAll();
                    panel2.updateUI();
                    semaine = i+1;
                    TimeTable t = new TimeTable(ID,semaine);
                    panel2.add(t);
                    this.add(panel2);
                }
            
            }
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(WeekListButton.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
}
