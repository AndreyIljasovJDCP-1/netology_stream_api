package topic2;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Извлечь первые 5 значений из списка.
 */
public class LimitOperation {

    public static void main(String[] args) {
        List<String> strings = List.of(
                "один", "два", "три",
                "четыре", "пять", "шесть",
                "семь", "восемь", "девять", "десять");

        List<String> collect = strings.stream()
                .limit(5)
                .collect(Collectors.toList());

        System.out.println(collect);
    }
}
