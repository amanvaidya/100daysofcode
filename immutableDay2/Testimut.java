/**
 * 
 */
package immutableDay2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;


/**
 * @author Aman
 *
 */
public class Testimut {

	@Test
	public void test() {
		imutOneImpl imutOneImpl = new imutOneImpl();
		String input="Aman";
		assertEquals(input,imutOneImpl.name());
	}

}
