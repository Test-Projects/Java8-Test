package nao.cycledev.java8test.streams;

import java.util.Arrays;
import java.util.List;

public class StreamTest {

    private List<String> stringCollection = Arrays.asList("ddd2", "aaa2", "bbb1", "aaa1", "bbb3", "ccc", "bbb2", "ddd1");

    public void streamSortTest(){

        stringCollection.stream()
                .sorted((s1, s2) -> s1.compareTo(s2))
                .forEach(System.out::println);

    }

    public void streamFilterTest(){

        stringCollection.stream()
                .filter(s -> s.startsWith("a"))
                .sorted()
                .forEach(System.out::println);

    }

    public void streamMapTest(){

         stringCollection.stream()
                .map(String::toUpperCase)
                .sorted((s1, s2) -> s2.compareTo(s1))
                .forEach(System.out::println);

    }

    public void streamCountTest(){

        long count =
                stringCollection.stream()
                .filter(s -> s.startsWith("b"))
                .count();
        System.out.println(count);

    }
}
