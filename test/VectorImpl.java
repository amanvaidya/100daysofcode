/**
 * 
 */
package test;

import java.util.Vector;

/**
 * @author Aman
 *
 */
public class VectorImpl {
	public static void main(String args[]) {
		Vector<String> vector = new Vector<String>();
		vector.add("A");
		vector.add("B");
		vector.add("C");
		System.out.println(vector);
		System.out.println(vector.get(2));
		
	}
}
