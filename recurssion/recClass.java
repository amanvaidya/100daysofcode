/**
 * 
 */
package recurssion;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;


/**
 * @author Aman
 *Java program for factorial using recursion.
 *To perform recursion, function needs to call itself
 */
public class recClass {
	public static void main(String args[]) {
		Result result = JUnitCore.runClasses(testRec.class);
		recClass recClass = new recClass();
		int num = 5;
		int output=recClass.factorial(num);
		System.out.println(output);
		for(Failure failure:result.getFailures()) {
			System.out.println(failure.toString());
		}
		System.out.println(result.wasSuccessful());
	}
	public int factorial(int num) {
		int number;
		if(num==1) {
			return 1;
		}
		number=factorial(num-1)*num;
		return number;
	}
}
