package nao.cycledev.java8test;

import nao.cycledev.java8test.sort.SortTest;

import java.io.IOException;
import java.net.URISyntaxException;

public class MainApp {

    public static void main(String[] args) throws IOException, URISyntaxException {
        SortTest.sortApplesByWeight();
    }

}
