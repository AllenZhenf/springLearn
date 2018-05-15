package main.java.springLearn.profileBean;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE,ElementType.ANNOTATION_TYPE,ElementType.CONSTRUCTOR,ElementType.FIELD,ElementType.LOCAL_VARIABLE
,ElementType.METHOD,ElementType.PACKAGE,ElementType.PARAMETER})
public @interface Cold {
}
