
import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;


public class AddAddressStudent {
	
	
	@Test
	public void testAddAddressToOneStudent()
	{
		
		Database database = new Database();
		Student student001 = new Student("Pepe Martillo",1991,"001");	
		student001.setAddress("Av. America", "Cochabamba","1234");
		database.addPerson(student001);
		String addressStudent001 = student001.getAddress().toString();
		assertThat(((Student) database.firstPerson()), is(instanceOf(Student.class)));
		assertEquals(((Person) database.firstPerson()).getAddress().toString(),addressStudent001);
	}
	
	@Test
	public void testAddFullAddressToOneStudent()
	{
		Database database = new Database();
		Student student001 = new Student("Pepe Martillo",1991,"001");	
		student001.setFullAddress("Av. America", "Cochabamba","1234","Bolivia");
		database.addPerson(student001);
		String addressStudent001 = student001.getAddress().toString();
		assertThat(((Student) database.firstPerson()), is(instanceOf(Student.class)));
		assertEquals(((Person) database.firstPerson()).getAddress().toString(),addressStudent001);
	}

}
