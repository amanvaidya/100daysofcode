/**
 * 
 */
package MethodOverrideDay2;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 * @author Aman
 *
 */
public class impl {
	public static void main(String args[]) {
		Result result = JUnitCore.runClasses(overTest.class);
		impl impl = new impl();
		System.out.println(impl.result());
		for(Failure failure:result.getFailures()) {
			System.out.println(failure.toString());
		}
		System.out.println(result.wasSuccessful());
	}
	public String result() {
		parent p = new parent();
		return p.greet();
	}
}
