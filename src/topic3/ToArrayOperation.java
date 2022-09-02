package topic3;

import java.util.Arrays;
import java.util.List;

/**
 * Построить массив из списка.
 */
public class ToArrayOperation {

    public static void main(String[] args) {
        List<String> strings = List.of("1", "2", "3");

       Object[] objects = strings.stream().toArray();

        Arrays.stream(objects).forEach(System.out::println);
    }
}
