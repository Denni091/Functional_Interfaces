import java.util.function.*;

public class WorkWithFunctionalInterfaces {

    public static void main(String[] args) {

//      Predicate
        Predicate<Double> predicate = (predicateDouble) -> (predicateDouble > 15000.0);
        System.out.println(predicate.test(16000.0));

        Consumer<String> consumer = (consumerString) -> {
            char[] someString = consumerString.toCharArray();
            for (char temp : someString) {
                System.out.println(temp);
            }
        };
        consumer.accept("Text");

//      Function
        Function<Integer, String> function = (functionInt) -> {

            if (functionInt <= 10) {
                System.out.println(functionInt.toString(functionInt).concat(" -> eight"));
            } else
                System.out.println("Unknown");
            return String.valueOf(functionInt);
        };
        function.apply(8);

//      Supplier
        Supplier<Double> supplier = () -> Math.random();
        System.out.println(supplier.get());

//      BiFunction
        BiFunction<Double, Integer, String> biFunction = (firstValue, secondValue) -> {
            if (firstValue - secondValue < 1) {
                System.out.println("Remainder less than 1");
            } else
                System.out.println("Value more than 1");
            return String.valueOf(firstValue - secondValue);
        };
        biFunction.apply(0.9, 1);

//      My Function
        Calculate<Integer, Integer, Double, Double, String> calculate =
                (firstValue, secondValue, thirdValue, fourthValue) ->
                        String.valueOf(firstValue + secondValue + thirdValue - fourthValue);
        String calc = calculate.calculateValue(12, 25, 11.2, 17.9);
        System.out.println("Calculate value: " + calc);

//      Double Function
        DoubleFunction<Integer> doubleFunction = doubleFunctionInt -> (int) (doubleFunctionInt * 2);
        System.out.println(doubleFunction.apply(5));
    }
}
