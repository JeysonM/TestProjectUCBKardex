
import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import java.util.Iterator;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;


public class AddStaff {
	
	
	@Test
	public void testAddOneStaffInDataBase()
	{
		Database database = new Database();
		Staff staff001 = new Staff("Luke Skywalker", 1980, "005");	
		database.addPerson(staff001);
		assertThat(((Staff) database.firstPerson()), is(instanceOf(Staff.class)));
		assertEquals(((Staff) database.firstPerson()).getName(), "Luke Skywalker");
	}
	
	@Test
	public void testAddTwoStaffsInDataBase()
	{
		Database database = new Database();
		
		Staff staff001 = new Staff("Luke Skywalker",1991,"001");	
		staff001.setAddress("Av. America", "Cochabamba","1234");
		database.addPerson(staff001);
		
		Staff staff002 = new Staff("Obi Wan Kenobi",1970,"002");
		staff002.setAddress("Death Star","Far far galaxy","2396");
		
		database.addPerson(staff002);
		assertThat(((Person) database.getAllPersons().get(0)), is(instanceOf(Staff.class)));
		assertThat(((Person) database.getAllPersons().get(1)), is(instanceOf(Staff.class)));
		assertEquals(((Person) database.getAllPersons().get(0)).getName(), "Luke Skywalker");
		assertEquals(((Person) database.getAllPersons().get(1)).getName(), "Obi Wan Kenobi");
		
	}

}
