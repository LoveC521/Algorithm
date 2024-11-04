package org.example.tree.order;

import org.example.tree.TreeNode;

import java.util.List;

/**
 * 深度优先遍历
 */
public interface DepthFirstOrder {

	/**
	 * 给你二叉树的根节点root, 返回它节点值的前序遍历.
	 * @param root 根节点
	 * @return 根节点的前序遍历
	 */
	List<Integer> preOrder(TreeNode<Integer> root);

	/**
	 * 给你二叉树的根节点root, 返回它节点值的中序遍历.
	 * @param root 根节点
	 * @return 根节点的中序遍历
	 */
	List<Integer> inOrder(TreeNode<Integer> root);

	/**
	 * 给你二叉树的根节点root, 返回它节点值的后序遍历.
	 * @param root 根节点
	 * @return 根节点的后序遍历
	 */
	List<Integer> postOrder(TreeNode<Integer> root);

}
