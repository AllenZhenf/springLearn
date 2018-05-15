package main.java.springLearn.profileBean;

import java.lang.annotation.*;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.CLASS)
@Documented
public @interface TestAnnotaton {
    public int id() default -1;
    public String desprition() default "";
}

