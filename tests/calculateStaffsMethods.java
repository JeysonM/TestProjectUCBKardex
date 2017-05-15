import static org.junit.Assert.*;

import org.junit.Test;

public class calculateStaffsMethods {

	@Test
	public void testCalculateStaffPayment() {
		Staff staff001 = new Staff("Luke Skywalker", 1980, "005");
		double payment = staff001.calculatePayment(1);
		assertEquals(8.25,payment,001);
	}
	
	@Test
	public void testCalculateLoanNegative(){
		Staff staff001 = new Staff("Luke Skywalker", 1980, "005");
		int loan = staff001.calculateLoan(-1.0, 5.0, 5.0, 5.0);
		assertEquals(-1.0,loan,0.1);
	}

}
