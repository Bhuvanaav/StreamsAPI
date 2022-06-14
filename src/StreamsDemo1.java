import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamsDemo1 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,7,8,9,10);

        long  EvenNumbers = numbers.stream().filter(n->n%2==0).count();
        System.out.println(EvenNumbers);

        Optional <Integer> min = numbers.stream().min((val1, val2)-> {return val1.compareTo(val2);});
        System.out.println(min.get());

        Optional<Integer> max = numbers.stream().max((val1,val2)->{return val1.compareTo(val2);});
        System.out.println(max.get());



    }
}
