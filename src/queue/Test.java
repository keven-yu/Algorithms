/**
 * 
 */
package queue;

/**
 * @author ylf
 *
 * 2016年11月2日
 */
public class Test {

	public static void main(String[] args) {
		LinkedQueue<String> queue = new LinkedQueue<String>();
		queue.put("first");
		queue.put("second");
		System.out.println(queue.poll());
		System.out.println(queue.poll());
	}

}
