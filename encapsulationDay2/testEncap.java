/**
 * 
 */
package encapsulationDay2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;


/**
 * @author Aman
 *
 */
public class testEncap {

	@Test
	public void test() {
		encapNewImpl encapNewImpl =new encapNewImpl();
		String input="Aman";
		assertEquals(input,encapNewImpl.name());
	}

}
