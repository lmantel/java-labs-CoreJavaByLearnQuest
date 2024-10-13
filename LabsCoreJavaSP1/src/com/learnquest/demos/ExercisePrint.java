package com.learnquest.demos;

public class ExercisePrint {

	public static void main(String[] args) {
		Shape[] shapes = new Shape[] {
				new Rectangle(2, 4),
				new Rectangle("A Rectangle", "Red", 5, 8),
				new Square(3),
				new Square("A Square", "Orange", 5),
				new Cube(1),
				new Cube(4, "A Cube", "Yellow"),
				new Box(2,4,6),
				new Box(3,5,7,"A Box", "Green"),
				new Circle(16),
				new Circle("A Circle", "Blue", 16)
				};
		
		for (Shape shape : shapes) {
			System.out.println(shape);
		}
	}

}
