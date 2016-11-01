/**
 * 
 */
package stack;

/**
 * @author ylf
 *
 * 2016年11月1日
 */
public class Node<T> {
	private T item;
	private Node<T> next;
	
	public T getItem() {
		return item;
	}

	public void setItem(T item) {
		this.item = item;
	}

	public Node<T> getNext() {
		return next;
	}

	public void setNext(Node<T> next) {
		this.next = next;
	}

	public Node(){
		this.item = null;
		this.next = null;
	}
	
	public Node(T item, Node<T> next){
		this.item = item;
		this.next = next;
	}
	
	public boolean end(){
		return (this.item == null && this.next == null);
	}
}
