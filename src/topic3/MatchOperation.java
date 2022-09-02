package topic3;

import java.util.List;

/**
 * Проверить элементы на заданное вхождение.
 */
public class MatchOperation {

    public static void main(String[] args) {
        List<String> strings = List.of("стр1", "строка2", "строчечка3", "строкулечка4");

        boolean b = strings.stream()
                .anyMatch(string -> string.length() > 4);

        boolean b1 = strings.stream()
                .allMatch(string -> string.length() > 4);

        boolean b2 = strings.stream()
                .noneMatch(String::isBlank);

        System.out.println("В списке strings, хотя бы у одного элемента - длина строки больше 4: " + b);
        System.out.println("В списке strings у всех элементов списка - длина строки больше 4: " + b1);
        System.out.println("В списке strings нет пустых строк: " + b2);


    }
}
