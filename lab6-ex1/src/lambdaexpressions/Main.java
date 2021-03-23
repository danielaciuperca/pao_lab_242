package lambdaexpressions;

public class Main {
    public static void main(String[] args) {
        //2nd way to obtain an instance of an interface - lambda expressions
        // lambda expressions can be created only based on functional interfaces
        // (interfaces with only one abstract method)

//        Function sumFunction = (int a, int b) -> {
//            return a + b;
//        };
//        System.out.println(sumFunction.apply(10, 20));
//
//        Function multiplyFunction = (x, y) -> x* y;
//        System.out.println(multiplyFunction.apply(10, 20));

        test((a, b) -> a + b);
        test((a, b) -> a * b);
    }

    public static void test(Function f) {
        System.out.println(f.apply(10, 20));
    }
}
