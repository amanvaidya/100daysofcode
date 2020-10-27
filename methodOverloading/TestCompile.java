/**
 * 
 */
package methodOverloading;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.Test;


/**
 * @author Aman
 *
 */
public class TestCompile {

	@Test
	public void test() {
		CompileProg compileProg = new CompileProg();
		int input =3;
		int input1 =7;
		String input2 ="x+y";
		assertEquals(input,compileProg.add(3));
		assertEquals(input1,compileProg.add(3,4));
		assertEquals(input2,compileProg.add("x","y"));
	}

}
