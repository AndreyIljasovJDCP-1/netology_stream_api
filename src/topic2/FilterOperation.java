package topic2;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Извлечь все числа из списка, значение которых больше 20.
 */
public class FilterOperation {

    public static void main(String[] args) {
        List<Integer> integers = List.of(14, 20, 34, 66, 10, 6, 21);

        List<Integer> collect = integers.stream()
                .filter(value -> value > 20)
                .collect(Collectors.toList());

        System.out.println(collect);

    }
}
