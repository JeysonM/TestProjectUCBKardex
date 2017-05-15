import static org.junit.Assert.*;

import org.junit.Test;

public class ChangeStaffAttributes {

	@Test
	public void testChangeRoomProperly() {
		Staff staff001 = new Staff("Luke Skywalker", 1980, "005");	
		staff001.setRoom("007");
		assertEquals(staff001.getRoom(),"007");
	}
	
	
	@Test
	public void testChangeNoAtributtesStaffRoomProperly() {
		Staff staff001 = new Staff();	
		staff001.setRoom("007");
		assertEquals(staff001.getRoom(),"007");
	}

}
