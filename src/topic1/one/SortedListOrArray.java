package topic1.one;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Отсортируйте список по возрастанию. В отсортированном списке должны быть исключительно уникальные четные числа типа Long.
 * Вывести в консоль - только уникальные значения.
 */
public class SortedListOrArray {

    public static void main(String[] args) {
        System.out.println("Сортировка списка без Stream API:");
        ArrayList<Integer> integers = new ArrayList<>(List.of(12, 45, -36, 8, 10, 9, 11, 11));
        showSortedListWithOutStream(integers);
        System.out.println("--------------------------------");

        System.out.println("Сортировка списка с помощью Stream API:");
        ArrayList<Integer> integers2 = new ArrayList<>(List.of(12, 45, -36, 8, 10, 9, 11, 11));

        integers2.stream()
                .filter(integer -> integer % 2 == 0)
                .map(Integer::longValue)
                .sorted()
                .distinct()
                .forEach(System.out::println);


        System.out.println("--------------------------------");

        System.out.println("Сортировка массива с помощью Stream API:");


        Arrays.stream(new int[]{12, 45, -36, 8, 10, 9, 11, 11})
                .filter(integer -> integer % 2 == 0)
                .mapToObj(Long::new)
                .sorted()
                .distinct()
                .forEach(System.out::println);
    }

    private static void showSortedListWithOutStream(List<Integer> currentList) {
        currentList.sort(Comparator.naturalOrder());
        currentList.removeIf(integer -> integer % 2 != 0);

        ArrayList<Long> listLongs = new ArrayList<>();

        for (Integer currentInt : currentList) {
            if (!listLongs.contains(currentInt.longValue())) {
                listLongs.add(currentInt.longValue());
            }
        }

        for (Long currentLong : listLongs) {
            System.out.println(currentLong);
        }
    }
}
