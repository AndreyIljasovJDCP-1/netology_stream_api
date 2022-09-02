package topic2;

import java.util.List;

/**
 * Peek
 */
public class PeekOperation {

    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 2, 3);

        integers.stream()
                .peek(value -> System.out.println("peek"))
                .map(value -> value * 2)
                .forEach(System.out::println);
    }
}
