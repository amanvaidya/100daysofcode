/**
 * 
 */
package removeNullFromListDay2;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;


/**
 * @author Aman
 *
 */
public class testNull {

	@Test
	public void test() {
		remNull remNull = new remNull();
		List<String> input = new ArrayList<String>();
		input.add("Green");
		input.add("Blue");
		input.add("Black");
		input.add("Blob");
		List<String> arr  = new ArrayList<String>();
		arr.add("Green");
		arr.add(null);
		arr.add("Blue");
		arr.add(null);
		arr.add("Black");
		arr.add(null);
		arr.add("Blob");
		assertEquals(input, remNull.result(arr));
	}

}
