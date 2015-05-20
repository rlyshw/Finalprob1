package app;

public class Truck extends Vehicle implements IVehicle {
	public Truck(String name, String color, int weight, Person owner, int NumberOfAxels) {
		super(name, color, weight, owner);
		// TODO Auto-generated constructor stub
	}

	public int NumberOfAxels;
}
