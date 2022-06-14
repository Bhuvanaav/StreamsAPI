import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsDemo {
    public static void main(String[] args) {

        List<String> languages = Arrays.asList("Java", "Python", "C", "C++", "Python", "C", "Ruby");
        //count
        long count = languages.stream().distinct().count();
        System.out.println(count);
    //distinct
        languages.stream().distinct().forEach(l -> System.out.println(l));
    //Limit
        List<String> lan = languages.stream().limit(3).collect(Collectors.toList());
        System.out.println("Limited list is " + lan);
    }
}
