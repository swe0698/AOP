package com.example.aop.aopbasics.aspect;

import org.aspectj.lang.annotation.Pointcut;

public class CommonPointCut {
    @Pointcut("@annotation(com.example.aop.aopbasics.aspect.Tracktime)")
    public void tracktime(){}


}
