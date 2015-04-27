package nao.cycledev.java8test;

import nao.cycledev.java8test.functionalinterfaces.FunctionalInterfacesTest;
import nao.cycledev.java8test.methodreferences.MethodReferencesTest;

import java.io.IOException;
import java.net.URISyntaxException;

public class MainApp {

    public static void main(String[] args) throws IOException, URISyntaxException {

        FunctionalInterfacesTest.test();


    }
}
