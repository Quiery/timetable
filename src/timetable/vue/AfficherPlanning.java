/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timetable.vue;

import java.util.*;
import javax.swing.*;




/**
 *
 * @author cleme
 */
public class AfficherPlanning {

       JFrame frame = new JFrame("Hello World!");

    public AfficherPlanning() {
        
       // la fenêtre doit se fermer quand on clique sur la croix rouge
       frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
       
       // on ajoute le texte "Hello, World!" dans la fenêtre
       frame.getContentPane().add(new JLabel("Hello, World!"));
       
       // on demande d'attribuer une taille minimale à la fenêtre
       //  (juste assez pour voir tous les composants)
       frame.pack();
       // on centre la fenêtre
       frame.setLocationRelativeTo(null);
       // on rend la fenêtre visible
       frame.setVisible(true);   
        
    }
       
 

    

    
    
    
    
    
}
