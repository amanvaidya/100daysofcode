/**
 * 
 */
package test;

/**
 * @author Aman
 *
 */
public class ReverseString {
	public static void main(String args[]) {
		ReverseString reverseString = new ReverseString();
		String str = "This is test";
		System.out.println(reverseString.reverdes(str));
	}
	public String reverdes(String str) {
		
		String[] arr = str.split(" ");
		str="";
		for(int i=arr.length-1;i>=0;i--) {
			str+=arr[i]+" ";
		}
		
		return str.trim();
	}
}
