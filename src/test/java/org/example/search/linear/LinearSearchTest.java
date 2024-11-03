package org.example.search.linear;

import org.example.search.BaseLinearAndBinarySearchTest;
import org.example.search.linear.impl.LinearSearchImpl;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

@DisplayName("测试顺序查找")
public class LinearSearchTest extends BaseLinearAndBinarySearchTest {

	@ParameterizedTest
	@MethodSource("provideTestData")
	public void test(TestData testData) {
		test0(testData, new LinearSearchImpl()::search);
	}

}