package org.example.search;

import org.example.util.DataLoader;
import org.junit.jupiter.api.Assertions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.Arrays;
import java.util.stream.Stream;

public class BaseLinearAndBinarySearchTest {

	static Logger log = LoggerFactory.getLogger(BaseLinearAndBinarySearchTest.class);

	public static void test0(TestData testData, Search search) {
		Assertions.assertEquals(testData.output, search.search(testData.input.nums, testData.input.target),
				String.format("第%d个用例未通过, input{nums=%s, target=%d}", testData.id, Arrays.toString(testData.input.nums),
						testData.input.target));
	}

	public static Stream<TestData> provideTestData() throws IOException {
		return DataLoader.load("search/linear_and_binary_test_data.json", TestData.class).stream();
	}

	public static class TestData {

		public int id;

		public TestDataInput input;

		public int output;

		public static class TestDataInput {

			public int[] nums;

			public int target;

		}

	}

	public interface Search {

		int search(int[] nums, int target);

	}

}
