/**
 * 
 */
package binary_sort_tree;

/**
 * @author ylf
 *
 * 2016年11月5日
 */
public class Node {
	private Integer item;
	private Node lchild;
	private Node rchild;
	
	public Node(){
		
	}
	public Node(Integer item, Node lchild, Node rchild){
		this.item = item;
		this.lchild = lchild;
		this.rchild = rchild;
	}
	public Integer getItem() {
		return item;
	}
	public void setItem(Integer item) {
		this.item = item;
	}
	public Node getLchild() {
		return lchild;
	}
	public void setLchild(Node lchild) {
		this.lchild = lchild;
	}
	public Node getRchild() {
		return rchild;
	}
	public void setRchild(Node rchild) {
		this.rchild = rchild;
	}
}
