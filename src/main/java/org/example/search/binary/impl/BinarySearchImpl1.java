package org.example.search.binary.impl;

import org.example.search.binary.BinarySearch;

/**
 * 二分查找基础版
 */
public class BinarySearchImpl1 implements BinarySearch {

	@Override
	public int search(int[] nums, int target) {
		int left = 0;
		int right = nums.length - 1;

		while (left <= right) {
			int mid = (left + right) >>> 1;
			if (nums[mid] < target) {
				left = mid + 1;
			}
			else if (nums[mid] > target) {
				right = mid - 1;
			}
			else {
				return mid;
			}
		}
		return -1;
	}

}
