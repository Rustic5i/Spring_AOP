package com.baratov.spring.aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(20)
public class ExceptionAspect {
    @Before("com.baratov.spring.aop.aspects.pointcut.MyPointcut.allAddMethods()")
    private void addMethodsExceptionAdvice(){
        System.out.println("getMethodsExceptionAdvice: log 2");
        System.out.println("----------------------------------------------------------------------------------");
    }
}
