package org.example.search.binary.impl;

import org.example.search.binary.BinarySearch;

/**
 * 二分查找改动版
 */
public class BinarySearchImpl2 implements BinarySearch {

	@Override
	public int search(int[] nums, int target) {
		int left = 0;
		int right = nums.length;

		while (left < right) {
			int mid = (left + right) >>> 1;
			if (nums[mid] < target) {
				left = mid + 1;
			}
			else if (nums[mid] > target) {
				right = mid;
			}
			else {
				return mid;
			}
		}
		return -1;
	}

}
