/**
 * 
 */
package linkedListDay1;

import java.util.LinkedList;

/**
 * @author Aman
 *
 */
public class LinkedImpl {
	public static void main(String args[]) {
		LinkedList list = new LinkedList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		System.out.println("to print whole lis-->"+list);
		//To print each element of list
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		//To remove element from list
		list.subList(1, 3).clear();
		System.out.println("After removing-->"+list);
		//To add element in first and last position
		list.addFirst(10);
		list.addLast(100);
		System.out.println("After adding-->"+list);
		//To remove first element from list
		list.removeFirst();
		System.out.println("After removeFirst()-->"+list);
		//To remove last element from list
		list.removeLast();
		System.out.println("After removeLast()-->"+list);
		//To update list
		list.add(2, 1000);
		System.out.println("After updating-->"+list);
	}
}
