package org.example.search.binary;

/**
 * 最靠左最靠右索引查找
 */
public interface ExpansionProblem03 {

	/**
	 * 给定一个数组nums, 元素按从小到大的顺序排列, 请查找并返回在数组中第一个>=target的元素的索引、最后一个<=target的元素的索引。
	 * @param nums 要搜索的数组。
	 * @param target 要查找的目标值。
	 * @return 数组中第一个>=target的元素的位置、最后一个<=target的元素的位置
	 */
	int[] search(int[] nums, int target);

}
