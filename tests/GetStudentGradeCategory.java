import static org.junit.Assert.*;

import org.junit.Test;

public class GetStudentGradeCategory {

	Student student = new Student("Pepe Martillo",1991,"001");
	
	@Test
	public void testPerectScoreGrade() {
		assertEquals(student.getGrade(10.0),"Perfect Score");
	}
	
	@Test
	public void testExcellentGrade() {
		assertEquals(student.getGrade(9.0),"Excellent");
	}
	
	@Test
	public void testGoodGrade() {
		assertEquals(student.getGrade(8.0),"Good");
	}
	
	@Test
	public void testAboveAverageGrade() {
		assertEquals(student.getGrade(7.0),"Above Average");
	}
	
	@Test
	public void testAverageGrade() {
		assertEquals(student.getGrade(6.0),"Average");
	}
	
	@Test
	public void testBelowAverageGrade() {
		assertEquals(student.getGrade(5.0),"Below Average");
	}
	
	@Test
	public void testNotPassingGrade() {
		assertEquals(student.getGrade(1.0),"Not Passing");
	}
	

}
