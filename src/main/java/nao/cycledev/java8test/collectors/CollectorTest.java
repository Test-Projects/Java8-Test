package nao.cycledev.java8test.collectors;

import nao.cycledev.java8test.data.MemoryData;
import nao.cycledev.java8test.model.Dish;

import java.util.IntSummaryStatistics;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CollectorTest {

    public static void intSamaryStatistictsTest() {

        IntSummaryStatistics stats = MemoryData.menu.stream().collect(Collectors.summarizingInt(Dish::getCalories));
        System.out.println("Min: " + stats.getMin());
        System.out.println("Max: " + stats.getMax());
        System.out.println("Avg: " + stats.getAverage());
        System.out.println("Sum: " + stats.getSum());
        System.out.println("Count: " + stats.getCount());
    }

    public static void groupByTest() {
        MemoryData.menu.stream()
                .collect(Collectors.groupingBy(Dish::getType, Collectors.summingInt(Dish::getCalories)))
                .forEach((t, l) -> System.out.println(t + ": " + l));
    }

}
