package topic2;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Отсортировать список чисел (reverseOrder). (От большего к меньшему)
 */
public class SortedOperation {

    public static void main(String[] args) {
        List<Integer> integers = List.of(90, 2, 44, 12, 900, 200);

        List<Integer> collect = integers.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        System.out.println(collect);
    }
}
