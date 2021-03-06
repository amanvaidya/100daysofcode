package methodOverloading;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 * 
 */

/**
 * @author Aman
 *Example and implementation of compile time polymorphism. Method overloading
 */
public class CompileProg{
	
	public static void main(String args[]) {
		Result result = JUnitCore.runClasses(TestCompile.class);
		CompileProg compileProg = new CompileProg();
		System.out.println(compileProg.add(2,3));
		for (Failure failure : result.getFailures()) {
	         System.out.println(failure.toString());
	      }
		System.out.println(result.wasSuccessful());
	}
	public  int add(int x, int y) {
		return x+y;
	}
	public  String add(String x, String y) {
		return "x+y";
	}
	public  int add(int x) {
		return x;
	}
}
