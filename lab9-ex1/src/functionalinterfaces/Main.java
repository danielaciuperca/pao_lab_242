package functionalinterfaces;

import java.util.*;
import java.util.function.*;

public class Main {
    public static void main(String[] args) {
        Predicate<String> predicate1 = word -> word.length() > 10;

        System.out.println(predicate1.test("hello world"));
        System.out.println(predicate1.test("hello"));
        System.out.println(predicate1.test("hello world!!!"));

        Function<String, Integer> function1 = word -> word.length();

        System.out.println(function1.apply("hello"));

        BiFunction<String, Integer, Integer> function2 = (a, b) -> (a + b).length();

        System.out.println(function2.apply("hello", 7));

        Supplier<Double> supplier1 = () -> new Random().nextDouble();

        System.out.println(supplier1.get());

        Consumer<Double> consumer1 = number -> System.out.println("this is a number: " + number);

        consumer1.accept(100.0);
    }
}
