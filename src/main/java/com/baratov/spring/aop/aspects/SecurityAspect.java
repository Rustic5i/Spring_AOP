package com.baratov.spring.aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(10)
public class SecurityAspect {
    @Before("com.baratov.spring.aop.aspects.pointcut.MyPointcut.allAddMethods()")
    public void beforeAddMethodsAdvice(){
        System.out.println("beforeGetMethodsAdvice: logg 1");
        System.out.println("----------------------------------------------------------------------------------");
    }
}
