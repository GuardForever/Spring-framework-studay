package org.springframework;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.PrepareRefreshTest;

public class Main {
	public static void main(String[] args) {

		/**
		 * 测试占位符替换
		 * ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-${lianmeng}.xml");
		 */

		/**
		 * 测试重写initPropertySources 刷新前的准备  给环境变量初始化
		 */
		ApplicationContext applicationContext = new PrepareRefreshTest("spring-${lianmeng}.xml");


		// 启动配置
		// ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring-config.xml");
		User user = (User) applicationContext.getBean("user");
		user.hello();
	}
}