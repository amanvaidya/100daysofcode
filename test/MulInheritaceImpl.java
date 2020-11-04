/**
 * 
 */
package test;

/**
 * @author Aman
 *
 */
public class MulInheritaceImpl implements MulAdd, MulMul{
	public static void main(String args[]) {
		MulInheritaceImpl mulInheritaceImpl=new MulInheritaceImpl();
		int a=2;
		int b=10;
		mulInheritaceImpl.display(a, b);
		
	}
	public void display(int a, int b) {
		System.out.println(MulAdd.super.add(a, b));
		System.out.println(MulMul.super.mul(a, b));
	}
}
