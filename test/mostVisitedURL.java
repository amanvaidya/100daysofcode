/**
 * 
 */
package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author Aman
 *
 */
public class mostVisitedURL {
	public static void main(String args[]) {
		mostVisitedURL mostVisitedURL = new mostVisitedURL();
		String[] arr={"google.com","amazon.com","google.com","facebook.com"};
		String array[]=mostVisitedURL.mostVist(arr);
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
	}
	
	public String[] mostVist(String [] arr) {
		List<String> str= Arrays.asList(arr);
		List<String> array = new ArrayList<String>();
		Set<String> set = new HashSet<String>(str);
		for(String s:set) {
			array.add(s);
		}
		String[] stArr = new String[array.size()];
		stArr=array.toArray(stArr);
		return stArr; 
	}
}
