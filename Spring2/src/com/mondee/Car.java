package com.mondee;

public class Car implements Vehicle{
	
	private String fuelType;
	private int speed;
	

	public String getFuelType() {
		return fuelType;
	}


	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}


	public int getSpeed() {
		return speed;
	}


	public void setSpeed(int speed) {
		this.speed = speed;
	}


	public void move() {
		System.out.println("Car Started!!!");
		System.out.println("Fuel Type "+fuelType);
		System.out.println("Max Speed "+speed);
		
	}
}
