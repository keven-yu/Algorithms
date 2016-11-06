/**
 * 
 */
package binary_sort_tree;

/**
 * @author ylf
 *
 * 2016年11月5日
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Node a = new Node(10, null, null);
		Node b = new Node(8, null, null);
		Node c = new Node(14, null, null);
		Node d = new Node(5, null, null);
		Node e = new Node(12, null, null);
		Node f = new Node(19, null, null);
		Node g = new Node(7, null, null);
		a.setLchild(b);
		a.setRchild(c);
		b.setLchild(d);
		c.setLchild(e);
		c.setRchild(f);
		d.setRchild(g);
		
		BinarySortTree binarySortTree = new BinarySortTree();
//		Node searchResult = binarySortTree.search(a, 13);
//		if (null != searchResult){
//			System.out.println(searchResult.getItem());
//		} else {
//			System.out.println("no the element");
//		}
		
		binarySortTree.insert(a, 13);
		
		Node searchResult = binarySortTree.recursiveSearch(a, 15);
		if (null != searchResult){
			System.out.println(searchResult.getItem());
		} else {
			System.out.println("no the element");
		}
	}

}
