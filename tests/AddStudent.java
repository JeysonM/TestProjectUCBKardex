
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;


public class AddStudent {
	@Test
	public void testAddOneStudentInDataBase(){
		Database database = new Database();
		Student student001 = new Student("Pepe Martillo",1991,"001");	
		student001.setAddress("Av. America", "Cochabamba","1234");
		student001.enterMarks(8,7,4);
		database.addPerson(student001);
		assertThat(((Person) database.firstPerson()), is(instanceOf(Student.class)));
		assertEquals(((Person) database.firstPerson()).getName(), "Pepe Martillo");
	}
	
	@Test
	public void testAddTwoStudentsInDataBase()
	{	Database database = new Database();
	
		Student student001 = new Student("Pepe Martillo",1991,"001");	
		student001.setAddress("Av. America", "Cochabamba","1234");
		student001.enterMarks(8,7,4);
		database.addPerson(student001);
		
		Student student002 = new Student("Darth Vader",1970,"002");
		student002.setAddress("Death Star","Far far galaxy","2396");
    	student002.enterMarks(9,9,8);
		database.addPerson(student002);
		
		assertThat(((Person) database.firstPerson()), is(instanceOf(Student.class)));
		assertEquals(((Person) database.getAllPersons().get(0)).getName(), "Pepe Martillo");
		assertEquals(((Person) database.getAllPersons().get(1)).getName(), "Darth Vader");
	}

}
