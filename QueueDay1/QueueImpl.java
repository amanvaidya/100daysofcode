/**
 * 
 */
package QueueDay1;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @author Aman
 *Queue works on principle of First In First Out
 */
public class QueueImpl {
	public static void main(String args[]) {
		Queue<String> queue = new PriorityQueue<String>();
		queue.add("first");
		queue.add("second");
		queue.add("Third");
		System.out.println(queue);
	}
}
