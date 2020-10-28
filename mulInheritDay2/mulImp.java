/**
 * 
 */
package mulInheritDay2;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 * @author Aman
 *
 */
public class mulImp implements interOne, interTwo{
	public static void main(String args[]) {
		Result result = JUnitCore.runClasses(testMul.class);
		mulImp mulImp = new mulImp();
		System.out.println(mulImp.result(2,3));
		for(Failure failure:result.getFailures()) {
			System.out.println(failure.toString());
		}
		System.out.println(result.wasSuccessful());
	}
	public int result(int x, int y) {
		int i = interOne.super.add(x, y);
		int j = interTwo.super.mul(x, y);
		return i+j;
	}
}
