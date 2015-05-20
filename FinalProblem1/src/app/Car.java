package app;

public class Car extends Vehicle implements IVehicle {
	public Car(String name, String color, int weight, Person owner, int NumberOfDoors) {
		super(name, color, weight, owner);
		// TODO Auto-generated constructor stub
	}

	private int NumberOfDoors;
}
