/**
 * 
 */
package dual_circulation_linked_list;

/**
 * @author ylf
 *
 * 2016年11月3日
 */
public class Node<T> {
	private T item;
	private Node<T> pre;
	private Node<T> next;
	public T getItem() {
		return item;
	}
	public void setItem(T item) {
		this.item = item;
	}
	public Node<T> getPre() {
		return pre;
	}
	public void setPre(Node<T> pre) {
		this.pre = pre;
	}
	public Node<T> getNext() {
		return next;
	}
	public void setNext(Node<T> next) {
		this.next = next;
	}
	
	public Node(){
		this.item = null;
		this.pre = null;
		this.next = null;
	}
	public Node(T item, Node<T> pre, Node<T> next){
		this.item = item;
		this.pre = pre;
		this.next = next;
	}
}
