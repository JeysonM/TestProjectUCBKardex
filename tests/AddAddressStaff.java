
import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import java.util.Iterator;

import org.hamcrest.Matcher;
import org.junit.Rule;
import org.junit.Test;


public class AddAddressStaff {
	
	
	@Test
	public void testAddAddressToOneStaff()
	{
		
		Database database = new Database();
		Staff staff001 = new Staff("Pepe Martillo staff 1",1991,"001");	
		staff001.setAddress("Av. America", "Cochabamba","1234");
		database.addPerson(staff001);
		String addressStaff001 = staff001.getAddress().toString();
		assertThat(((Staff) database.firstPerson()), is(instanceOf(Staff.class)));
		assertEquals(((Person) database.firstPerson()).getAddress().toString(),addressStaff001);
	}
	
	@Test
	public void testAddFullAddressToOneStaff()
	{
		Database database = new Database();
		Staff staff001 = new Staff("Pepe Martillo staff 2",1991,"001");	
		staff001.setFullAddress("Av. America", "Cochabamba","1234","Bolivia");
		database.addPerson(staff001);
		String addressStaff001 = staff001.getAddress().toString();
		assertThat(((Staff) database.firstPerson()), is(instanceOf(Staff.class)));
		assertEquals(((Person) database.firstPerson()).getAddress().toString(),addressStaff001);
	}

}
