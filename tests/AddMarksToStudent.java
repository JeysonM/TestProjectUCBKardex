
import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import java.util.Iterator;

import org.hamcrest.Matcher;
import org.junit.Rule;
import org.junit.Test;


public class AddMarksToStudent {
	
	
	@Test
	public void testAddMarksToOneStudent()
	{
		
		Database database = new Database();
		Student student001 = new Student("Pepe Martillo",1991,"001");	
		student001.enterMarks(8,7,4);
		database.addPerson(student001);
		assertThat(((Student) database.firstPerson()), is(instanceOf(Student.class)));
		assertEquals(((Student) database.firstPerson()).getMathsMark(),8);
		assertEquals(((Student) database.firstPerson()).getEnglishMark(),7);
		assertEquals(((Student) database.firstPerson()).getScienceMark(),4);
		
	}
	

}
