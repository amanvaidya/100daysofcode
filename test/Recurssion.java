/**
 * 
 */
package test;

/**
 * @author Aman
 *
 */
public class Recurssion {
	public static void main(String args[]) {
		Recurssion recurssion=new Recurssion();
		System.out.println(recurssion.check(6));
	}
	public int check(int a) {
		int result=0;
		if(a==1) {
			return 1;
		}else {
			result=check(a-1)*a;
		}
		
		return result;
	}
}
