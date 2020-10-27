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
		List<String> arr = new ArrayList<>(Arrays.asList("RED", null, "BLUE", null, "GREEN"));
		//remove null using lambda
		arr.stream().filter(f->f!=null).collect(Collectors.toList()).forEach(System.out::print);
		System.out.println("");
		//remove null using removeIf
		arr.removeIf(Objects::isNull);
		System.out.print(arr);
	}
}
