package MethodOverriding;
/**
 * 
 */

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;


/**
 * @author Aman
 *
 */
public class RunProgImpl extends RunJProg{
	public String finalDisplay() {
		RunProg run = new RunProg();
		run.display();
		RunProg run1 = new RunJProg();
		run1.display();
		return "";
	}
	public static void main(String args[]) {
		Result result = JUnitCore.runClasses(TestRun.class);
		RunProgImpl runProgImpl = new RunProgImpl();
		runProgImpl.finalDisplay();
		for (Failure failure : result.getFailures()) {
	         System.out.println(failure.toString());
	      }
		System.out.println(result.wasSuccessful());
	}
}
