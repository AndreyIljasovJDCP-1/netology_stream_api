package topic1.two;

import java.util.Arrays;
import java.util.Random;
import java.util.function.IntSupplier;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * 1. Генерация массива [int], с размером 10, рандомных значений в диапазоне от 0 до 100;
 * 2. Генерация массива [double] с размером 10, с правилом генераци: каждое следующее число увеличивается на 2;
 * 3. Генерация первых 10 чисел Фибоначчи.
 */
public class PrimitiveStream {

    public static void main(String[] args) {
        Random random = new Random();
        IntSupplier supplierRandom = () -> random.nextInt(100);
        IntStream.generate(supplierRandom)
                .limit(10)
                .forEach(System.out::println);
        System.out.println("-----------------------------------------");

        DoubleStream.iterate(2.0, operand -> operand + 4.0D)
                .limit(10)
                .boxed()
                .forEach(System.out::println);
        System.out.println("--------------------------------------------");

        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        IntStream.range(0, 11).forEach(i -> System.out.print(arr[i] + ", "));
        System.out.println();
        Arrays.stream(arr).forEach(arri -> System.out.print(arri + ", "));

        // Числа Фибоначчи(первые 10): 0, 1, 1, 2, 3, 5, 8, 13, 21, 34.
        System.out.println("\n----------- Числа Фибоначчи -----------");
        String fibonachhi = Stream.iterate(
                        new int[]{0, 1},
                        seed -> new int[]{seed[1], seed[0] + seed[1]}
                )
                .limit(10)
                .map(value -> value[0])
                .map(String::valueOf)
                .collect(Collectors.joining(", "));

        System.out.println(fibonachhi);


    }
    /*  Итерации при генерировании чисел Фибоначчи:
        [0, 1]
        [1, 1]
        [1, 2]
        [2, 3]
        [3, 5]
        [5, 8]
        [8, 13]
        ...
     */
}
