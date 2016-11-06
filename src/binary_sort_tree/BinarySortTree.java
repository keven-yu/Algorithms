/**
 * 
 */
package binary_sort_tree;

/**
 * @author ylf
 *
 * 2016年11月5日
 */
public class BinarySortTree {
	
	/**
	 * Non - recursive search algorithm.
	 * @param tree Binary Sort Tree.
	 * @param element To find element.
	 * @return
	 */
	public Node search(Node tree, Integer element){
		Node temp = tree;
		if (null == temp){
			return null;
		}
		while (temp != null && element != temp.getItem()){
			if (temp.getItem() > element){
				temp = temp.getLchild();
			} else {
				temp = temp.getRchild();
			}
		}
		return temp;
	}
	
	/**
	 * Recursive search algorithm.
	 * @param tree Binary Sort Tree.
	 * @param element To find element.
	 * @return
	 */
	public Node recursiveSearch(Node tree, Integer element){
		if (null == tree){
			return tree;
		}
		if (tree.getItem() == element){
			return tree;
		}
		if (tree.getItem() < element){
			return recursiveSearch(tree.getRchild(), element);
		}
		
		return recursiveSearch(tree.getLchild(), element);
	}
	
	/**
	 * Insertion of binary sort tree.
	 * @param tree
	 * @param newNode
	 * @return
	 */
	public void insert(Node tree, int item){
		Node newNode = new Node(item, null, null);
		Node p = tree;
		Node prev = null;
		while (p != null){
			prev = p;
			if (p.getItem() > newNode.getItem()){
				p = p.getLchild();
			} else if (p.getItem() < newNode.getItem()){
				p = p.getRchild();
			} else {
				return ;
			}
		}
		if (null == tree){
			tree = newNode;
		} else if (prev.getItem() > newNode.getItem()){
			prev.setLchild(newNode);
		} else {
			prev.setRchild(newNode);
		}
	}
}
