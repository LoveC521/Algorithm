package org.example.search.linear;

/**
 * 顺序查找
 */
public interface LinearSearch {

	/**
	 * 给定一个数组nums, 元素按从小到大的顺序排列且不重复. 请查找并返回元素target在该数组中的索引.
	 * @param nums 要搜索的数组.
	 * @param target 要查找的目标值.
	 * @return 如果找到目标值，则返回其在数组中的索引; 否则返回-1.
	 */
	int search(int[] nums, int target);

}
