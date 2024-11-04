package org.example.tree.order;

import org.example.tree.TreeNode;
import org.example.tree.order.impl.BreadthFirstOrderImpl1;
import org.example.tree.order.impl.BreadthFirstOrderImpl2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

@DisplayName("测试二叉树的广度优先遍历(层序遍历)")
public class BreadthFirstOrderTest {

	private static final TreeNode<Integer> root = new TreeNode<>(1,
			new TreeNode<>(2, new TreeNode<>(4), new TreeNode<>(5)),
			new TreeNode<>(3, new TreeNode<>(6), new TreeNode<>(7)));

	private static final List<List<Integer>> expectedList = List.of(List.of(1), List.of(2, 3), List.of(4, 5, 6, 7));

	@DisplayName("测试递归实现")
	@Test
	public void test1() {
		BreadthFirstOrder breadthFirstOrder = new BreadthFirstOrderImpl1();
		Assertions.assertIterableEquals(expectedList, breadthFirstOrder.order(root));
	}

	@DisplayName("测试队列实现")
	@Test
	public void test2() {
		BreadthFirstOrder breadthFirstOrder = new BreadthFirstOrderImpl2();
		Assertions.assertIterableEquals(expectedList, breadthFirstOrder.order(root));
	}

}