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
}
