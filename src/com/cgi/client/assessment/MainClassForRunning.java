package com.cgi.client.assessment;
/**
 * This is the main class for testing the working of the ceiling fan
 * @author Neelesh
 *
 */
public class MainClassForRunning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Fan fan=new Fan();
		
	fan.displayDetails();   /**Displaying the details of the fan initially**/
	fan.increaseSpeed();	/**Increasing fan speed**/
	fan.displayDetails();	/**Displaying the details of fan after increasing the speed**/
	fan.increaseSpeed();
	fan.displayDetails();
	fan.changeDirection();  /**Direction of the fan is reversed**/
	fan.displayDetails();
	fan.increaseSpeed();  
	fan.displayDetails();
	}

}
