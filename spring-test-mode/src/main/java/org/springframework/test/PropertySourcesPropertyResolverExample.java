package org.springframework.test;

import org.springframework.util.PropertyPlaceholderHelper;

/**
 * 测试占位符替换的函数式接口
 */
public class PropertySourcesPropertyResolverExample {
	private String propertyValue = "examplePropertyValue";

	private String getPropertyAsRawString(String s) {
		return propertyValue;
	}

	public static void main(String[] args) {
		PropertySourcesPropertyResolverExample example = new PropertySourcesPropertyResolverExample();
		PropertyPlaceholderHelper helper = new PropertyPlaceholderHelper("${", "}");

		// 使用方法引用调用getPropertyAsRawString方法
		String result = helper.replacePlaceholders("The property value is: ${propertyName}", example::getPropertyAsRawString);

		System.out.println(result);  // 输出: The property value is: examplePropertyValue
	}
}
