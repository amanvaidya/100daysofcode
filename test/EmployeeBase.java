/**
 * 
 */
package test;

/**
 * @author Aman
 *
 */
public class EmployeeBase implements Comparable<EmployeeBase>{
	private String name;
	private String age;
	private String salary;
	/**
	 * @param name
	 * @param age
	 * @param salary
	 */
	public EmployeeBase(String name, String age, String salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	@Override
	public int compareTo(EmployeeBase o) {
		int result=0;
		result=o.age.compareTo(this.age);
		if(result==0) {
			result=o.salary.compareTo(this.salary);
		}
		return result;
	}
	
	

}
