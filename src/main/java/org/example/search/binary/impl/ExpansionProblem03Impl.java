package org.example.search.binary.impl;

import org.example.search.binary.ExpansionProblem03;

public class ExpansionProblem03Impl implements ExpansionProblem03 {

	@Override
	public int[] search(int[] nums, int target) {
		return new int[] { searchFirst(nums, target), searchLast(nums, target) };
	}

	// 搜索第一个>=target的元素的索引
	private int searchFirst(int[] nums, int target) {
		int left = 0;
		int right = nums.length - 1;

		while (left <= right) {
			int mid = (left + right) >>> 1;
			if (nums[mid] >= target) {
				right = mid - 1;
			}
			else {
				left = mid + 1;
			}
		}
		return left;
	}

	// 搜索最后一个<=target的元素的索引
	private int searchLast(int[] nums, int target) {
		int left = 0;
		int right = nums.length - 1;

		while (left <= right) {
			int mid = (left + right) >>> 1;
			if (nums[mid] > target) {
				right = mid - 1;
			}
			else {
				left = mid + 1;
			}
		}

		return right;
	}

}
