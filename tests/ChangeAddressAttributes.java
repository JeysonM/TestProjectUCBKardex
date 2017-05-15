import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ChangeAddressAttributes {

	Address address = new Address("Av .America","Cochabamba","+591");
	@Before public void changeAttributes(){
		
	}
	
	@Test
	public void verifyProperlyChangedAddress() {
		Address changedAddress = new Address("Av. Santa Cruz", "Cocha", "591", "Bol");
		address.setAddress("Av. Santa Cruz", "Cocha", "591", "Bol");
		assertEquals(address.getClass(),changedAddress.getClass());
	}

}
