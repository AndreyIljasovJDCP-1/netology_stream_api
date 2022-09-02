package topic1.three;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDontChangeSource {

    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>(List.of(1, 2, 3, 4, 5));

        List<Integer> collect = integers
                .stream()
                .map(value -> value + 2)
                .collect(Collectors.toList());

        System.out.println(integers);
        System.out.println(collect);
    }
}
