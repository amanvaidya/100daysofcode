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
		List<String>list = Arrays.asList(arr);
		List<String>item =new ArrayList<String>();
        Set<String> uniqueWords = new HashSet<String>(list);
		for (String word : uniqueWords) {
		  	item.add(word);
    	}
		String[] array = new String[item.size()];
		array=item.toArray(array);
		return array;
	}
	
}
