package org.springframework.test;

import org.springframework.context.ApplicationListener;
import org.springframework.context.support.AbstractXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.PropertySource;
import org.springframework.core.env.StandardEnvironment;

import java.util.Map;

/**
 * 为了测试ClassPathXmlApplicationContext 里面prepareRefresh准备方法
 * 重写initPropertySources方法
 */
public class PrepareRefreshTest extends ClassPathXmlApplicationContext {

	public PrepareRefreshTest(String... xmlPath){
		super(xmlPath);
	}
	/**
	 * 重写方法并在Main类中进行测试
	 */
	@Override
	protected void initPropertySources() {
		Map<String, Object> systemEnvironment = getEnvironment().getSystemEnvironment();
		Map<String, Object> Properties = getEnvironment().getSystemProperties();
		Properties.put("name","lianmeng");
		getEnvironment().setRequiredProperties("username");
	}

}
