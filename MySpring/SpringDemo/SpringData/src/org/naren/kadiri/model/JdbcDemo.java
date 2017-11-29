package org.naren.kadiri.model;

import org.naren.kadiri.Circle;
import org.naren.kadiri.dao.JdbcDaoImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JdbcDemo {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		JdbcDaoImpl dao = context.getBean("jdbcDaoImpl", JdbcDaoImpl.class);

		// Circle circle = dao.getCircle(1);
		// System.out.println(circle.getName());
		// System.out.println(dao.getCircleCount());
		//System.out.println(dao.getCircleName(1));
		//System.out.println(dao.getCircleNameById(1).getName());
		//System.out.println(dao.getCircleNameById());
		dao.insertCircle(new Circle(3,"third Circle"));
		System.out.println(dao.getCircleNameById().size());
	}

}
