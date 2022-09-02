package topic3;

import java.util.List;
import java.util.Optional;

/**
 * Найти минимальное и максимальное число из списка.
 */
public class MinAndMaxOperation {

    public static void main(String[] args) {
        List<Integer> integers = List.of(4, 6, 10, 2, 1, 25, 0, -1, 50);

        Optional<Integer> max = integers.stream()
                .max(Integer::compareTo);

        max.ifPresent(value -> System.out.println("Найдено максимальное число: " + value));

        Optional<Integer> min = integers.stream()
                .min(Integer::compareTo);

        min.ifPresent(value -> System.out.println("Найдено минимальное число: " + value));
    }
}
