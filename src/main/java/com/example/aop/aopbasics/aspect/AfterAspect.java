package com.example.aop.aopbasics.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class AfterAspect {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @AfterReturning(value = "execution(* com.example.aop.aopbasics.data.*.*(..))", returning = "result")
    public void after(JoinPoint joinPoint, Object result){
                logger.info("kani - {}",joinPoint);
                logger.info("Mahi {}", result);
    }
}
