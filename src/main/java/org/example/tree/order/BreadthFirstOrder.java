package org.example.tree.order;

import org.example.tree.TreeNode;

import java.util.List;

/**
 * 广度优先遍历(层序遍历)
 */
public interface BreadthFirstOrder {

	/**
	 * 给你二叉树的根节点root, 返回其节点值的层序遍历.(即逐层地, 从左到右访问所有节点).
	 * @param root 根节点
	 * @return 根节点的层序遍历
	 */
	List<List<Integer>> order(TreeNode<Integer> root);

}
