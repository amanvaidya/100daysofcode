/**
 * 
 */
package test;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Aman
 *
 */
public class RemoveNull {
	public static void main(String args[]) {
		RemoveNull removeNull = new RemoveNull();
		String[]arr= {"Green",null,"Blue","Yellow",null};
		List<String>str = new ArrayList<String>(Arrays.asList(arr));
		System.out.println(removeNull.printList(str));
	}
	public List<String> printList(List<String> arr){
		arr=arr.stream().filter(f->f!=null).collect(Collectors.toList());
		return arr;
	}
}
