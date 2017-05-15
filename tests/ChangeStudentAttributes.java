import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ChangeStudentAttributes {

	Student student001 = new Student("Pepe Martillo",1991,"001");
	@Before public void changeAttributes (){
		student001.setName("Pepito Martillo");
		student001.setYearOfBirth(1992);
	}

	@Test
	public void changeStudentName() {
		assertEquals(student001.getName(), "Pepito Martillo");	
	}
	
	@Test 
	public void changeStudentYearOfBirth(){
		assertEquals(student001.getYearOfBirth(), 1992);
	}
	
	@Test 
	public void changeStudentID(){
		assertEquals(student001.getStudentID(), "001");
	}
	
	@Test
	public void changeNoAttributedStudentName(){
		Student noAttributesStudent= new Student();
		noAttributesStudent.setName("Pepe");
		assertEquals(noAttributesStudent.getName(), "Pepe");
	}
	
	

}
