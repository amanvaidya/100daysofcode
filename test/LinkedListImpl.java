/**
 * 
 */
package test;

import java.util.LinkedList;

/**
 * @author Aman
 *
 */
public class LinkedListImpl {
	public static void main(String args[]) {
		LinkedList list = new LinkedList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		System.out.println("Ater adding:"+list);
		list.remove(0);
		list.remove(1);
		System.out.println("Ater removing:"+list);
		System.out.println("Peek:"+list.peek());
	}
}
