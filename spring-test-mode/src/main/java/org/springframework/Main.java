package org.springframework;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		// 启动配置
		// ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring-config.xml");
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-${lianmeng}.xml");
		User user = (User) applicationContext.getBean("user");
		user.hello();
	}
}