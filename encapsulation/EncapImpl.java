package encapsulation;
/**
 * 
 */

/**
 * @author Aman
 *Implementation for encapsulated class
 */
public class EncapImpl {
	public static void main(String args[]) {
		EncapProg encapProg = new EncapProg();
		encapProg.setName("Aman");
		encapProg.setAge("29");
		System.out.println(encapProg.getName()+" "+encapProg.getAge());
	}
}
