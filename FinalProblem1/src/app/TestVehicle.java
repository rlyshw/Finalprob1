package app;

import java.util.HashMap;
import java.util.UUID;

public class TestVehicle {
	
	public HashMap<UUID, Vehicle> HMap;
	public Person a; 
	public Car car; 
	public Truck truck; 
	public Person b;
	public Motorcycle motorcycle; 
	

	public TestVehicle(){
		HMap = new HashMap<UUID, Vehicle>();
		a = new Person("Joe", "Shmoe");
		car = new Car("Honda", "Red", 1110, a, 4);
		truck = new Truck("Ford", "Silver",2220,a,2);
		b = new Person("Jane", "Shmane");
		motorcycle = new Motorcycle("Yamaha","Red",550,null,false);
		
		truck.transferOwnership(b);
		this.HMap.put(UUID.randomUUID(), car);
		this.HMap.put(UUID.randomUUID(), truck);
		this.HMap.put(UUID.randomUUID(), motorcycle);
		
		
	}

}
