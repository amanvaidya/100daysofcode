/**
 * 
 */
package methodOverloadDay2;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 * @author Aman
 *
 */
public class compileDay2 {
	public static void main(String args[]) {
		Result result = JUnitCore.runClasses(testCompile.class);
		compileDay2 compileDay2 = new compileDay2();
		System.out.println(compileDay2.add(2, 3));
		for(Failure failure:result.getFailures()) {
			System.out.println(failure.toString());
		}
		System.out.println(result.wasSuccessful());
	}
	public int add(int x, int y) {
		return x+y;
	}
	public String add(String x, String y) {
		return "x+y";
	}
}
