package multipleInheritance;
/**
 * 
 */

/**
 * @author Aman
 *
 */
public interface InteritFace1 {
	public default int multiply(int x, int y) {
		return x*y;
	}
}
