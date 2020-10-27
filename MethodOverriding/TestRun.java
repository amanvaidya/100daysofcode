/**
 * 
 */
package MethodOverriding;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;



/**
 * @author Aman
 *
 */
public class TestRun {

	@Test
	public void test() {
		RunProgImpl runProgImpl = new RunProgImpl();
		String input = "";
		assertEquals(input,runProgImpl.finalDisplay());
	}

}
