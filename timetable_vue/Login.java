/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timetable_vue;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

/**
 *
 * @author matheocambier
 */

public class DatabaseException extends Exception{
    public DatabaseException(){
        super();
    }
}


public class Login extends JFrame implements ActionListener {
    
    private JPanel panel_login, presentation, panel_submit;
    private JButton submit;
    private JLabel user_mail, user_password, label_logo, titre;
    private JTextField text_mail;
    private JPasswordField text_password;
    
    
    public static void main(String[] args) {
      new Login();
   }
    
    public Login(){
        
        this.setTitle("Page de connexion");
        this.setSize(900,500);
        this.setLayout(new BorderLayout());
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        user_mail = new JLabel("Entrez votre mail :", JLabel.CENTER);
        text_mail = new JTextField();
        
        user_password = new JLabel("Entrez votre mot de passe :", JLabel.CENTER);
        text_password = new JPasswordField(JLabel.CENTER);
        
        
        
        
        label_logo = new JLabel();
        label_logo.setIcon(new ImageIcon(new ImageIcon(Login.class.getResource("ECE.jpg")).getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT)));
        
        titre = new JLabel();
        titre.setText("Bienvenue sur votre emploi du temps ECE Paris");
        titre.setFont(new Font("Serif",Font.BOLD, 22));
        
        presentation = new JPanel();
        presentation.setLayout(new GridLayout(1,2));
        presentation.add(label_logo);
        presentation.add(titre);
        
        
        panel_login =new JPanel();
        panel_login.setPreferredSize(new Dimension(400,100));
        panel_login.setBackground(Color.LIGHT_GRAY); 
        panel_login.setLayout(new GridLayout(2,2));
        panel_login.add(user_mail);
        panel_login.add(text_mail);
        panel_login.add(user_password);
        panel_login.add(text_password);
        
        submit=new JButton("Valider");
        submit.setPreferredSize(new Dimension(150,60));
        
        panel_submit = new JPanel();
        panel_submit.add(submit);
        
        submit.addActionListener(this);
        
        add("North",presentation);
        add("Center",panel_login);
        add("South", panel_submit);
        
        this.setVisible(true);
    }
    
    public DatabaseException(){
        super();
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
         String mail = user_mail.getText();
         String password = user_password.getText();
         int a;
         UtilisateurDao user = new UtilisateurDao();
         if (source==submit) {
            try{
                a=user.login(mail,password);
                if(a==0)
                {
                    throw new DatabaseException();
                }
                else
                {
                    this.dispose();
                    //Fenetre window= new Fenetre(a);
                    
                }
                    
                    
            }
            catch(DatabaseException j){
                System.out.println("Utilisateur introuvable");
            }
         }
    }
}

