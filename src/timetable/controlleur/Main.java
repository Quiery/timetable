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
public class Main {
	public static void main(String[] args) {
		TimeTable t = new TimeTable();
		new Window(t, "TimeTable Manager").setVisible(true);
	}
}