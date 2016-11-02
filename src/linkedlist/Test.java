/**
 * 
 */
package linkedlist;

/**
 * @author ylf
 *
 * 2016年11月2日
 */
public class Test {

	public static void main(String[] args) {
		LinkedList<String> linkedlist = new LinkedList<String>();
		linkedlist.add("hello");
		linkedlist.add("world");
		linkedlist.add("hi");
		linkedlist.add("!", 2);
		linkedlist.remove();
		linkedlist.remove(1);
		linkedlist.traverse();
		linkedlist.reverse();
		linkedlist.traverse();
	}

}
