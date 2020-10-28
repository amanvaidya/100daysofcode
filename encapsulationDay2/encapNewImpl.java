/**
 * 
 */
package encapsulationDay2;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 * @author Aman
 *
 */
public class encapNewImpl {
	public static void main(String args[]) {
		Result result = JUnitCore.runClasses(testEncap.class);
		encapNewImpl encapNewImpl = new encapNewImpl();
		System.out.println(encapNewImpl.name());
		for(Failure failure:result.getFailures()) {
			System.out.println(failure.toString());
		}
		System.out.println(result.wasSuccessful());
	}
	public String name() {
		encapNew encapNew = new encapNew();
		encapNew.setName("Aman");
		return encapNew.getName();
	}
}
