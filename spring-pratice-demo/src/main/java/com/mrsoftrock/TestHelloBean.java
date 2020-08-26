package com.mrsoftrock;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Auther Mr.SoftRock
 * @Date 2020/8/26
 **/
public class TestHelloBean {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MrSoftRockConfig.class);
		Hello hello = context.getBean(Hello.class);
		hello.hello();
	}
}
