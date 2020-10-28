/**
 * 
 */
package revString;

import java.util.Scanner;

/**
 * @author Aman
 *
 */
public class revString {
	 public static void main(String[] args) {
		 	revString solution = new revString();
	        Scanner sc=new Scanner(System.in);
	        String A=sc.next();
	        /* Enter your code here. Print output to STDOUT. */
	        String b = solution.reversed(A);
	        if(A.equals(b)){
	            System.out.println("Yes");
	        }else {
	        	System.out.println("No");
	        }
	        
	    }
	    public String reversed(String rev) {
	        String s="";
	        for(int i=rev.length()-1;i>=0;i--){
	            s+=rev.charAt(i);
	        }
	        return s;
	    }
}
