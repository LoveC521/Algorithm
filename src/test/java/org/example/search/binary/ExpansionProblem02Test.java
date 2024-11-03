package org.example.search.binary;

import org.example.search.binary.impl.ExpansionProblem02Impl;
import org.example.util.DataLoader;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.io.IOException;
import java.util.Arrays;
import java.util.stream.Stream;

@DisplayName("测试最左最右索引查找")
public class ExpansionProblem02Test {

	@ParameterizedTest
	@MethodSource("provideTestData")
	public void test(TestData testData) {
		ExpansionProblem02 expansionProblem02 = new ExpansionProblem02Impl();
		Assertions.assertArrayEquals(testData.output,
				expansionProblem02.search(testData.input.nums, testData.input.target),
				String.format("第%d个用例未通过, input{nums=%s, target=%d}", testData.id, Arrays.toString(testData.input.nums),
						testData.input.target));
	}

	public static Stream<TestData> provideTestData() throws IOException {
		return DataLoader.load("search/binary_expansion_problem02_test_data.json", TestData.class).stream();
	}

	public static class TestData {

		public int id;

		public TestDataInput input;

		public int[] output;

		public static class TestDataInput {

			public int[] nums;

			public int target;

		}

	}

}