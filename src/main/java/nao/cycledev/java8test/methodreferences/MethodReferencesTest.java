package nao.cycledev.java8test.methodreferences;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Comparator;

public class MethodReferencesTest {

    public static void printFileLines() throws IOException, URISyntaxException {
        Files.lines(Paths.get("/Users/noprysk/Documents/words.txt"))
                .flatMap(w -> Arrays.stream(w.split(" ")))
                .distinct()
                .forEach(System.out::println);

    }
}
