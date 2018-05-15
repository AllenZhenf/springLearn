package main.java.springLearn.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Pointcut;

public class AudienceAround {

    @Pointcut("execution(**main.java.springLearn.aop.Audience.perform(..))")
    public void performance(){

    }

    @Around("performance()")
    public void watchPerformance(ProceedingJoinPoint jp){
        try {
            System.out.println("silencing cell phones");
            System.out.println("Taking seats");
            jp.proceed();
            System.out.println("CLAP CLAP CLAP");
        } catch (Throwable throwable) {
            System.out.println("Demanding a refund");
        }
    }


}
