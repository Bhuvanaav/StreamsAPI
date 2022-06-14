import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceDemo {
    public static void main(String[] args) {
        List<String> objlist = Arrays.asList("A","B","C","1","2","3");

       Optional<String> reduced = objlist.stream().reduce((value, combinedValue)->{return combinedValue+value;});
        System.out.println(reduced.get());

        Object arr[] = objlist.stream().toArray();
        System.out.println(arr.length);
    }
}
