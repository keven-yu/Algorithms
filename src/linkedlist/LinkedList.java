/**
 * 
 */
package linkedlist;

/**
 * @author ylf
 *
 * 2016年11月2日
 */
public class LinkedList<T> {
	private Node<T> head = new Node<T>();
	private Node<T> tail = head;
	
	public void add(T item){
		Node<T> temp = new Node<T>(item, null);
		tail.setNext(temp);
		tail = temp;
	}
	
	public void add(T item, int index){
		if (index <= 0 || index > length() + 1){
			System.out.println("Index must be great equal than 1, and less than linkedlist length.");
			return ;
		}
		int i = 1;
		Node<T> q = head;
		Node<T> temp = new Node<T>(item, null);
		while (i != index){
			q = q.getNext();
			i++;
		}
		temp.setNext(q.getNext());
		q.setNext(temp);
	}

	/**
	 * If you don't specify the index, remove the last element by default.
	 */
	public void remove(){
		Node<T> q = head;
		while (q.getNext() != null){
			q = q.getNext();
		}
		tail = q;
		tail.setNext(null);
	}
	
	public void remove(int index){
		if (index <= 0 || index > length()){
			System.out.println("Index must be great equal than 1, and less than linkedlist length.");
			return ;
		}
		int i = 1;
		Node<T> q = head;
		while (i != index){
			i++;
			q = q.getNext();
		}
		q.setNext(q.getNext().getNext());
	}
	
	public void traverse(){
		Node<T> q = head;
		while (null != q.getNext()){
			q = q.getNext();
			System.out.println(q.getItem());
		}
	}
	
	/**
	 * Use another new linkedlist reverse the linkedlist.
	 */
	public void reverse(){
		Node<T> newHead = new Node<T>();
		while (null != head.getNext()){
			Node<T> temp = newHead.getNext();	//save remain node
			newHead.setNext(head.getNext());
			head.setNext(head.getNext().getNext());
			newHead.getNext().setNext(temp);	//remain node link the new first element.
		}
		head = newHead;
	}
	public int length() {
		int count = 0;
		Node<T> q = head.getNext();
		while (q != null){
			count++;
			q = q.getNext();
		}
		return count;
	}
}
