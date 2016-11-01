/**
 * 
 */
package stack;

/**
 * @author ylf
 *
 * 2016年11月1日
 */
public class LinkedStack<T> {
	private Node<T> top = new Node<T>();
	
	public void push(T item){
		top = new Node<T>(item, top);
	}
	public T pop(){
		T result = top.getItem();
		if (!top.end()){
			top = top.getNext();
		}
		return result;
	}
}
