package timetable_vue;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.sql.Date;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import timetable_dao.*;
import timetable_modele.*;


/**
 * Classe TimeTable : Permet l'affichage du planning
 * @author cleme
 */
public class TimeTable extends JPanel {
	private static final long serialVersionUID = 1;
	private JLabel[] label;
	private JLabel[] labelDisplay;
        private ArrayList<Integer> idseance;
	private Graphics g;
        private Calendar cal; 
        

        
        /**
         * 
         * @param ID
         * @param semaine
         * @throws SQLException
         * @throws ClassNotFoundException 
         * Constructeur de la classe TimeTable
         */
	public TimeTable(int ID, int semaine) throws SQLException, ClassNotFoundException {
		this.setPreferredSize(new Dimension(1366, 800));
		this.setBackground(Color.lightGray);
		this.setLayout(null);

		label = new JLabel[15];
		labelDisplay = new JLabel[5];

                SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
                Calendar ca= Calendar.getInstance();
                ca.set(Calendar.YEAR,2020);
                ca.set(Calendar.WEEK_OF_YEAR,semaine);

		// Les jours
                ca.set(Calendar.DAY_OF_WEEK,2);
		label[0] = new JLabel("Lundi");
		label[0].setBounds(170, 70, 200, 100);
                label[1] = new JLabel(dateFormat.format(ca.getTime()));
		label[1].setBounds(170, 85, 200, 100);
                
                ca.set(Calendar.DAY_OF_WEEK,3);
		label[2] = new JLabel("Mardi");
		label[2].setBounds(410, 70, 200, 100);
                label[3] = new JLabel(dateFormat.format(ca.getTime()));
		label[3].setBounds(410, 85, 200, 100);
                ca.set(Calendar.DAY_OF_WEEK,4);
		label[4] = new JLabel("Mercredi");
		label[4].setBounds(650, 70, 200, 100);
                label[5] = new JLabel(dateFormat.format(ca.getTime()));
		label[5].setBounds(650, 85, 200, 100);
                ca.set(Calendar.DAY_OF_WEEK,5);
		label[6] = new JLabel("Jeudi");
		label[6].setBounds(890, 70, 200, 100);
                label[7] = new JLabel(dateFormat.format(ca.getTime()));
		label[7].setBounds(890, 85, 200, 100);
                ca.set(Calendar.DAY_OF_WEEK,6);
		label[8] = new JLabel("Vendredi");
		label[8].setBounds(1130, 70, 200, 100);
                label[9] = new JLabel(dateFormat.format(ca.getTime()));
		label[9].setBounds(1130, 85, 200, 100);
		
		// Horaires
		label[10] = new JLabel("8h30 - 10h00");
		label[10].setBounds(53, 125, 80, 70);
		label[11] = new JLabel("10h15 - 11h45");
		label[11].setBounds(53, 230, 80, 70);
		label[12] = new JLabel("12h00 - 13h30");
		label[12].setBounds(53, 335, 80, 70);
		label[13] = new JLabel("13h45 - 15h15");
		label[13].setBounds(53, 440, 80, 70);
                label[14] = new JLabel("15h30 - 17h00");
		label[14].setBounds(53, 545, 80, 70);
		for (int i=0; i<15 ; i++) {
			label[i].setHorizontalAlignment(SwingConstants.CENTER);
			this.add(label[i]);
		}
                Connexion co= new Connexion("timetable","root","");
                UtilisateurDao u= new UtilisateurDao(co);
                Utilisateur user=u.find(ID);
                int droit=user.getDroit();
               
               
                if(droit == 3)
                {   
                    RecupererSeanceEnseignant(ID);
                }
                if(droit == 4)
                {  
                    RecupererSeanceEtudiant(ID);
                }
                
                if(!idseance.isEmpty())
                {
                        for(int i : idseance)
                        {
                            SeanceDao seancedao= new SeanceDao(co);
                            Seance seance=seancedao.find(i);
                            System.out.println(i);
                            if(seance.getSemaine()== semaine)
                                {   
                                    AfficherSeance(seance);
                                }
                        }
                
                }

                co.close();
                
              

	}
    /**
     * 
     * @param ID
     * @throws SQLException
     * @throws ClassNotFoundException 
     * Methode permettant de récuperer l'ensemble des seances d'un étudiant
     */    
    private void RecupererSeanceEtudiant(int ID) throws SQLException, ClassNotFoundException
    {    
        Connexion co= new Connexion("timetable","root","");
        EtudiantDao etudiantdao=new EtudiantDao(co);
        Etudiant etudiant=etudiantdao.find(ID);
        int idgroupe=etudiant.getId_groupe();
        GroupeDao groupedao=new GroupeDao(co);
        Groupe groupe=groupedao.find(idgroupe);
        idseance= groupe.getListe_seance();
        co.close();
        
    }
    /**
     * 
     * @param ID
     * @throws SQLException
     * @throws ClassNotFoundException 
     * Methode permettant de récuperer l'ensemble des seances d'un professeur
     */
        private void RecupererSeanceEnseignant(int ID) throws SQLException, ClassNotFoundException
    {    
        Connexion co= new Connexion("timetable","root","");
        EnseignantDao enseignantdao=new EnseignantDao(co);
        Enseignant enseignant=enseignantdao.find(ID);
        idseance= enseignant.getListe_seances();
        co.close();
        
    }
    
    /**
     * 
     * @param g 
     * Methode graphique pour l'affichage d'un tableau 
     */
    @Override
    public void paintComponent(Graphics g) {  
        g.setColor(Color.black);
    	
    	// Lignes verticales
        g.drawLine(50, 110, 50, 675);
        g.drawLine(150, 110, 150, 675);
        g.drawLine(390, 110, 390, 675);
        g.drawLine(630, 110, 630, 675);
        g.drawLine(870, 110, 870, 675);
        g.drawLine(1110, 110, 1110, 675);
        g.drawLine(1350, 110, 1350, 675);
        
        // Lignes horizontales
        g.drawLine(50, 110, 1350, 110);
        g.drawLine(50, 150, 1350, 150);
        g.drawLine(50, 255, 1350, 255);
        g.drawLine(50, 360, 1350, 360);
        g.drawLine(50, 465, 1350, 465);
        g.drawLine(50, 570, 1350, 570);
        g.drawLine(50, 675, 1350, 675);
          
    }
    
    /**
     * 
     * @param seance
     * @throws SQLException
     * @throws ClassNotFoundException 
     * Methode d'affichage du planning
     */
    private void AfficherSeance(Seance seance) throws SQLException, ClassNotFoundException{
        
        
        // Affichage des blocs
        long heuredebut1 = (seance.getHeure_debut()).getTime();
        long heurefin1 = (seance.getHeure_fin()).getTime();
        
        int heuredebut = (int)heuredebut1/(1000*60*60)+1;
        int heurefin = (int)heurefin1/(1000*60*60)+1;
        
        cal = Calendar.getInstance();
        Date date = seance.getJour();
        cal.setTime(date);
        int jour=cal.get(Calendar.DAY_OF_WEEK);
        
        
        	Rectangle coordJour = null;
        	Rectangle coordHeureDebut = null;
        	Rectangle coordHeureFin = null;

        	switch (jour) {
				case 2:
					coordJour = label[0].getBounds();
					break;
					
				case 3:
					coordJour = label[2].getBounds();
					break;
					
				case 4:
					coordJour = label[4].getBounds();
					break;
					
				case 5:
					coordJour = label[6].getBounds();
					break;
					
				case 6:
					coordJour = label[8].getBounds();
					break;
	
				default:
					break;
			}
        	
        	switch (heuredebut) {
				case 8:
					coordHeureDebut = label[10].getBounds();
					break;
					
				case 10:
					coordHeureDebut = label[11].getBounds();
					break;
					
				case 12:
					coordHeureDebut = label[12].getBounds();
					break;
					
				case 13:
					coordHeureDebut = label[13].getBounds();
					break;
                                case 15:
					coordHeureDebut = label[14].getBounds();
					break;
				default:
					break;
			}
        	
        	switch (heurefin) {
				case 10:
					coordHeureFin = label[10].getBounds();
					break;
					
				case 11:
					coordHeureFin = label[11].getBounds();
					break;
					
				case 13:
					coordHeureFin = label[12].getBounds();
					break;
					
				case 15:
					coordHeureFin = label[13].getBounds();
					break;
                                case 17:
					coordHeureFin = label[14].getBounds();
					break;
	
				default:
					break;
			}
        	
        	if (coordJour != null && coordHeureDebut != null && coordHeureFin != null) {
                        
                        Connexion co= new Connexion("timetable","root","");
                        int coursID = seance.getId_cours();
                        CoursDao coursdao = new CoursDao(co);
                        Cours cours = coursdao.find(coursID);
                        String nom = cours.getNom();
                        labelDisplay[0] = new JLabel(nom);
                        labelDisplay[0].setBounds(coordJour.x, coordHeureDebut.y + 5, coordJour.width, coordHeureFin.y + coordHeureFin.height - coordHeureDebut.y - 10);
                        
                        ArrayList<Integer> enseignantID = seance.getListe_enseignants();
                        if(enseignantID.size()== 1)
                        {
                            EnseignantDao e = new EnseignantDao(co);
                            Enseignant enseignant = e.find(enseignantID.get(0));
                            String nomEnseignant = enseignant.getNom();
                            labelDisplay[1] = new JLabel("M."+nomEnseignant);
                            labelDisplay[1].setBounds(coordJour.x, coordHeureDebut.y + 20, coordJour.width, coordHeureFin.y + coordHeureFin.height - coordHeureDebut.y - 10);
                        
                        }
                        
                        else
                        {
                            EnseignantDao e = new EnseignantDao(co);
                            Enseignant enseignant = e.find(enseignantID.get(0));
                            String nomEnseignant = enseignant.getNom();
                            enseignant = e.find(enseignantID.get(1));
                            String nomEnseignant2 = enseignant.getNom();       
                            labelDisplay[1] = new JLabel("M."+nomEnseignant+", "+"M."+nomEnseignant2 + "...");
                            labelDisplay[1].setBounds(coordJour.x, coordHeureDebut.y + 20, coordJour.width, coordHeureFin.y + coordHeureFin.height - coordHeureDebut.y - 10);
                        
                        }
                        ArrayList<Integer>groupeID=seance.getListe_groupes();
                        if(groupeID.size() == 1)
                        {
                            GroupeDao groupedao = new GroupeDao(co);
                            Groupe groupe = groupedao.find(groupeID.get(0));
                            nom=groupe.getNom();
                            int promoid=groupe.getId_promotion();
                            PromotionDao promodao = new PromotionDao(co);
                            Promotion prom=promodao.find(promoid);
                            String nomprom=prom.getNom();
                            labelDisplay[2] = new JLabel(nomprom+" "+nom);
                            labelDisplay[2].setBounds(coordJour.x, coordHeureDebut.y + 35, coordJour.width, coordHeureFin.y + coordHeureFin.height - coordHeureDebut.y - 10);
                                               
                        }
                        else
                        {
                            GroupeDao groupedao = new GroupeDao(co);
                            Groupe groupe = groupedao.find(groupeID.get(0));
                            Groupe groupe2 = groupedao.find(groupeID.get(1));
                            String nom1=groupe.getNom();
                            String nom2=groupe.getNom();
                            
                            int promoid=groupe.getId_promotion();
                            PromotionDao promodao = new PromotionDao(co);
                            Promotion prom=promodao.find(promoid);
                            String nomprom=prom.getNom();
                            
                            promoid=groupe2.getId_promotion();
                            promodao = new PromotionDao(co);
                            prom=promodao.find(promoid);
                            String nomprom2=prom.getNom();
                            labelDisplay[2] = new JLabel(nomprom+" "+nom1+", "+nomprom2+" "+nom2+"...");
                            labelDisplay[2].setBounds(coordJour.x, coordHeureDebut.y + 35, coordJour.width, coordHeureFin.y + coordHeureFin.height - coordHeureDebut.y - 10);
                                               
                        }
                        
                        
                        ArrayList<Integer>salleID=seance.getListe_salles();
                        if(salleID.size() == 1)
                        {
                            SalleDao s=new SalleDao(co);
                            Salle salle=s.find(salleID.get(0));
                            String nomSalle=salle.getNom();
                            int siteID = salle.getId_site();
                            SiteDao sitedao = new SiteDao(co);
                            Site site1=sitedao.find(siteID);
                            String site=site1.getNom();
                            labelDisplay[3] = new JLabel(site+", "+nomSalle);
                            labelDisplay[3].setBounds(coordJour.x, coordHeureDebut.y + 50, coordJour.width, coordHeureFin.y + coordHeureFin.height - coordHeureDebut.y - 10);
                        
                        }
                        
                                               
                        else
                        {
                            SalleDao s=new SalleDao(co);
                            Salle salle=s.find(salleID.get(0));
                            String nomSalle1=salle.getNom();
                            int siteID = salle.getId_site();
                            SiteDao sitedao = new SiteDao(co);
                            Site site=sitedao.find(siteID);
                            String site1=site.getNom();
                            
                            salle=s.find(salleID.get(1));
                            String nomSalle2=salle.getNom();
                            siteID = salle.getId_site();
                            site=sitedao.find(siteID);
                            String site2=site.getNom();
                            labelDisplay[3]= new JLabel(site1+", "+nomSalle1+"; "+site2+", "+nomSalle2);
                            labelDisplay[3].setBounds(coordJour.x, coordHeureDebut.y + 50, coordJour.width, coordHeureFin.y + coordHeureFin.height - coordHeureDebut.y - 10);
                        
                        }
                        
                        int coursTypeID = seance.getId_type_cours();
                        Type_coursDao courstypedao = new Type_coursDao(co);
                        Type_cours coursType = courstypedao.find(coursTypeID);
                        nom=coursType.getNom();
                        labelDisplay[4] = new JLabel(nom);
                        labelDisplay[4].setBounds(coordJour.x, coordHeureDebut.y + 65, coordJour.width, coordHeureFin.y + coordHeureFin.height - coordHeureDebut.y - 10);

                        
    			this.add(labelDisplay[0]);
    			this.add(labelDisplay[1]);
                        this.add(labelDisplay[2]);
                        this.add(labelDisplay[3]);
                        this.add(labelDisplay[4]);
                        
                        co.close();
    		}

        }

}