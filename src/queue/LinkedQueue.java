/**
 * 
 */
package queue;

/**
 * @author ylf
 *
 * 2016年11月2日
 */
public class LinkedQueue<T> {
	private Node<T> tail = null;
	private Node<T> head = tail;

	public T poll(){
		if (null == head){		//queue is empty.
			return null;
		}
		T temp = head.getItem();
		head = head.getNext();
		if (null == head){	//if queue is empty when poll a element,the tail node also value null.
			tail = null;
		}	
		return temp;
	}
	
	public void put(T item){
		Node<T> temp = new Node<T>(item, null);
		if (tail == null){	//first element.
			head = tail = temp;
		} else {
			tail.setNext(temp);
			tail = temp;
		}
	}
}
