package com.learnquest.demos.transport;

@SuppressWarnings("unused")
public abstract class Cargo extends Car {

	private int cargoCapacity;
	private int currentCargoLoad;

	public Cargo() {
		super();
	}

	@Override
	public void setSpeed(int newSpeed) throws SpeedException {
		// TODO Auto-generated method stub
		super.setSpeed(newSpeed - getCurrentCargoLoad() / 100);
	}

	public void setCurrentCargoLoad(int currentCargoLoad) {
		this.currentCargoLoad = currentCargoLoad;
	}

	public int getCurrentCargoLoad() {
		return currentCargoLoad;
	}

	public Cargo(String name) throws SpeedException {
		super(name);
	}

	public Cargo(String name, int speed, int fuel, boolean running) throws SpeedException {
		super(name, speed, fuel, running);
	}

	@Override
	public int getMaxSpeed() {
		// TODO Auto-generated method stub
		return 100;
	}
	
	

}