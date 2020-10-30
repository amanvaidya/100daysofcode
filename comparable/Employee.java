package comparable;
/**
 * 
 */

/**
 * @author Aman
 *
 */
public class Employee implements Comparable<Employee>{

	private String name;
	private int yearsOfExp;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getYearsOfExp() {
		return yearsOfExp;
	}
	public void setYearsOfExp(int yearsOfExp) {
		this.yearsOfExp = yearsOfExp;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		int check = o.yearsOfExp-this.yearsOfExp;
		if(check==0) {
			check = o.age-this.age;
		}
		return check;
		
	}
	@Override
	public String toString() {
		return "Sorted Employee:"+name+" yearsOfExp"+yearsOfExp+" age"+age;
	}
	
}
