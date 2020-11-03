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
public class ImplComparableExampleforCustomObject {
	public static void main(String args[]) {
		List<ComparableExampleforCustomObject> list = new ArrayList<ComparableExampleforCustomObject>();
		list.add(new ComparableExampleforCustomObject("Aman","29","5"));
		list.add(new ComparableExampleforCustomObject("Ram","30","5"));
		list.add(new ComparableExampleforCustomObject("Vijay","32","7"));
		list.add(new ComparableExampleforCustomObject("Amit","28","5"));
		Collections.sort(list);
		for(ComparableExampleforCustomObject s:list) {
			System.out.println("Name:-"+s.name+"Age:-"+s.age+"Experience:-"+s.experience);
		}
	}
}
