import java.util.*;
import java.util.stream.Collectors;


public class Lists {
    public static void main (String[] args) {
        //коллекция с одним элементов
        Collection<String> elements = Collections.singletonList("Hi");
        Set<String> uniqElements = new HashSet<>(elements);

        //копируем из одной коллекции в другую
        Collection<String> elements2 = new ArrayList<>();
        elements2.add("1");
        elements2.add("2");
        elements2.add("3");
        Collection<String> copied = elements2.stream().collect(Collectors.toList());

        //сортируем в порядке убывания 1
        Collection<Integer> digits = List.of(1, 5, -33, 0);
        Collection<Integer> sortedDigits = digits.stream()
                .sorted((e, u) -> u - e)
                .collect(Collectors.toList());
        System.out.println(sortedDigits);

        //сортируем в порядке убывания 2
        digits = List.of(2, 7, -1, -5);
        sortedDigits = digits.stream()
                .sorted(Comparator.reverseOrder())
                        .collect(Collectors.toList());
        System.out.println(sortedDigits);
    }
}
