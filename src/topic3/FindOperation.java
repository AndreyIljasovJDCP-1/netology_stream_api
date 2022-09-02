package topic3;

import java.util.List;
import java.util.Optional;

/**
 * Найти элемент удовлетворяющий условию.
 */
public class FindOperation {

    public static void main(String[] args) {
        List<Integer> integers = List.of(2, 7, 2, 6, 7, 8);

        Optional<Integer> resultValue = integers.stream()
                .peek(System.out::println)
                .filter(value -> value == 7)
                .findFirst();


        Integer resultValueAsInt = resultValue
                .orElseThrow(() -> new RuntimeException("В данном Optional нет занчения"));

        System.out.println("Результат поиска: " + resultValueAsInt);
    }
}
