import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortedMethod {
    public static void main(String[] args) {

        List<Integer> num = Arrays.asList(2,4,7,3,1,0,5);

        List<Integer> sortedList = num.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedList);

        List<Integer> reverseSortedList = num.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(reverseSortedList);

        List<String> name = Arrays.asList("Harry","John","Zee","Ally","Bob");

        List<String> sortedNameList = name.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedNameList);

        List<String> reverseSortedNameList = name.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(reverseSortedNameList);
    }

}
