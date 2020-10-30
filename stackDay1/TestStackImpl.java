/**
 * 
 */
package stackDay1;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Stack;

import org.junit.Test;


/**
 * @author Aman
 *
 */
public class TestStackImpl {

	@Test
	public void test() {
		StackImpl stackImpl = new StackImpl();
		int input1 = 10;
		int input2 = 5;
		Stack stack = new Stack();
		stackImpl.push(stack, 5);
		stackImpl.push(stack, 10);
		assertEquals(input1, stackImpl.pop(stack));
		assertEquals(input2, stackImpl.pop(stack));
	}

}
