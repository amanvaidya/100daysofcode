package comparable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 
 */

/**
 * @author Aman
 *
 */
public class EmployeeCheck {
	public static void main(String args[]) {
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		Employee e3 = new Employee();
		e1.setName("Aman");
		e1.setAge(29);
		e1.setYearsOfExp(4);
		e2.setName("Raj");
		e2.setAge(23);
		e2.setYearsOfExp(3);
		e3.setName("Ramesh");
		e3.setAge(32);
		e3.setYearsOfExp(13);
		List<Employee> emp = new ArrayList<>();
		emp.add(e1);
		emp.add(e2);
		emp.add(e3);
		Collections.sort(emp);
		for(Employee e:emp) {
			System.out.println(e.toString());
		}
	}
}
