package org.example.util;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.TypeFactory;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class DataLoader {

	/**
	 * 加载resources目录下的JSON文件
	 */
	public static <T> List<T> load(String path, Class<T> clazz) throws IOException {
		InputStream inputStream = DataLoader.class.getClassLoader().getResourceAsStream(path);

		ObjectMapper objectMapper = new ObjectMapper();
		return objectMapper.readValue(inputStream,
				TypeFactory.defaultInstance().constructCollectionType(List.class, clazz));
	}

}
