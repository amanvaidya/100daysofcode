/**
 * 
 */
package comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Aman
 *
 */
public class ComparableExampleForList {

	public static void main(String args[]) {
		List<String> list = new ArrayList<String>();
		list.add("Vijay");
		list.add("Aman");
		list.add("Ram");
		Collections.sort(list);
		for(String s:list) {
			System.out.println(s);
		}
	}
}
