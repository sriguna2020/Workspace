package com.sriguna.spring;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class MyBeanFactorPostProcessor implements BeanFactoryPostProcessor {

	
	//beanFactory - this is the bean factory object
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {

		System.out.println("My bean factory post processor is called");
	}

}
