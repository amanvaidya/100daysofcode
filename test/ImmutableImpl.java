/**
 * 
 */
package test;

/**
 * @author Aman
 *
 */
public class ImmutableImpl {
	public static void main(String args[]) {
		ImmutableBase immutableBase = new ImmutableBase();
		immutableBase.setName("Aman");
		System.out.println(immutableBase.getName());
		immutableBase.setName("Amit");
		System.out.println(immutableBase.getName());
	}
}
