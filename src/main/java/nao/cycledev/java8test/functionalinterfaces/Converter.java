package nao.cycledev.java8test.functionalinterfaces;

@FunctionalInterface
public interface Converter<F, T> {

    T convert(F from);

}
