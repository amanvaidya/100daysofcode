/**
 * 
 */
package comparable;

/**
 * @author Aman
 *
 */
public class ComparableExampleforCustomObject implements Comparable<ComparableExampleforCustomObject>{
	
	public String name;
	public String age;
	public String experience;
	
	
	/**
	 * @param name
	 * @param age
	 * @param experience
	 */
	public ComparableExampleforCustomObject(String name, String age, String experience) {
		this.name = name;
		this.age = age;
		this.experience = experience;
	}


	@Override
	public int compareTo(ComparableExampleforCustomObject o) {
		// TODO Auto-generated method stub
		int result=0;
		result = this.experience.compareTo(o.experience);
		if(result==0) {
			result=this.age.compareTo(o.age);
		}
		return result;
	}


	
}
