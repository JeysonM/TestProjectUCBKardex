

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import org.junit.Test;


public class StudentTest {
	
	
//	@Test
//	public void testCalculateAverageMarkForOneStudent() throws Exception{
//		Database database = new Database();
//		Student student001 = new Student("Pepe Martillo",1991,"001");	
//		student001.setAddress("Av. America", "Cochabamba","1234");
//		student001.enterMarks(8,7,4);
//		database.addPerson(student001);
//		
//		double averageMarks = student001.calculateAverageMark();
//		assertThat(((Student) database.firstPerson()), is(instanceOf(Student.class)));
//		assertThat(averageMarks,is(6.333333333333333));
//
//	}
	

	@Test
	public void testGetStudentGradeReport()
	{
		Database database = new Database();
		
		Student student001 = new Student("Leon S. Kennedy",1991,"001");
		student001.setAddress("St. Manhatan", "Racon City","1234");
		student001.enterMarks(10,7,4);
		database.addPerson(student001);

		assertThat(((Student) database.firstPerson()), is(instanceOf(Student.class)));
		assertEquals(((Student) database.firstPerson()).GetStudentGradeReport(),student001.GetStudentGradeReport() );
		
	}

}
