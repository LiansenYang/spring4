package com.atguigu.spring.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.ClassUtils;

public class Main {
	
	public static void main(String[] args) {
//		ArithmeticCalculator arithmeticCalculator = new ArithmeticCalculatorImpl();
//
//		arithmeticCalculator =
//				new ArithmeticCalculatorLoggingProxy(arithmeticCalculator).getLoggingProxy();
//
//		int result = arithmeticCalculator.add(11, 12);
//		System.out.println("result:" + result);
//
//		result = arithmeticCalculator.div(21, 3);
//		System.out.println("resultsult:" + result);
		System.out.println(Thread.currentThread().getContextClassLoader());
		System.out.println(ClassUtils.getDefaultClassLoader());

		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext-aop.xml");
		ArithmeticCalculator arithmeticCalculator = (ArithmeticCalculator) ctx.getBean("arithmeticCalculator");
		
		System.out.println(arithmeticCalculator.getClass().getName());
		
		int result = arithmeticCalculator.add(11, 12);
		System.out.println("result:" + result);
		
		result = arithmeticCalculator.div(21, 3);
		System.out.println("result:" + result);
	}
	
}
