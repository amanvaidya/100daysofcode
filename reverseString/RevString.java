/**
 * 
 */
package reverseString;

import java.util.Scanner;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 * @author Aman
 *
 */
public class RevString {
	public static void main(String args[]) {
		Result result = JUnitCore.runClasses(revTest.class);
		RevString revString = new RevString();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String to reverse");
		String str = sc.nextLine();
		System.out.println(revString.reversed(str));
		for(Failure failure:result.getFailures()) {
			System.out.println(failure.toString());
		}
		System.out.println(result.wasSuccessful());
	}
	public String reversed(String rev) {
		String [] str = rev.split(" ");
		String s=""; 
		for(int i=str.length-1;i>=0;i--) {
			s+=str[i]+" ";
		}
		
		return s.trim();
	}
}
