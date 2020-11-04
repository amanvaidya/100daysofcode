/**
 * 
 */
package test;

/**
 * @author Aman
 *
 */
class parent{
	void display() {
		System.out.println("hi");
	}
}
class base extends parent{
	void display() {
		System.out.println("hello");
	}
}
public class MethodOverride {
	public static void main(String args[]) {
		parent parent= new base();
		parent.display();
	}
}
