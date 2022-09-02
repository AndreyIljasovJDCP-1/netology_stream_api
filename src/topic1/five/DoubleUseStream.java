package topic1.five;

import java.util.stream.Stream;

public class DoubleUseStream {

    public static void main(String[] args) {
        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5, 6).map(i -> 2);

        integerStream.forEach(System.out::println);

        integerStream.limit(5).forEach(System.out::println);
    }
}
