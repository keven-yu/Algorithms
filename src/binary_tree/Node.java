/**
 * 
 */
package binary_tree;

/**
 * @author ylf
 *
 * 2016年11月4日
 */
public class Node<T> {
	private T item;
	private Node<T> lchild;
	private Node<T> rchild;
	public T getItem() {
		return item;
	}
	public void setItem(T item) {
		this.item = item;
	}
	public Node<T> getLchild() {
		return lchild;
	}
	public void setLchild(Node<T> lchild) {
		this.lchild = lchild;
	}
	public Node<T> getRchild() {
		return rchild;
	}
	public void setRchild(Node<T> rchild) {
		this.rchild = rchild;
	}
	public Node(T item){
		this.item = item;
		this.lchild = null;
		this.rchild = null;
	}
	public Node(T item, Node<T> lchild, Node<T> rchild){
		this.item = item;
		this.lchild = lchild;
		this.rchild = rchild;
	}
}
