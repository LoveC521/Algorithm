package org.example.search.binary.impl;

import org.example.search.binary.BinarySearch;

/**
 * 二分查找平衡版
 */
public class BinarySearchImpl3 implements BinarySearch {

	@Override
	public int search(int[] nums, int target) {
		int left = 0;
		int right = nums.length;

		while (1 < right - left) {
			int mid = (left + right) >>> 1;
			if (nums[mid] > target) {
				right = mid;
			}
			else {
				left = mid;
			}
		}
		return nums[left] == target ? left : -1;
	}

}
