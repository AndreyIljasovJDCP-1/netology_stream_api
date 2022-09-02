package topic2;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Извлечь все города из стран.
 */
public class FlatMapOperation {

    public static void main(String[] args) {
        List<Country> countries = List.of(
                new Country("Россия", List.of("Москва", "Владивосток", "Тверь", "Казань")),
                new Country("Испания", List.of("Мадрид", "Барселона", "Валенсия", "Севилья")),
                new Country("Германия", List.of("Мюнхен", "Дрезден", "Берлин", "Кельн")),
                new Country("Италия", List.of("Милан", "Рим", "Неаполь", "Турин"))
        );

        List<String> collect = countries.stream()
                .flatMap(country -> country.getCities().stream())
                .collect(Collectors.toList());


        System.out.println(collect);
    }
}


class Country {

    private final String name;
    private final List<String> cities;

    public Country(String name, List<String> cities) {
        this.name = name;
        this.cities = cities;
    }

    public String getName() {
        return name;
    }

    public List<String> getCities() {
        return cities;
    }
}