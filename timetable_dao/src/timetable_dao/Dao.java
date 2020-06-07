package timetable_dao;

/**
 *
 * @author romai
 */

/**
 *
 * Interface peremttant le lien entre la BDD et le Projet
 * @param <T>
 */
public abstract class Dao<T> {
  protected Connexion connect = null;
  
  /**
   * Constructeur par defaut d'une classe Dao
   * @param conn 
   */ 
  public Dao(Connexion conn){
    this.connect = conn;
  }
   
  /**
  * Méthode de création d'une table
  * @param obj
  * @return boolean 
  */
  public abstract boolean create(T obj);

  /**
  * Méthode pour effacer une table
  * @param obj
  * @return boolean 
  */
  public abstract boolean delete(T obj);

  /**
  * Méthode de mise à jour d'une table
  * @param obj
  * @return boolean
  */
  public abstract boolean update(T obj);

  /**
  * Méthode de recherche des informations
  * @param id
  * @return T
  */
  public abstract T find(int id);
}
