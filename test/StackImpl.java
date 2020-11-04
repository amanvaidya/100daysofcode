/**
 * 
 */
package test;

import java.util.Stack;

/**
 * @author Aman
 *
 */
public class StackImpl {
	public static void main(String args[]) {
		Stack<String> stack = new Stack<String>();
		stack.push("A");
		stack.push("B");
		stack.push("C");
		
		try {
			System.out.println(stack.pop());
			System.out.println(stack.pop());
			System.out.println(stack.pop());
			
		}catch(Exception e) {}
	}
}
