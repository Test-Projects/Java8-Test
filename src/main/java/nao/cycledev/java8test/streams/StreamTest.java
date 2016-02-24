package nao.cycledev.java8test.streams;

import nao.cycledev.java8test.data.MemoryData;
import nao.cycledev.java8test.model.Apple;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest {

    private List<String> stringCollection = Arrays.asList("ddd2", "aaa2", "bbb1", "aaa1", "bbb3", "ccc", "bbb2", "ddd1");

    private static List<Apple> apples = new ArrayList<>();

    static {
        apples.add(new Apple(1, "apple 1", 23));
        apples.add(new Apple(2, "apple 2", 8));
        apples.add(new Apple(3, "apple 3", 40));
        apples.add(new Apple(4, "apple 14", 8));
        apples.add(new Apple(5, "apple 5", 3));
    }

    public void streamSortTest(){

        stringCollection.stream()
                .sorted(String::compareTo)
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
                .sorted(String::compareTo)
                .forEach(System.out::println);

    }

    public void streamCountTest(){

        long count =
                stringCollection.stream()
                .filter(s -> s.startsWith("b"))
                .count();
        System.out.println(count);

    }

    public void streamTest() {
        long start = System.currentTimeMillis();
        List<String> names = apples.stream()
                .filter(a -> a.getWeight() > 5)
                .sorted(Comparator.comparing(Apple::getWeight).thenComparing(Apple::getName))
                .map(Apple::getName)
                .collect(Collectors.toList());

        long finish = System.currentTimeMillis();
        System.out.println("Duration: " + (finish - start));
        names.forEach(System.out::println);
    }

    public void streamDistinctLetter() {
        List<String> letters = MemoryData.words.stream()
                .map(s -> s.split(""))
                .flatMap(Arrays::stream)
                .distinct()
                .collect(Collectors.toList());

        letters.forEach(System.out::println);
    }
}
