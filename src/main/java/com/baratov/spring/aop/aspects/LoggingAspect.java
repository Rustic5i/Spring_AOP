package com.baratov.spring.aop.aspects;

import com.baratov.spring.aop.library.book.Book;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

//Aspect - это класс, отвечающий за сквозную фунциональность
@Component
@Aspect /*@Aspect говорит о том, что это не простой класс, а аспектный.
          По этому к этому классу Spring будет атноситься по другому
          для этой аннотаций нужна зависимость AspectJ Weaver*/

 /*   @Before(от англ, До) это тип Advice тоесть, тип действия которое
      должно произойти при использования этого метода
      execution(от англ, Выполнить).
      тоесть в этой аннотации мы указываем перед каким методом должен сработать наш метод */
@Order(30)
public class LoggingAspect {

    @Before("execution(* getBookList())")
    public void beforeGetLoggingAdvice(){
        System.out.println("beforeGetLoggingAdvice(): логируем получение списка книг");
    }

    @AfterReturning("execution(* getBookList())")
    public void afterReturningGetLoggingAdvice(){
        System.out.println("afterReturningGetLoggingAdvice(): логируем получение списка книг");
    }




    @Before("com.baratov.spring.aop.aspects.pointcut.MyPointcut.allAddMethods()")
    public void beforeAddMethodsLoggingAdvice(JoinPoint joinPoint) {
//-------------РАБОТА С СИГНАТУРОЙ МЕТОДА
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        System.out.println("methodSignature = " + methodSignature);
        System.out.println("methodSignature.getMethod() = " + methodSignature.getMethod());
        System.out.println("methodSignature.getReturnType() = " + methodSignature.getReturnType());
        System.out.println("methodSignature.getName() = " + methodSignature.getName());
//-------------РАБОТА С ПАРАМЕТРАМИ МЕТОДА
        if (methodSignature.getName().equals("addBook")){
            Object[] arguments = joinPoint.getArgs();//Получили все параметры метода в массив Object[]
            for (Object obj:arguments) {
                if (obj instanceof Book){
                    Book myBook = (Book) obj;
                    System.out.println("Информация о книге: "+myBook);
                }
                else if (obj instanceof String){
                    System.out.println("Книгу в библиотку добовляет "+obj);
                }
            }
        }
//------------------------------------------------------------------------------------------------------------
        System.out.println("beforeAddMethodsLoggingAdvice: logg 3 попытка получить книгу/журнал");
        System.out.println("----------------------------------------------------------------------------------");
    }


//    @Pointcut("execution(* com.baratov.spring.aop.library.UniLibrary.*(..))")
//    private void allMethods(){}
//
//    @Pointcut("execution(public void returnMagazine())")
//    private void returnMagazine(){}
//
//    @Pointcut("allMethods() && !returnMagazine()")
//    private void allMethodsExceptReturn(){}
//
//    @Before("allMethodsExceptReturn()")
//    private void beforeAllMethodsExceptReturnAdvice(){
//        System.out.println("aadada");
//    }
//----------------------------------------------------------------------------
//    @Pointcut("execution(public void get*(*))")
//    private void allAddMethods(){}
//
//    @Pointcut("execution(public void return*())")
//    private void allReturnMethods(){}
//
//    @Pointcut("allAddMethods() || allReturnMethods()") //Комбинированый Pointcut
//    private void allGetAndReturnMethods(){}
//
//    @Before("allAddMethods()")
//    public void beforeGetLoggingAdvice(){
//        System.out.println("beforeGetLoggingAdvice: лог №1");
//    }
//    @Before("allReturnMethods()")
//    public void beforeReturnLoggingAdvice(){
//        System.out.println("beforeReturnLoggingAdvice: лог №2");
//    }
//
//    @Before("allGetAndReturnMethods()")
//    public void beforeGetAndReturnLoggingAdvice(){
//        System.out.println("beforeGetAndReturnLoggingAdvice(): лог №3");
//    }
//----------------------------------------------------------------------------------
//    @Pointcut("execution(public void *(*))")
//    public void allAddMethods(){}
//
//
//    @Before("allAddMethods()")
//    public void beforeGetBookAdvice(){
//        //тут описываем что должно произойти
//        System.out.println("beforeGetBookAdvice: попытка получить книгу");
//    }
//
//
//    @After("allAddMethods()")
//    public void beforeReturnBookAdvice(){
//        //тут описываем что должно произойти
//        System.out.println("beforeReturnBookAdvice: попытка вернуть книгу");
//    }

//    @After("execution(* returnBook())")
//    public void beforeReturnBookAdvice(){
//        //тут описываем что должно произойти
//        System.out.println("beforeReturnBookAdvice: попытка вернуть книгу");
//    }

//    @Before("execution(public void get*(*))")
//    public void beforeGetBookAdvice(){
//        //тут описываем что должно произойти
//        System.out.println("beforeGetBookAdvice: попытка получить книгу");
//    }


}
