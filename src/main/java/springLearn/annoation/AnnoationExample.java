package main.java.springLearn.annoation;

import java.util.ArrayList;
import java.util.List;

public class AnnoationExample {
    public static void main(String[] args) {

    }

    @Override
    @MethodInfo(author = "Pankj" ,comments = "Main method",date = " 2017 11 07",revision = 2)
    public String toString() {
        return "Overriden toString method";
    }

    @Deprecated
    @MethodInfo(comments = "deprecate method",date = " 2017 11 07")
    public static void oldMethod(){
        System.out.println("old method don't use it");
    }

    @MethodInfo(author = "Pankj" ,comments = "Main method",date = " 2017 11 07",revision = 10)
    public static void generiscsTest(){
        List list=new ArrayList();
        list.add("abc");
        oldMethod();
    }
}
