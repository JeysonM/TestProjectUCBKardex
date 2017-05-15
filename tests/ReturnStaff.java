import static org.junit.Assert.*;

import org.junit.Test;

public class ReturnStaff {

	@Test
	public void testGetStaffAssAString() {
		Staff staff001 = new Staff("Luke Skywalker", 1980, "005");	
		String result = staff001.toString();
		assertEquals( result, "Name: Luke Skywalker\nYear of birth: 1980\nStaff member\nRoom: 005\nSalary: 0.0\n");
	}

}
