package multipleInheritance;



import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 * 
 */

/**
 * @author Aman
 *Example of multiple inheritance in java using interface
 */
public class MulInherit implements InteritFace1,InheritFace{
	public String show() {
		System.out.println(InheritFace.super.add(2, 3));
		System.out.println(InteritFace1.super.multiply(2, 3));
		return "";
	}
	public static void main(String args[]) {
		Result result = JUnitCore.runClasses(TestMultiple.class);
		MulInherit mulInherit=new MulInherit();
		mulInherit.show();
		for(Failure failure:result.getFailures()) {
			System.out.println(failure.toString());
		}
		System.out.println(result.wasSuccessful());
	}
}
