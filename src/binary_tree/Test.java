/**
 * 
 */
package binary_tree;

/**
 * @author ylf
 *
 * 2016年11月4日
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Node<String> root = new Node<String>("a");
		Node<String> b = new Node<String>("b");
		Node<String> c = new Node<String>("c");
		Node<String> d = new Node<String>("d");
		Node<String> e = new Node<String>("e");
		Node<String> f = new Node<String>("f");
		root.setLchild(b);
		root.setRchild(c);
		b.setLchild(d);
		b.setRchild(e);
		d.setRchild(f);
		BinaryTree<String> binaryTree = new BinaryTree<String>();
		binaryTree.preorderTraverse(root);
		binaryTree.inorderTraverse(root);
		binaryTree.postorderTraverse(root);
		binaryTree.levelTraverse(root);
		
	}

}
