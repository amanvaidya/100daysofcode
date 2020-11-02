/**
 * 
 */
package mostVisitedURLDay1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author Aman
 *
 */
public class MostVisitedURL {
	public static void main(String args[]) {
		MostVisitedURL mostVisitedURL = new MostVisitedURL();
		String arr[] = {"google.com","amazon.com","amazon.com","facebook.com","amazon.com","google.com","google.com"};
		String array[] = mostVisitedURL.getUrl(arr);
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
	}
	public String[] getUrl(String[] arr) {
		String [] array = new String[arr.length];
		Set<String> set = new HashSet<String>();
		 for (int i = 0; i < arr.length; i++) {
	            if (!set.add(arr[i]))
	            	arr[i] = ""; // here I am assigning Duplicate instead if find duplicate
	                                        // you can assign as null or whatever you want to do with duplicates.
	        }
		return arr;
	}
	
}
