/**
 * 
 */
package remNullDay3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Aman
 *
 */
public class remNullThree {
	public static void main(String args[]) {
		remNullThree remNullThree =new remNullThree();
		List<String> str = new ArrayList<String>(Arrays.asList("Green",null,"Blue"));
		System.out.println(remNullThree.remNull(str));
	}
	
	public List<String> remNull(List<String> str){
		str=str.stream().filter(f->f!=null).collect(Collectors.toList());
		return str;
	}
}
