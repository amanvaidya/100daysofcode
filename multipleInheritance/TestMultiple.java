/**
 * 
 */
package multipleInheritance;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;


/**
 * @author Aman
 *
 */
public class TestMultiple {

	@Test
	public void test() {
		MulInherit mulInherit = new MulInherit();
		String input="";
		assertEquals(input,mulInherit.show());
	}

}
