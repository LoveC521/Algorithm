package org.example.tree.order.impl;

import org.example.tree.TreeNode;
import org.example.tree.order.BreadthFirstOrder;

import java.util.ArrayList;
import java.util.List;

/**
 * 递归实现
 */
public class BreadthFirstOrderImpl1 implements BreadthFirstOrder {

	@Override
	public List<List<Integer>> order(TreeNode<Integer> root) {
		List<List<Integer>> list = new ArrayList<>();
		bfs(root, list, 0);
		return list;
	}

	private void bfs(TreeNode<Integer> node, List<List<Integer>> list, int level) {
		if (node == null) {
			return;
		}

		if (list.size() == level) {
			list.add(new ArrayList<>());
		}
		list.get(level).add(node.val);

		bfs(node.left, list, level + 1);
		bfs(node.right, list, level + 1);
	}

}
