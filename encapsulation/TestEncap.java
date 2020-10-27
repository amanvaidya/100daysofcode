/**
 * 
 */
package encapsulation;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import org.junit.Test;

/**
 * @author Aman
 *
 */
public class TestEncap {

	@Test
	public void test() {
		EncapImpl encapImpl = new EncapImpl();
		String input = "Name: Age: ";
		InputStream in = new ByteArrayInputStream(input.getBytes());
		System.setIn(in);
		assertEquals(input, encapImpl.result("", ""));
	}
}
