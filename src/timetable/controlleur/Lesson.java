/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timetable.controlleur;

/**
 *
 * @author cleme
 */
import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class Lesson {
	private int id;
	private String lib;
	
	/**
	 * Instanciate a lesson
	 * @param id
	 */
	public Lesson(int id) {
		MySQL m = new MySQL();
		ResultSet rs = m.query("SELECT id, lib FROM Lessons WHERE id = " + id + ";");
		
		try {
			while (rs.next()) {
				this.id = rs.getInt("id");
				lib = rs.getString("lib");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * Get id
	 * @return int id
	 */
	public int getId() {
		return id;
	}
	
	/**
	 * Get lib
	 * @return string lib
	 */
	public String getLib() {
		return lib;
	}
	
	/**
	 * To string
	 */
	public String toString() {
		return this.lib;
	}
	
	/**
	 * Find all lessons
	 * @return array Lessons
	 */
	public static List<Lesson> findAll() {
		List<Lesson> ls = new ArrayList<Lesson>();
		MySQL m = new MySQL();
		ResultSet rs = m.query("SELECT id FROM Lessons;");
		
		try {
			while (rs.next()) {
				ls.add(new Lesson(rs.getInt("id")));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return ls;
	}
}