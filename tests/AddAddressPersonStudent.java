
import static org.junit.Assert.*;

import java.util.Iterator;

import org.hamcrest.Matcher;
import org.junit.Rule;
import org.junit.Test;


public class AddAddressPersonStudent {
	
	
	@Test
	public void testAddAddressToOnePersonStudent()
	{
		
		Database database = new Database();
		Student student001 = new Student("Pepe Martillo",1991,"001");	
		student001.setAddress("Av. America", "Cochabamba","1234");
		database.addPerson(student001);
		String addressStudent001 = student001.getAddress().toString();
		assertEquals(((Person) database.firstPerson()).getAddress().toString(),addressStudent001);
	}
	
	@Test
	public void testAddFullAddressToOnePersonStudent()
	{
		Database database = new Database();
		Student student001 = new Student("Pepe Martillo",1991,"001");	
		student001.setFullAddress("Av. America", "Cochabamba","1234","Bolivia");
		database.addPerson(student001);
		String addressStudent001 = student001.getAddress().toString();
		assertEquals(((Person) database.firstPerson()).getAddress().toString(),addressStudent001);
	}

}