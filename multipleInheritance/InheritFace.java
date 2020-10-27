package multipleInheritance;
/**
 * 
 */

/**
 * @author Aman
 *
 */
public interface InheritFace {
	public default int add(int x, int y) {
		return x+y;
	}
}
