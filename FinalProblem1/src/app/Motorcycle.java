package app;

public class Motorcycle extends Vehicle implements IVehicle {
	public Motorcycle(String name, String color, int weight, Person owner, boolean hasSideCar) {
		super(name, color, weight, owner);
		// TODO Auto-generated constructor stub
	}

	public boolean hasSideCar;

}
