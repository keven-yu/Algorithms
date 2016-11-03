/**
 * 
 */
package dual_circulation_linked_list;

/**
 * @author ylf
 *
 *         2016年11月3日
 */
public class LinkedList<T> {
	private Node<T> header;

	public LinkedList() {
		header = new Node<T>();
		header.setPre(header);
		header.setNext(header);
	}

	public void add(T item) {
		Node<T> newNode = new Node<T>(item, null, null);
		newNode.setNext(header);
		newNode.setPre(header.getPre());
		newNode.getPre().setNext(newNode);
		newNode.getNext().setPre(newNode);
	}
	
	public void traverse(){
		Node<T> q = header;
		while (q.getNext() != header){
			q = q.getNext();
			System.out.println(q.getItem());
		}
	}
}
