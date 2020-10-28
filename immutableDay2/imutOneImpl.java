/**
 * 
 */
package immutableDay2;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 * @author Aman
 *
 */
public class imutOneImpl{
	public static void main(String args[]) {
		Result result = JUnitCore.runClasses(Testimut.class);
		imutOneImpl imutOneImpl = new imutOneImpl();
		System.out.println(imutOneImpl.name());
		for(Failure failure:result.getFailures()) {
			System.out.println(failure.toString());
		}
		System.out.println(result.wasSuccessful());
	}
	public String name() {
		imutOne imutOne = new imutOne("Aman");
		return imutOne.getName();
	}
}
