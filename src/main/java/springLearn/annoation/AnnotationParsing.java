package main.java.springLearn.annoation;

import java.lang.reflect.Method;

public class AnnotationParsing {
    public static void main(String[] args) {
        try {
//            for (Method method:AnnotationParsing.class.getClassLoader().loadClass("main.java.springLearn.annoation.AnnoationExample").getMethods()) {
//                if (method.isAnnotationPresent(MethodInfo.class)) {
//                    for (Annotation annotation:method.getDeclaredAnnotations()) {
//                        System.out.println("Annotation in Method "+annotation);
//                    }
//                    MethodInfo methodInfo=method.getAnnotation(MethodInfo.class);
//                    if (methodInfo.revision()==1){
//                        System.out.println("Method with revision no 1="+method);
//                    }
//                }
//
//            }

            Class<?> clss=Class.forName("main.java.springLearn.annoation.AnnoationExample");
                Method method=clss.getMethod("generiscsTest");
            //System.out.println(method.isAnnotationPresent(MethodInfo.class));
            if(method.isAnnotationPresent(MethodInfo.class)){
                //System.out.println("判断类是annotation");
                MethodInfo annotation1 = method.getAnnotation(MethodInfo.class);
                System.out.println(annotation1.comments());
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }  catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
