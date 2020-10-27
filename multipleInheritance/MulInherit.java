package multipleInheritance;

/**
 * 
 */

/**
 * @author Aman
 *Example of multiple inheritance in java using interface
 */
public class MulInherit implements InteritFace1,InheritFace{
	public void show() {
		System.out.println(InheritFace.super.add(2, 3));
		System.out.println(InteritFace1.super.multiply(2, 3));
	}
	public static void main(String args[]) {
		MulInherit mulInherit=new MulInherit();
		mulInherit.show();
	}
}
