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
public class ImplCustomObject {
	public static void main(String args[]) {
		List<CustomObject> list = new ArrayList<CustomObject>();
		list.add(new CustomObject("Aman", "29", "655000"));
		list.add(new CustomObject("Vinayak", "27", "755000"));
		list.add(new CustomObject("Deepak", "29", "555000"));
		list.add(new CustomObject("Gaurav", "29", "555000"));
		list.add(new CustomObject("Abhinav", "27", "555000"));
		Collections.sort(list);
		for(CustomObject s:list) {
			System.out.println("Name-"+s.getName()+",Age-"+s.getAge()+",salary"+s.getSalary());
		}
	}

}
