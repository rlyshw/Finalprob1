package app;

public abstract class Vehicle {
	public String Name;
	public String Color;
	public int Weight;
	public Person Owner;

	public void transferOwnership(Person newOwner){
		this.Owner = newOwner;
	}

	public Vehicle(String name, String color, int weight, Person owner) {
		super();
		Name = name;
		Color = color;
		Weight = weight;
		Owner = owner;
	}

}
