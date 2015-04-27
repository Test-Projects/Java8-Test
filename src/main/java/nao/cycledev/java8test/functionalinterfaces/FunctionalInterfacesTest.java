package nao.cycledev.java8test.functionalinterfaces;

import java.util.function.Function;

public class FunctionalInterfacesTest {


    public static void test(){

        Function<String, String> func1 = (name) -> "@" + name + "@";
        Function<String, Integer> func2 = (name) -> name.length();
        Function<String, Integer> func3 = String::length;

        System.out.println(func1.apply("Hello World"));
        System.out.println(func2.apply("Hi!!!"));
        System.out.println(func3.apply("The End"));
        
    }



}
