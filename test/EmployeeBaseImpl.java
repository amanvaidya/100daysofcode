/**
 * 
 */
package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Aman
 *
 */
public class EmployeeBaseImpl {
	public static void main(String args[]) {
		List<EmployeeBase> list = new ArrayList<EmployeeBase>();
		list.add(new EmployeeBase("Aman", "29", "715000"));
		list.add(new EmployeeBase("Amit", "29", "615000"));
		list.add(new EmployeeBase("Amish", "28", "715000"));
		Collections.sort(list);
		for(EmployeeBase base:list) {
			System.out.println("name-->"+base.getName()+" Age-->"+base.getAge()+" Salary"+base.getSalary());
		}
	}
}
