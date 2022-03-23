package com.example.aop.aopbasics.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class AroundAdvice {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Around("com.example.aop.aopbasics.aspect.CommonPointCut.tracktime()")
    public void around(ProceedingJoinPoint joinPoint) throws Throwable {
        long start = System.currentTimeMillis();
        joinPoint.proceed();
        Long totaltime = System.currentTimeMillis() - start;
        logger.info("Kutty kani - {}",totaltime);
    }
}
