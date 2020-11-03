/**
 * 
 */
package comparable;

/**
 * @author Aman
 *
 */
public class CustomObject implements Comparable<CustomObject>{
	private String name;
	private String age;
	private String salary;
	/**
	 * @param name
	 * @param age
	 * @param salary
	 */
	public CustomObject(String name, String age, String salary) {
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
	public int compareTo(CustomObject o) {
		// TODO Auto-generated method stub
		int result = 0;
		result = this.age.compareTo(o.age);
		if(result==0) {
			result=this.salary.compareTo(o.salary);
		}
		return result;
	}

}
