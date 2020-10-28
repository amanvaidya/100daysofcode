/**
 * 
 */
package MethodOverrideDay2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;


/**
 * @author Aman
 *
 */
public class overTest {

	@Test
	public void test() {
		impl impl = new impl();
		String input="hi";
		assertEquals(input,impl.result());
	}

}
