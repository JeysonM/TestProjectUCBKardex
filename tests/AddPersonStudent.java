
import static org.junit.Assert.*;

import java.util.Iterator;

import org.hamcrest.Matcher;
import org.junit.Rule;
import org.junit.Test;


public class AddPersonStudent {
	
    //public Database database = new Database();

	@Test
	public void testAddOnePersonStudentInDataBase()
	{
		Database database = new Database();
		Student student001 = new Student("Pepe Martillo",1991,"001");	
		student001.setAddress("Av. America", "Cochabamba","1234");
		student001.enterMarks(8,7,4);
		database.addPerson(student001);
		assertEquals(((Person) database.firstPerson()).getName(), "Pepe Martillo");
	}
	
	@Test
	public void testAddTwoPersonStudentInDataBase()
	{
		Database database = new Database();
		
		Student student001 = new Student("Pepe Martillo",1991,"001");	
		student001.setAddress("Av. America", "Cochabamba","1234");
		student001.enterMarks(8,7,4);
		database.addPerson(student001);
		
		Student student002 = new Student("Darth Vader",1970,"002");
		student002.setAddress("Death Star","Far far galaxy","2396");
    	student002.enterMarks(9,9,8);
		database.addPerson(student002);
		
		assertEquals(((Person) database.getAllPersons().get(0)).getName(), "Pepe Martillo");
		assertEquals(((Person) database.getAllPersons().get(1)).getName(), "Darth Vader");
		
	}

}
