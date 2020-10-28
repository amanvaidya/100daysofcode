/**
 * 
 */
package removeNullFromListDay2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 * @author Aman
 *
 */
public class remNull {
	public static void main(String args[]) {
		Result result = JUnitCore.runClasses(testNull.class);
		remNull remNull = new remNull();
		List<String> arr = new ArrayList<String>(Arrays.asList("Green",null,"Blue","Black",null));
		System.out.println(remNull.result(arr));
		for(Failure failure:result.getFailures()) {
			System.out.println(failure.toString());
		}
		System.out.println(result.wasSuccessful());
	}
	public List<String> result(List<String> arr){
		arr=arr.stream().filter(f->f!=null).collect(Collectors.toList());
		return arr;
	}
}
