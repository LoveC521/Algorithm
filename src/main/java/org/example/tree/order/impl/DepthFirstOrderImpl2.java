package org.example.tree.order.impl;

import org.example.tree.TreeNode;
import org.example.tree.order.DepthFirstOrder;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * 栈实现
 */
public class DepthFirstOrderImpl2 implements DepthFirstOrder {

	@Override
	public List<Integer> preOrder(TreeNode<Integer> root) {
		List<Integer> list = new ArrayList<>();
		Deque<TreeNode<Integer>> stack = new ArrayDeque<>();
		TreeNode<Integer> cur = root;

		while (cur != null || !stack.isEmpty()) {
			if (cur != null) {
				list.add(cur.val);
				stack.push(cur);
				cur = cur.left;
			}
			else {
				cur = stack.pop().right;
			}
		}
		return list;
	}

	@Override
	public List<Integer> inOrder(TreeNode<Integer> root) {
		List<Integer> list = new ArrayList<>();
		TreeNode<Integer> cur = root;
		Deque<TreeNode<Integer>> stack = new ArrayDeque<>();

		while (cur != null || !stack.isEmpty()) {
			if (cur != null) {
				stack.push(cur);
				cur = cur.left;
			}
			else {
				TreeNode<Integer> pop = stack.pop();
				list.add(pop.val);
				cur = pop.right;
			}
		}
		return list;
	}

	@Override
	public List<Integer> postOrder(TreeNode<Integer> root) {
		List<Integer> list = new ArrayList<>();
		Deque<TreeNode<Integer>> stack = new ArrayDeque<>();

		TreeNode<Integer> cur = root;
		TreeNode<Integer> pop = null;
		while (cur != null || !stack.isEmpty()) {
			if (cur != null) {
				stack.push(cur);
				cur = cur.left;
			}
			else {
				TreeNode<Integer> peek = stack.peek();
				if (peek.right == null || peek.right == pop) {
					pop = stack.pop();
					list.add(pop.val);
				}
				else {
					cur = peek.right;
				}
			}
		}
		return list;
	}

}
