package com.baratov.spring.aop.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAroundAspect {
    @Around("execution(public String returnBook())")
    private Object aroundReturnBookAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("aroundReturnBookAdvice(): начало работы ");

        Object targetMethodsResult = proceedingJoinPoint.proceed();//самостоятельно вызываем метод returnBook();
                                                                   // и записываем результат в переменную

        System.out.println("aroundReturnBookAdvice(): конец работы");
        return targetMethodsResult;
    }
}
