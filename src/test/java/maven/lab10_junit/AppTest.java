package maven.lab10_junit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
/**
 * Unit test for simple App.
 */
public class AppTest {
    @Test
	public void testSumar() {		
		App app = new App();		
		assertEquals(7 , app.sumar(4, 3));
	}

}
