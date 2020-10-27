package methodOverloading;
/**
 * 
 */

/**
 * @author Aman
 *Example and implementation of compile time polymorphism. Method overloading
 */
public class CompileProg{
	
	public static void main(String args[]) {
		System.out.println(add(2,3));
	}
	public static int add(int x, int y) {
		return x+y;
	}
	public static String add(String x, String y) {
		return "x+y";
	}
	public static int add(int x) {
		return x;
	}
}
