
import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import java.util.Iterator;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;


public class StaffTest {
	
	
	@Test
	public void testCalculatePaymentForStaff()
	{
		Database database = new Database();
		Staff staff001 = new Staff("Luke Skywalker", 1980, "005");	
		double paymentForHour = staff001.calculatePayment(99);
		staff001.setSalary(paymentForHour);
		database.addPerson(staff001);
		
		
		assertThat(((Staff) database.firstPerson()), is(instanceOf(Staff.class)));
		assertThat(((Staff) database.firstPerson()).getSalary(), is(1060.125));

	}
	

	@Test
	public void testCalculateLoanForStaff()
	{
		Database database = new Database();
		Staff staff001 = new Staff("Luke Skywalker", 1980, "005");	
		double paymentForHour = staff001.calculatePayment(99);
		staff001.setSalary(paymentForHour);
		database.addPerson(staff001);
		int paymentLoan = staff001.calculateLoan(10000,0.12,75,3000);
		
		assertThat(((Staff) database.firstPerson()), is(instanceOf(Staff.class)));
		assertThat(paymentLoan, is(8));
	}

}
