package encapsulation;

import java.util.Scanner;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 * 
 */

/**
 * @author Aman
 *Implementation for encapsulated class
 */
public class EncapImpl {
	public static void main(String args[]) {
		Result result = JUnitCore.runClasses(TestEncap.class);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name");
		String name = sc.next();
		System.out.println("Enter Age");
		String age = sc.next();
		EncapImpl encapImpl = new EncapImpl();
		System.out.println(encapImpl.result(name, age));
		for (Failure failure : result.getFailures()) {
	         System.out.println(failure.toString());
	      }
		System.out.println(result.wasSuccessful());
		
	}
	public String result(String name, String age) {
		EncapProg encapProg = new EncapProg();
		encapProg.setName(name);
		encapProg.setAge(age);
		return (encapProg.getName()+encapProg.getAge());
	}
}
