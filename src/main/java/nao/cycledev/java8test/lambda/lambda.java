package nao.cycledev.java8test.lambda;

import java.util.Arrays;

public class lambda {

    private static String[] strs = {"xxxx", "aa", "c", "yyyyy", "wwwwwww"};

    public static void sortArray(){

        Arrays.sort(strs, (s1, s2) -> s1.length() - s2.length());
        Arrays.asList(strs).forEach(System.out::println);

    }

}
