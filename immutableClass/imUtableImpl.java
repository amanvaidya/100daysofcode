/**
 * 
 */
package immutableClass;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 * @author Aman
 *
 */
public class imUtableImpl {
	public static void main(String args[]) {
		Result result = JUnitCore.runClasses(testImut.class);
		imUtableImpl imUtableImpl = new imUtableImpl();
		System.out.println(imUtableImpl.ImUtable());
		for(Failure failure : result.getFailures()) {
			System.out.println(failure.toString());
		}
		System.out.println(result.wasSuccessful());
	}
	public String ImUtable() {
		imUtable ImUtable=new imUtable("Aman");
		return ImUtable.getName();
	}
}
