/**
 * 
 */
package recurssion;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;


/**
 * @author Aman
 *
 */
public class testRec {

	@Test
	public void test() {
		recClass recClass = new recClass();
		int input = 120;
		assertEquals(input, recClass.factorial(5));
	}

}
