package org.naren.kadiri;

import org.naren.kadiri.service.ShapeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AopMain {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		ShapeService shapeService = context.getBean("ShapeService", ShapeService.class);
		shapeService.getCircle();// .setName("Dummy Name");
		// shapeService.getCircle().setNameArguments("Naren Name");
		// System.out.println(shapeService.getCircle().getName());
	}

}
