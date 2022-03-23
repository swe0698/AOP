package com.example.aop.aopbasics.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Aspect
@Configuration
public class BeforeAspect {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Before("execution(* com.example.aop.aopbasics.data0 .*.*(..))")
    public void before(JoinPoint joinPoint){
        logger.info("Kutty kani - {}",joinPoint);
    }
}
