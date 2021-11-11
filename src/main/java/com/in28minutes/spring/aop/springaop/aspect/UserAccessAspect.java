package com.in28minutes.spring.aop.springaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class UserAccessAspect {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	/*
	 * // @Before("execution(* com.in28minutes.spring.aop.springaop..*.*(..))")
	 */
	@Before("execution(* com.in28minutes.spring.aop.springaop.data.*.*(..))")
	public void before(JoinPoint joinpoint) {
		logger.info("Intercepted Methods Call - {}", joinpoint);
	}
}
