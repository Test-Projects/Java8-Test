package nao.cycledev.java8test.methodreferences;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class MethodReferencesTest {

    public static void printFileLines() throws IOException, URISyntaxException {
        Files.lines(Paths.get("/Users/noprysk/Documents/task2.txt"))
                .map(String::trim)
                .forEach(System.out::println);
    }
}
