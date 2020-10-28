/**
 * 
 */
package mulInheritDay2;

/**
 * @author Aman
 *
 */
public interface interOne {
	public default int add(int x, int y) {
		return x+y;
	}
}
