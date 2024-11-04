package org.example.tree.order.impl;

import org.example.tree.TreeNode;
import org.example.tree.order.BreadthFirstOrder;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/**
 * 队列实现
 */
public class BreadthFirstOrderImpl2 implements BreadthFirstOrder {

	@Override
	public List<List<Integer>> order(TreeNode<Integer> root) {
		if (root == null) {
			return new ArrayList<>();
		}

		List<List<Integer>> res = new ArrayList<>();
		Queue<TreeNode<Integer>> queue = new ArrayDeque<>();
		queue.offer(root);

		while (!queue.isEmpty()) {
			int size = queue.size();
			List<Integer> list = new ArrayList<>();
			for (int i = 0; i < size; i++) {
				TreeNode<Integer> node = queue.poll();
				list.add(node.val);
				if (node.left != null) {
					queue.offer(node.left);
				}
				if (node.right != null) {
					queue.offer(node.right);
				}
			}
			res.add(list);
		}

		return res;
	}

}
