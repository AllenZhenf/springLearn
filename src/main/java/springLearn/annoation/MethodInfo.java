package main.java.springLearn.annoation;

import java.lang.annotation.*;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface MethodInfo {
    String author() default "s";
    String date();
    int revision() default 1;
    String comments();
}
