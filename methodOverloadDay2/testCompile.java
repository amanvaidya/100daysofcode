/**
 * 
 */
package methodOverloadDay2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;


/**
 * @author Aman
 *
 */
public class testCompile {

	@Test
	public void test() {
		compileDay2 compileDay =new compileDay2();
		int input = 5;
		assertEquals(input,compileDay.add(2, 3));
	}

}
