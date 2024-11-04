package org.example.tree.order.impl;

import org.example.tree.TreeNode;
import org.example.tree.order.DepthFirstOrder;

import java.util.ArrayList;
import java.util.List;

/**
 * 递归实现
 */
public class DepthFirstOrderImpl1 implements DepthFirstOrder {

	@Override
	public List<Integer> preOrder(TreeNode<Integer> root) {
		List<Integer> list = new ArrayList<>();
		preOrderDfs(root, list);
		return list;
	}

	private void preOrderDfs(TreeNode<Integer> node, List<Integer> list) {
		if (node == null) {
			return;
		}

		list.add(node.val);
		preOrderDfs(node.left, list);
		preOrderDfs(node.right, list);
	}

	@Override
	public List<Integer> inOrder(TreeNode<Integer> root) {
		List<Integer> list = new ArrayList<>();
		inOrderDfs(root, list);
		return list;
	}

	private void inOrderDfs(TreeNode<Integer> node, List<Integer> list) {
		if (node == null) {
			return;
		}

		inOrderDfs(node.left, list);
		list.add(node.val);
		inOrderDfs(node.right, list);
	}

	@Override
	public List<Integer> postOrder(TreeNode<Integer> root) {
		List<Integer> list = new ArrayList<>();
		postOrderDfs(root, list);
		return list;
	}

	private void postOrderDfs(TreeNode<Integer> node, List<Integer> list) {
		if (node == null) {
			return;
		}

		postOrderDfs(node.left, list);
		postOrderDfs(node.right, list);
		list.add(node.val);
	}

}
