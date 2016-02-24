package nao.cycledev.java8test.streams;

import nao.cycledev.java8test.data.MemoryData;
import nao.cycledev.java8test.model.Trader;
import nao.cycledev.java8test.model.Transaction;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.joining;

public class TransactionTest {

    public static void task1() {

        List<Transaction> trans = MemoryData.transactions.stream()
                .filter(t -> t.getYear() == 2011)
                .sorted(Comparator.comparing(Transaction::getValue))
                .collect(Collectors.toList());

        trans.forEach(System.out::println);
    }

    public static void task2() {

        MemoryData.transactions.stream()
                .map(t -> t.getTrader().getCity())
                .distinct()
                .forEach(System.out::println);
    }

    public static void task3() {

        MemoryData.transactions.stream()
                .filter(t -> t.getTrader().getCity() == "Cambridge")
                .map(t -> t.getTrader())
                .distinct()
                .sorted(Comparator.comparing(Trader::getName))
                .forEach(System.out::println);
    }

    public static void task4() {

        String str = MemoryData.transactions.stream()
                .map(t -> t.getTrader().getName())
                .distinct()
                .sorted()
                .collect(joining(" "));

        System.out.println(str);
    }

    public static void task5() {

        Boolean trader = MemoryData.transactions.stream()
                .map(t -> t.getTrader())
                .anyMatch(t -> t.getCity().equals("Milan"));
        System.out.println(trader);
    }

    public static void task6() {

        MemoryData.transactions.stream()
                .filter(t -> t.getTrader().getCity() == "Cambridge")
                .map(t -> t.getValue())
                .forEach(System.out::println);
    }

    public static void task7() {

        MemoryData.transactions.stream()
                .map(t -> t.getValue())
                .reduce(Integer::max)
                .ifPresent(System.out::println);
    }

    public static void task8() {

        MemoryData.transactions.stream()
                .map(t -> t.getValue())
                .reduce(Integer::min)
                .ifPresent(System.out::println);
    }

}
