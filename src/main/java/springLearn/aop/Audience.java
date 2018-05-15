package main.java.springLearn.aop;

import org.aspectj.lang.annotation.*;

@Aspect
public class Audience {

    @Pointcut("execution(**main.java.springLearn.aop.Audience.perform(..))")
    public void performance(){

    }

    @Before("performance()")
    public void silenceCellPhones(){
        System.out.println("silencing cell phones");
    }

    @Before("performance()")
    public void takeSeats(){
        System.out.println("Taking seats");
    }

    @AfterReturning("performance()")
    public void applause(){
        System.out.println("CLAP CLAP CLAP");
    }

    @AfterThrowing("performance()")
    public void demandRefund(){
        System.out.println("Demanding a refund");
    }
}
