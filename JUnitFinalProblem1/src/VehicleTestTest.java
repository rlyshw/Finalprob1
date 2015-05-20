import static org.junit.Assert.*;

import java.util.UUID;
import java.util.function.BiConsumer;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import app.Motorcycle;
import app.TestVehicle;
import app.Truck;
import app.Vehicle;

public class VehicleTestTest {
	TestVehicle uut;

	@Before
	public void setUp() throws Exception {
		uut = new TestVehicle();
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void countTest() {
		assertEquals(uut.HMap.size(),3);
	}
	@Test
	public void ownershipTest(){
		uut.HMap.forEach(new BiConsumer<UUID, Vehicle>(){
			@Override
			public void accept(UUID t, Vehicle u) {
				// TODO Checks if it is a truck, then asserts that it has the correct owner.
				if(u.getClass().isInstance(Truck.class)){
					assertEquals(((Truck)u).Owner,uut.b);
				};
			}
		});
	}
	@Test
	public void motorcycleTest(){
		uut.HMap.forEach(new BiConsumer<UUID, Vehicle>(){
			@Override
			public void accept(UUID t, Vehicle u) {
				// TODO Checks if it is a truck, then asserts that it has the correct owner.
				if(u.getClass().isInstance(Motorcycle.class)){
					assertEquals(u.getClass(),Motorcycle.class);
				};
			}
		});
	}

}
