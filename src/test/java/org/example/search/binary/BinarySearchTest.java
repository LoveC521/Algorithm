package org.example.search.binary;

import org.example.search.BaseLinearAndBinarySearchTest;
import org.example.search.binary.impl.BinarySearchImpl1;
import org.example.search.binary.impl.BinarySearchImpl2;
import org.example.search.binary.impl.BinarySearchImpl3;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

@DisplayName("测试二分查找（折半查找）")
public class BinarySearchTest extends BaseLinearAndBinarySearchTest {

	@DisplayName("基础版")
	@ParameterizedTest
	@MethodSource("provideTestData")
	public void test1(TestData testData) {
		test0(testData, new BinarySearchImpl1()::search);
	}

	@DisplayName("改动版")
	@ParameterizedTest
	@MethodSource("provideTestData")
	public void test2(TestData testData) {
		test0(testData, new BinarySearchImpl2()::search);
	}

	@DisplayName("平衡版")
	@ParameterizedTest
	@MethodSource("provideTestData")
	public void test3(TestData testData) {
		test0(testData, new BinarySearchImpl3()::search);
	}

}