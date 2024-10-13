package com.learnquest.demosapps;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Consumer;

import com.learnquest.demos.transport.Car;
import com.learnquest.demos.transport.SUV;
import com.learnquest.demos.transport.SpeedException;
import com.learnquest.demos.transport.SportsCar;
import com.learnquest.demos.transport.StationWagon;
import com.learnquest.demos.transport.Train;
import com.learnquest.demos.transport.Vehicle;

public class VehicleApp {
	
	/*
	public static void travelAtSpeedLimit(Vehicle vehicle) {
		vehicle.setSpeed(55);
	}
	*/
	
	public static void race(Object[] raceCars) {
		for (Object raceCar: raceCars) {
			if (raceCar instanceof SportsCar) {
				SportsCar racer = (SportsCar) raceCar;
				racer.race();
			}
		}
	}
	
	public static void race(SportsCar[] raceCars) {
		for (SportsCar raceCar: raceCars) {
			raceCar.race();
		}
	}
	
	public static void race(Collection<SportsCar> raceCars) {
		for (SportsCar raceCar: raceCars) {
			raceCar.race();
		}
	}
		
	public static List<Vehicle> populate() {
		
		List<Vehicle> vehicles = new ArrayList<>();
		
		//Car car54 = new Car();
		//Car car54;
		try {
			Car car54 = new SportsCar();
			car54.setName("Car 54");
			car54.setSpeed(20);
			car54.setManufactured(LocalDate.of(1961, 9, 17));
			vehicles.add(car54);
		} catch (SpeedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Car mach5;
		try {
			Car mach5 = new SportsCar();
			mach5.setName("Mach V");
			mach5.setSpeed(250);
			mach5.setManufactured(LocalDate.of(1967, 4, 2));
			vehicles.add(mach5);
		} catch (SpeedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Car mach6;
		try {
			Car mach6 = new SportsCar("Mach VI", 250, 21, true);
			mach6.setManufactured(LocalDate.of(1927, 4, 2));
			vehicles.add(mach6);
		} catch (SpeedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Car mach7;
		try {
			Car mach7 = new SportsCar("Mach VII", 250, 21, true);
			mach7.setManufactured(LocalDate.of(1947, 4, 2));
			vehicles.add(mach7);
		} catch (SpeedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Car wagon = new StationWagon("Wagon flia cia");
		//StationWagon wagon;
		try {
			StationWagon wagon = new StationWagon("Wagon flia cia");
			wagon.setManufactured(LocalDate.of(1987, 4, 2));
			wagon.setCurrentCargoLoad(500);
			wagon.setSpeed(75);
			vehicles.add(wagon);
		} catch (SpeedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//SUV suv;
		try {
			SUV suv = new SUV("SUV flia 2 cia");
			suv.setManufactured(LocalDate.of(1977, 4, 2));
			suv.setCurrentCargoLoad(500);
			suv.setSpeed(25);
			vehicles.add(suv);
		} catch (SpeedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Train train = new Train("City of new orleans");
		vehicles.add(train);
		
		return vehicles;
		
	}
	
	public static void main(String[] args) {
		
			
		/*
		for (Vehicle vehicle: new Vehicle[]{car54, mach5, mach6, mach7, wagon, suv, train}) {
			if (vehicle instanceof SportsCar) {
				((SportsCar) vehicle).race();
			} else {
				Vehicle.travelAtSpeedLimit(vehicle);
			}
			//System.out.printf("%s is %d yeards old and is traveling at %d mph%n", car.getName(), car.getAge(), car.getSpeed());
			System.out.println(vehicle);
		}
		*/
		
		/*
		for (Vehicle vehicle: new Vehicle[]{car54, mach5, mach6, mach7, wagon, suv, train}) {
			vehicle.stop();
			System.out.println(vehicle);
		}
		*/
		
		//List<Vehicle> vehicles = Arrays.asList(car54, mach5, mach6, mach7, wagon, suv, train);
		
		/*
		vehicles.forEach(vehicle -> {
			if (vehicle instanceof SportsCar) {
				((SportsCar) vehicle).race();
			} else {
				Vehicle.travelAtSpeedLimit(vehicle);
			}
			System.out.println(vehicle);
		});
		*/
		
		/*
		vehicles.forEach(vehicle -> Vehicle.travelAtSpeedLimit(vehicle));
		vehicles.forEach(vehicle -> System.out.println(vehicle));
						
		vehicles.forEach(Vehicle::travelAtSpeedLimit);
		vehicles.forEach(System.out::println);
		
		vehicles.forEach(Vehicle::stop); //vehicle -> vehicle.stop
		vehicles.forEach(System.out::println);
		
		*/
		
		List<Vehicle> vehicles = populate();
		
		Consumer<Vehicle> go25 = vehicle -> {
			try {
				vehicle.setSpeed(25);
			} catch (SpeedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		};
		vehicles.forEach(go25.andThen(System.out::println));
		
		Collection<Integer> speeds = Arrays.asList(15, 25, 35, 55, 70, 75, 80);
		Consumer<Vehicle> stop = Vehicle::stop;
		
		speeds.forEach(speed -> {
			Consumer<Vehicle> setSpeed = vehicle -> {
				try {
					vehicle.setSpeed(speed);
				} catch (SpeedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			};
			vehicles.forEach(setSpeed.andThen(System.out::println));
			Consumer<Vehicle> speedAndPrint = setSpeed.andThen(System.out::println);
			vehicles.forEach(speedAndPrint.andThen(stop).andThen(System.out::println));
		});
			
		
		
	}

}
