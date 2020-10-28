/**
 * 
 */
package mulInheritDay2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;


/**
 * @author Aman
 *
 */
public class testMul {

	@Test
	public void test() {
		mulImp mulImp = new mulImp();
		int input = 11;
		assertEquals(input,mulImp.result(2, 3));
	}

}
