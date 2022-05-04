package com.cgi.client.assessment;
/**
 * Implementation of ceiling fan 
 * @author Neelesh
 *
 */
public class Fan {
	
	private final static int OFF = 0;
	private final static int MAX_SPEED = 2;
	private int currentSpeed;
	private boolean isReverseDirection;
	
	public Fan() {
		currentSpeed = OFF;
		isReverseDirection = false;
	}
	
	public int getCurrentSpeed() {
		return currentSpeed;
	}

	public boolean isReverseDirection() {
		return isReverseDirection;
	}

	public void increaseSpeed() {
		if(currentSpeed == MAX_SPEED) {
			currentSpeed = OFF;
		}
		else {
			currentSpeed++;
		}
	}
	
	public void changeDirection() {
		isReverseDirection = !isReverseDirection;
	}

	public void displayDetails() {
		System.out.println("Current state of the fan is:");
		System.out.println("Speed: " + currentSpeed);
		System.out.println("Direction: " + (isReverseDirection? "REVERSE" : "NORMAL") );
	}

}
