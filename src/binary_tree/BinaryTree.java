/**
 * 
 */
package binary_tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author ylf
 *
 * 2016年11月4日
 */
public class BinaryTree<T> {
	
	public BinaryTree(){
		
	}
	/**
	 * Binary tree of the preorder recursive traversal.
	 * @param root
	 */
	public void preorderTraverse(Node<T> root){
		
		if (null != root){
			System.out.println(root.getItem());
			preorderTraverse(root.getLchild());
			preorderTraverse(root.getRchild());
		}
	}
	
	/**
	 * Binary tree of the inorder recursive traversal.
	 * @param root
	 */
	public void inorderTraverse(Node<T> root){
		 
		if (null != root){
			inorderTraverse(root.getLchild());
			System.out.println(root.getItem());
			inorderTraverse(root.getRchild());
		}
	}
	
	/**
	 * Binary tree of the postorder recursive traversal.
	 * @param root
	 */
	public void postorderTraverse(Node<T> root){
		
		if (null != root){
			postorderTraverse(root.getLchild());
			postorderTraverse(root.getRchild());
			System.out.println(root.getItem());
		}
	}
	
	/**
	 * Binary tree of the level traversal.
	 * @param root
	 */
	public void levelTraverse(Node<T> root){
		if (null == root){
			return ;
		}
		Node<T> temp = null;
		Queue<Node<T>> queue = new LinkedList<Node<T>>();
		queue.offer(root);
		
		while (!queue.isEmpty()){
			temp = queue.poll();
			System.out.println(temp.getItem());
			if (null != temp.getLchild()){
				queue.offer(temp.getLchild());
			}
			if (null != temp.getRchild()){
				queue.offer(temp.getRchild());
			}
		}
		
	}
}
