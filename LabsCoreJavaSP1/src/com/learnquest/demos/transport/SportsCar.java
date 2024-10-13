package com.learnquest.demos.transport;

public class SportsCar extends Car {

	
	
	@Override
	public int getMaxSpeed() {
		// TODO Auto-generated method stub
		return 350;
	}

	public SportsCar() {
		// TODO Auto-generated constructor stub
	}

	public SportsCar(String name) throws SpeedException {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public SportsCar(String name, int speed, int fuel, boolean running) throws SpeedException {
		super(name, speed, fuel, running);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void setSpeed(int newSpeed) throws SpeedException {
		// TODO Auto-generated method stub
		super.setSpeed((int) (newSpeed * 1.10));
	}
	
	protected double speed;
	
	public void setSpeed(double newSpeed) {
		// TODO Auto-generated method stub
		this.speed = newSpeed;
	}
	
	public void race() {
		try {
			setSpeed(getMaxSpeed());
		} catch (SpeedException e) {
			// TODO Auto-generated catch block
			System.out.printf("Unexpected error: we tried to race but we couldnt");
			e.printStackTrace();
		}
	}
	
	/*
	 * public double getSpeed() { return speed; }
	 */

}
