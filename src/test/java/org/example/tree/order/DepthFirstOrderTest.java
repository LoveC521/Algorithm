package org.example.tree.order;

import org.example.tree.TreeNode;
import org.example.tree.order.impl.DepthFirstOrderImpl1;
import org.example.tree.order.impl.DepthFirstOrderImpl2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

@DisplayName("测试深度优先遍历")
public class DepthFirstOrderTest {

	private static final TreeNode<Integer> root = new TreeNode<>(1,
			new TreeNode<>(2, new TreeNode<>(4), new TreeNode<>(5)),
			new TreeNode<>(3, new TreeNode<>(6), new TreeNode<>(7)));

	private static final List<Integer> expectedPreOrderList = List.of(1, 2, 4, 5, 3, 6, 7);

	private static final List<Integer> expectedInOrderList = List.of(4, 2, 5, 1, 6, 3, 7);

	private static final List<Integer> expectedPostOrderList = List.of(4, 5, 2, 6, 7, 3, 1);

	@DisplayName("测试递归实现")
	@Test
	public void test1() {
		DepthFirstOrder depthFirstOrder = new DepthFirstOrderImpl1();
		Assertions.assertIterableEquals(expectedPreOrderList, depthFirstOrder.preOrder(root), "前序遍历用例不通过");
		Assertions.assertIterableEquals(expectedInOrderList, depthFirstOrder.inOrder(root), "中序遍历用例不通过");
		Assertions.assertIterableEquals(expectedPostOrderList, depthFirstOrder.postOrder(root), "后序遍历用例不通过");
	}

	@DisplayName("测试栈实现")
	@Test
	public void test2() {
		DepthFirstOrder depthFirstOrder = new DepthFirstOrderImpl2();
		Assertions.assertIterableEquals(expectedPreOrderList, depthFirstOrder.preOrder(root), "前序遍历用例不通过");
		Assertions.assertIterableEquals(expectedInOrderList, depthFirstOrder.inOrder(root), "中序遍历用例不通过");
		Assertions.assertIterableEquals(expectedPostOrderList, depthFirstOrder.postOrder(root), "后序遍历用例不通过");
	}

}