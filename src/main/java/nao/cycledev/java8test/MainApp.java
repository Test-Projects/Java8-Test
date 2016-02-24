package nao.cycledev.java8test;

import nao.cycledev.java8test.streams.StreamTest;

import java.io.IOException;
import java.net.URISyntaxException;

public class MainApp {

    public static void main(String[] args) throws IOException, URISyntaxException {
        StreamTest streamTest = new StreamTest();
        streamTest.streamDistinctLetter();
    }

}
