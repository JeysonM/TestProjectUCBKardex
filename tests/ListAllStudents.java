import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ListAllStudents {

	
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
	
	@Before
	public void setUpStreams() {
	    System.setOut(new PrintStream(outContent));
	    System.setErr(new PrintStream(errContent));
	    
	}

	@After
	public void cleanUpStreams() {
	    System.setOut(null);
	    System.setErr(null);
	}
	
	@Test
	public void test() {
		
		Database database = new Database();
		Student student001 = new Student("Pepe Martillo",1991,"001");	
		student001.setAddress("Av. America", "Cochabamba","1234");
		student001.enterMarks(8,7,4);
		database.addPerson(student001);
		database.listAll();
	    assertEquals(("Name: Pepe Martillo\nYear of birth: 1991\nStudent\nStudent ID: 001\n\r\n"), outContent.toString());
		
	}

}
