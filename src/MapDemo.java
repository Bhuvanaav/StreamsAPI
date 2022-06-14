import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2,4,3,5);
        List<Integer> numberList = new ArrayList<>();

        /*for (int num : numbers) {
            numberList.add(num*3);
        }
        System.out.println(numberList);*/

        /*numberList = numbers.stream().map(num->num*3).collect(Collectors.toList());
        System.out.println(numberList);*/

        numbers.stream().map(num->num*3).forEach(System.out::println);
    }
}
