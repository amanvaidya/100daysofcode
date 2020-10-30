/**
 * 
 */
package vectorDAy1;

import java.util.Collections;
import java.util.Vector;

/**
 * @author Aman
 *
 */
public class VectorImpl {
	public static void main(String args[]) {
		Vector<String> vector = new Vector<String>();
		vector.add("1");
		vector.add("2");
		vector.add("3");
		System.out.println(vector);
		Collections.swap(vector, 1, 2);
		System.out.println("Ater swaping-->"+vector);
	}
}
