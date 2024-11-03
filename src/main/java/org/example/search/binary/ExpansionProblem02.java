package org.example.search.binary;

/**
 * 最左最右索引查找
 */
public interface ExpansionProblem02 {

	/**
	 * 给定一个数组nums, 元素按从小到大的顺序排列, 请查找并返回元素target在该数组中的最左索引与最右索引
	 * @param nums 要搜索的数组.
	 * @param target 要查找的目标值.
	 * @return 如果找到最左或最右索引, 则返回其在数组中的索引; 否则返回-1.
	 */
	int[] search(int[] nums, int target);

}
