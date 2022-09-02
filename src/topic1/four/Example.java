package topic1.four;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Отфильтровать из массива значения больше 90, полученные значения увеличить на 10.
 * Вывести на экран результирующий лист.
 */
public class Example {

    public static void main(String[] args) {

    }

    private void withOutStream() {
        int[] input = {50, 60, 70, 80, 90, 100};
        List<Integer> result = new ArrayList<>();
        int count = 0;
        for (int x : input) {
            if (x >= 90) {
                continue;
            }
            x += 10;
            count++;
            if (count > 3) {
                break;
            }
            result.add(x);
        }
        System.out.println(result);
    }

    private void withStream() {
        int[] input = {50, 60, 70, 80, 90, 100};
        List<Integer> result = Arrays.stream(input)
                .filter(x -> x < 90)
                .map(x -> x + 10)
                .limit(3)
                .boxed()
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
