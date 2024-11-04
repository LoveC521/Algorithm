package org.example.tree;

public class TreeNode<T> {

	public int val;

	public TreeNode<T> left;

	public TreeNode<T> right;

	public TreeNode(int val) {
		this.val = val;
	}

	public TreeNode(int val, TreeNode<T> left, TreeNode<T> right) {
		this.val = val;
		this.left = left;
		this.right = right;
	}

}
