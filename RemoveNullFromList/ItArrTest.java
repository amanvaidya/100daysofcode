/**
 * 
 */
package RemoveNullFromList;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

/**
 * @author Aman
 *
 */
public class ItArrTest {

	@Test
	public void test() {
		ItArr itArr = new ItArr();
		List<String> input = new ArrayList<String>();
		input.add("RED");
		input.add("BLUE");
		input.add("GREEN");
		List<String> arr = new ArrayList<>(Arrays.asList("RED", null, "BLUE", null, "GREEN"));
		assertEquals(input,itArr.remNull(arr));
		assertEquals(input,itArr.remIf(arr));
	}

}
