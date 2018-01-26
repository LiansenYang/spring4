package com.atguigu.spring.ref;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.FactoryBean;

import com.atguigu.spring.helloworld.Car;
import com.atguigu.spring.helloworld.User;

public class UserBean implements FactoryBean<User>{

	/**
	 * ���ص� bean ��ʵ��
	 */
	public User getObject() throws Exception {
		User user = new User();
		user.setUserName("abc");
		user.setWifeName("ABC");
		
		List<Car> cars = new ArrayList<Car>();
		cars.add(new Car("ShangHai", "BuiKe", 180, 300000));
		cars.add(new Car("ShangHai", "CRUZE", 130, 150000));
		
		user.setCars(cars);
		return user;
	}

	/**
	 * ���ص� bean ������
	 */
	public Class<?> getObjectType() {
		return User.class;
	}

	/**
	 * ���ص� bean �Ƿ�Ϊ������
	 */
	public boolean isSingleton() {
		return true;
	}

}
