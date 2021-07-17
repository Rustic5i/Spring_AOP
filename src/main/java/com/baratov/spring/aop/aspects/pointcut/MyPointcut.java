package com.baratov.spring.aop.aspects.pointcut;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyPointcut {
    @Pointcut("execution(void add*(..))")
    public void allAddMethods(){}
}
