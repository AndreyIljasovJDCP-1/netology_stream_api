package topic3;

import java.util.List;

/**
 * Посчитать кол-во чисел удовлетворяющих условию.
 */
public class CountOperation {

    public static void main(String[] args) {
        List<Integer> integers = List.of(10, 20, 1, 2, 3, 16, 27);

        long count = integers.stream()
                .filter(value -> value > 10)
                .count();

        System.out.println(count);
    }
}
