/**
 * 
 */
package stackDay1;

import java.util.EmptyStackException;
import java.util.Stack;

/**
 * @author Aman
 *Stack works on FILO principle.
 *push() method pushes the data in stack
 *pop() method gets the data from stack
 *Since satck works on principle of first in last out hence the element which we entered in the end, will be the output when we call peek() mehtod.
 */
public class StackImpl {
	
	public static void main(String args[]) {
		StackImpl stackImpl = new StackImpl();
		Stack stack = new Stack();
		stackImpl.push(stack,10);
		stackImpl.push(stack,20);
		System.out.println("First Ele-->"+stackImpl.peek(stack));
		try {
			//pop should be equal to push if whole stack needs to print.
			System.out.println(stackImpl.pop(stack));
			System.out.println(stackImpl.pop(stack));
		}catch(EmptyStackException e) {System.out.println(e);}
	}
	public String push(Stack stack, int a) {
		stack.push(new Integer(a));
		return "";
	}
	public int pop(Stack stack) {
		Integer a = (Integer) stack.pop();
		return a;
	}
	public int peek(Stack stack) {
		int a=(Integer) stack.peek();
		return a;
	}
}
