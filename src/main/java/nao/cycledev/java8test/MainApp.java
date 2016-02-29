package nao.cycledev.java8test;

import nao.cycledev.java8test.collectors.CollectorTest;

import java.io.IOException;
import java.net.URISyntaxException;

public class MainApp {

    public static void main(String[] args) throws IOException, URISyntaxException {
        CollectorTest.groupByTest();

        System.out.println(Runtime.getRuntime().availableProcessors());
    }

}
