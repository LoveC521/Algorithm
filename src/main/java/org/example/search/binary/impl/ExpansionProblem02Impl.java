package org.example.search.binary.impl;

import org.example.search.binary.ExpansionProblem02;

public class ExpansionProblem02Impl implements ExpansionProblem02 {

	@Override
	public int[] search(int[] nums, int target) {
		return new int[] { searchLeftMost(nums, target), searchRightMost(nums, target) };
	}

	// 搜索最左索引
	private int searchLeftMost(int[] nums, int target) {
		int left = 0;
		int right = nums.length - 1;
		int candidate = -1;

		while (left <= right) {
			int mid = (left + right) >>> 1;
			if (nums[mid] < target) {
				left = mid + 1;
			}
			else if (nums[mid] > target) {
				right = mid - 1;
			}
			else {
				candidate = mid;
				right = mid - 1;
			}
		}

		return candidate;
	}

	// 搜索最右索引
	private int searchRightMost(int[] nums, int target) {
		int left = 0;
		int right = nums.length - 1;
		int candidate = -1;

		while (left <= right) {
			int mid = (left + right) >>> 1;
			if (nums[mid] < target) {
				left = mid + 1;
			}
			else if (nums[mid] > target) {
				right = mid - 1;
			}
			else {
				candidate = mid;
				left = mid + 1;
			}
		}

		return candidate;
	}

}
