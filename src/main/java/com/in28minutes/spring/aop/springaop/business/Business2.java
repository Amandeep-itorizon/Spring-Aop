package com.in28minutes.spring.aop.springaop.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.in28minutes.spring.aop.springaop.data.Dao2;

@Service
public class Business2 {
	@Autowired
	Dao2 dao2;

	public String calculateSomething() {
		return dao2.retrievedSomething();
	}
}
