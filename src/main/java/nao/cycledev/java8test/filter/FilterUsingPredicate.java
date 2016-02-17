package nao.cycledev.java8test.filter;

import nao.cycledev.java8test.model.Apple;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class FilterUsingPredicate {

    private static List<Apple> apples = new ArrayList<>();

    static {
        apples.add(new Apple(1, "apple 1", 23, "red"));
        apples.add(new Apple(2, "apple 2", 13, "yellow"));
        apples.add(new Apple(3, "apple 3", 40, "green"));
        apples.add(new Apple(4, "apple 4", 8, "red"));
        apples.add(new Apple(5, "apple 5", 11, "green"));
    }

    public static void filterGreenApples() {
        apples.stream().filter(a -> "green".equals(a.getColor())).forEach(System.out::println);
    }

    private static void filterGreenApplesUsingPredicate(List<Apple> apples, Predicate<Apple> applePredicate) {
        apples.stream().filter(a -> applePredicate.test(a)).forEach(System.out::println);
    }

    public static void filterGreenApplesUsingPredicateTest(){
        filterGreenApplesUsingPredicate(apples, Apple::isAppleGreen);
    }

    public static void filterGreenApplesUsingLambdaTest() {
        filterGreenApplesUsingPredicate(apples, (Apple a) -> "green".equals(a.getColor()));
    }

}
