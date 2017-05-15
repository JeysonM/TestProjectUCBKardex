import static org.junit.Assert.*;

import org.junit.Test;

public class ExecuteMain {

	@Test
	public void testExecutedMain() {
		UCBKardex kardex = new UCBKardex();
		kardex.main(null);
		assertNotEquals(null, kardex);
	}
}
