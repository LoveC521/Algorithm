package org.example.search.linear.impl;

import org.example.search.linear.LinearSearch;

public class LinearSearchImpl implements LinearSearch {

	@Override
	public int search(int[] nums, int target) {
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == target) {
				return i;
			}
		}
		return -1;
	}

}
