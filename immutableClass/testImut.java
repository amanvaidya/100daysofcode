/**
 * 
 */
package immutableClass;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;


/**
 * @author Aman
 *
 */
public class testImut {

	@Test
	public void test() {
		imUtableImpl ImUtableImpl = new imUtableImpl();
		String input="Aman";
		assertEquals(input,ImUtableImpl.ImUtable());
	}

}
