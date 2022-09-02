package topic3;

import java.util.List;
import java.util.Optional;

/**
 * 1. Найти сумму всех чисел;
 * 2. Вывести все числа в одну строку.
 */
public class ReduceOperation {

    public static void main(String[] args) {
        List<Integer> integers = List.of(4, 7, 1);

        Optional<Integer> reduce = integers.stream()
                .reduce((seed, value) -> seed + value);

        /*
             (5, 0)
             (6 ,5)
             (11, 5)
               (16)

         */

        Optional<String> reduce1 = integers.stream()
                .map(String::valueOf)
                .reduce((seed, value) -> seed + ", " + value);

        reduce.ifPresent(System.out::println);

        reduce1.ifPresent(System.out::println);
    }
}
