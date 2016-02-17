package nao.cycledev.java8test.sort;

import nao.cycledev.java8test.model.Apple;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortTest {

    private static List<Apple> apples = new ArrayList<>();

    static {
        apples.add(new Apple(1, "apple 1", 23));
        apples.add(new Apple(2, "apple 2", 13));
        apples.add(new Apple(3, "apple 3", 40));
        apples.add(new Apple(4, "apple 4", 8));
        apples.add(new Apple(5, "apple 5", 11));
    }

    public static void sortApplesByWeight() {
        apples.sort(Comparator.comparing(Apple::getWeight));
        apples.forEach(a -> System.out.println(a));
    }
}
