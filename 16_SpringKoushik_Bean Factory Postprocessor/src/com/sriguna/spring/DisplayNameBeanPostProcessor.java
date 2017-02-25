package com.sriguna.spring;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class DisplayNameBeanPostProcessor implements BeanPostProcessor {

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("In postProcessAfterInitialization is  " + beanName);
		return bean;
	}

	@Override
	// two arguments one is object and other is string
	// arg0- bean object
	// arg1 - name of the bean
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("In postProcessBeforeInitialization is  " + beanName);
		return bean;

	}

}
