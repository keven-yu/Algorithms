/**
 * 
 */
package stack;

/**
 * @author ylf
 *
 * 2016年11月1日
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LinkedStack<String> stack = new LinkedStack<String>();
		stack.push("first");
		stack.push("second");
		stack.push("third");
		String s;
		while ((s = stack.pop()) != null){
			System.out.println(s);
		}
	}

}
