package org.springframework.up;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

/**
 * Copyright 2022 NVXClouds Inc. All Rights Reserved.
 *
 * @author muzhi
 * @date 2023-03-18 23:19:15
 */
@SuppressWarnings("deprecation")
public class MyTestBeanTest {

	@Test
	public void testSimpleLoad() {
		BeanFactory br = new XmlBeanFactory(new ClassPathResource("config/spring.xml"));
		MyTestBean bean = (MyTestBean) br.getBean("myTestBean");
		System.out.println(bean.getTestStr());
		Assert.assertEquals("testStr", bean.getTestStr());
	}
}