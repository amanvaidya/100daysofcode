package RemoveNullFromList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * 
 */

/**
 * @author Aman
 *Java program to remove null from list
 */
public class ItArr {
	public static void main(String args[]) {
		ItArr itArr = new ItArr();
		List<String> arr = new ArrayList<>(Arrays.asList("RED", null, "BLUE", null, "GREEN"));
		//remove null using lambda
		System.out.println("using lambda");
		System.out.print(itArr.remNull(arr));
		System.out.println("using removeIf");
		//remove null using removeIf
		System.out.print(itArr.remIf(arr));
	}
	public List<String> remNull(List<String>arr){
		arr=arr.stream().filter(f->f!=null).collect(Collectors.toList());
		return arr;
		
	}
	public List<String> remIf(List<String>arr){
		arr.removeIf(Objects::isNull);
		return arr;
	}
}
