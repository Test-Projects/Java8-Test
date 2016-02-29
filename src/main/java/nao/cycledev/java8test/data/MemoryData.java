package nao.cycledev.java8test.data;

import nao.cycledev.java8test.model.Dish;
import nao.cycledev.java8test.model.Trader;
import nao.cycledev.java8test.model.Transaction;

import java.util.Arrays;
import java.util.List;

public class MemoryData {

    public static final List<Dish> menu = Arrays.asList(
            new Dish("pork", false, 800, Dish.Type.MEAT),
            new Dish("beef", false, 700, Dish.Type.MEAT),
            new Dish("chicken", false, 400, Dish.Type.MEAT),
            new Dish("french fries", true, 530, Dish.Type.OTHER),
            new Dish("rice", true, 350, Dish.Type.OTHER),
            new Dish("season fruit", true, 120, Dish.Type.OTHER),
            new Dish("pizza", true, 550, Dish.Type.OTHER),
            new Dish("prawns", false, 300, Dish.Type.FISH),
            new Dish("salmon", false, 450, Dish.Type.FISH) );

    public static final List<String> words = Arrays.asList("hello", "world");

    private static Trader raoul = new Trader("Raoul", "Cambridge");
    private static Trader mario = new Trader("Mario","Milan");
    private static Trader alan = new Trader("Alan","Cambridge");
    private static Trader brian = new Trader("Brian","Cambridge");

    public static List<Transaction> transactions = Arrays.asList(
            new Transaction(brian, 2011, 300),
            new Transaction(raoul, 2012, 1000),
            new Transaction(raoul, 2011, 400),
            new Transaction(mario, 2012, 710),
            new Transaction(mario, 2012, 700),
            new Transaction(alan, 2012, 950)
    );

    public static final List<Integer> intList = Arrays.asList(25, 8, 15, 9, 10, 3, 5);

}
