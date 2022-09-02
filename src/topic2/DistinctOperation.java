package topic2;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Убрать из списка все дубликаты.
 */
public class DistinctOperation {

    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 1, 2, 2, 3, 3, 4, 4, 5, 5);

        List<Integer> collect = integers.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println(collect);
    }
}
