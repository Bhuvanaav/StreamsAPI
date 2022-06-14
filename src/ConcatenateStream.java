import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConcatenateStream {
    public static void main(String[] args) {

        List<String> emp = Arrays.asList("A","B","C");
        List<String> emp1 = Arrays.asList("D","E","F");

        Stream<String> s1=  emp.stream();
        Stream<String> s2 = emp1.stream();

        List<String> finalList = Stream.concat(s1,s2).collect(Collectors.toList());
        System.out.println(finalList);

        for (String e : finalList){
            System.out.println(e);
        }
    }
}
