package auto;

public class Car {
	
	private String make;
	private String model;
	private int year;
		
	public Car(String make, String model, int year) {
		this.make = make;
		this.model = model;
		this.year = year;
	}
		
	public Car(String model, int year) {
		this.model = model;
		this.year = year;
	}

	public String getCarMake() {
		return make;
	}

	public void setCarMake(String make) {
		this.make = make;
	}

	public String getCarModel() {
		return model;
	}

	public void setCarModel(String model) {
		this.model = model;
	}

	public int getCarYear() {
		return year;
	}

	public void setCarYear(int year) {
		this.year = year;
	}
	
	public String toString() {
		return "Car make: " + make + ", model: " + model + ", year: " + year;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1 = new Car("Ford", "F150", 2010);
		Car car2 = new Car("Chevrolet", "Corsa", 2010);
		Car car3 = new Car("Toyota", "Etios", 2014);
		
		Options opt1 = new Options("satellite","AutoDrive","FlexFuel");
		Options opt2 = new Options("Terrestrial","standard","Gas");
		Options opt3 = new Options("satellite","standard","DualFuel");
		
		System.out.println(car1.toString());
		System.out.println(opt1.toString());
		System.out.println(car2.toString());
		System.out.println(opt2.toString());
		System.out.println(car3.toString());
		System.out.println(opt3.toString());  

	}

}
