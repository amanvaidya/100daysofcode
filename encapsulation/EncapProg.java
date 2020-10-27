package encapsulation;
/**
 * 
 */

import java.util.Scanner;

/**
 * @author Aman
 *Example of encapsulated class
 */
public class EncapProg {
	private String name;
	private String age;
	public String getName() {
	
		return "Name: "+name;
	}
	public void setName(String name) {
		
		this.name = name;
	}
	public String getAge() {
		return "Age: "+age;
	}
	public void setAge(String age) {
		this.age = age;
	}
}
