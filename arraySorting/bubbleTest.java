/**
 * 
 */
package arraySorting;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.Test;

/**
 * @author Aman
 *
 */
public class bubbleTest {

	@Test
	public void test() {
		bubbleSort bubbleSort = new bubbleSort();
		int[] array = {45,78,9};
		int[] input = {9,45,78};
		
		array=bubbleSort.sortedArray(array);
		assertEquals(true,Arrays.equals(array, input));
	}

}





