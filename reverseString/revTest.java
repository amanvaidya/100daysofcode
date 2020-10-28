/**
 * 
 */
package reverseString;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;



/**
 * @author Aman
 *
 */
public class revTest {

	@Test
	public void test() {
		RevString revString=new RevString();
		String input = "string is This";
		assertEquals(input, revString.reversed("This is string"));
	}

}
