/**
 * 
 */
package revString;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;


/**
 * @author Aman
 *
 */
public class revtest {

	@Test
	public void test() {
		revString revString = new revString();
		String input = "madam";
		assertEquals(input, revString.reversed("madam"));
		
	}

}
