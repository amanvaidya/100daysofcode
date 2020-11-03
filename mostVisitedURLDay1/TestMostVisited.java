/**
 * 
 */
package mostVisitedURLDay1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;


/**
 * @author Aman
 *
 */
public class TestMostVisited {

	@Test
	public void test() {
		MostVisitedURL mostVisitedURL = new MostVisitedURL();
		String[] arr = {"google.com","amazon.com","amazon.com","facebook.com","amazon.com","google.com","google.com"};
		String[] input = {"google.com","amazon.com","facebook.com"};
		
		assertEquals(mostVisitedURL.getUrl(arr), input);
	}

}
