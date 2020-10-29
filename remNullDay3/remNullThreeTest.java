/**
 * 
 */
package remNullDay3;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;



/**
 * @author Aman
 *
 */
public class remNullThreeTest {

	@Test
	public void test() {
		remNullThree remNullThree = new remNullThree();
		List<String> input = new ArrayList<String>(Arrays.asList("Green","Blue"));
		List<String> check = new ArrayList<String>(Arrays.asList("Green",null,"Blue"));
		assertEquals(input, remNullThree.remNull(check));
	}

}
