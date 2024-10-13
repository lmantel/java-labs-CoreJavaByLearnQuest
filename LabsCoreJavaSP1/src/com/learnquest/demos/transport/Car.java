/**
 * 
 */
package com.learnquest.demos.transport;

/**
 * @author Developer
 *
 */
import java.time.LocalDate;
import java.time.Period;

//public class Car {
public abstract class Car implements Vehicle {
	
	public Car() {};
	
	public Car(String name) throws SpeedException {
		this(name, 0, 0, false);
	}
	
	public Car(String name, int speed, int fuel, boolean running) throws SpeedException {
		setName(name);
		setSpeed(speed);
		setGasoline(fuel);
		setEngineState(running);		
	}
	
	//private static final int MAX_SPEED = 350;
	
	public abstract int getMaxSpeed();
	
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private int speed;
	
	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int newSpeed) throws SpeedException{
		//int maxSpeed = 65;
		//speed = newSpeed <= MAX_SPEED ? newSpeed : MAX_SPEED;
		//speed = Math.min(newSpeed, MAX_SPEED);
		//speed = Math.min(newSpeed, getMaxSpeed());
		if (newSpeed > getMaxSpeed()) {
			throw new SpeedException(String.format("%s cannot go %dmph. Max speed is %d",getName(), newSpeed, getMaxSpeed()));
		}
		speed = newSpeed;
	}
	
	private int gasoline;
	
	public int getGasoline() {
		return gasoline;
	}

	public void setGasoline(int gasoline) {
		this.gasoline = gasoline;
	}

	public boolean isEngineState() {
		return engineState;
	}

	public void setEngineState(boolean engineState) {
		this.engineState = engineState;
	}

	private boolean engineState;
	
	private LocalDate manufactured;
	
	public LocalDate getManufactured() {
		return manufactured;
	}

	public void setManufactured(LocalDate manufactured) {
		this.manufactured = manufactured;
	}
	
	public int getAge() {
		return Period.between(getManufactured(), LocalDate.now()).getYears();
	}

	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return name.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Car))
			return false;
		
		Car other = (Car) obj;
		
		return name.equals(other.getName());
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		if (manufactured == null)
			return String.format("%s is %d yeards old and is traveling at %d mph", getName(), getSpeed());
		else
			return String.format("%s is %d yeards old and is traveling at %d mph", getName(), getAge(), getSpeed());
	}

	
		
		
	

}
