
import java.util.*;

public class StreamsMethods {
    public static void main(String[] args) {

        Set<String> fruits = new HashSet<String>();

        fruits.add("One Apple");
        fruits.add("One Mango");
        fruits.add("More grapes");
        fruits.add("One Banana");

        //AnyMatch()
        boolean result = fruits.stream().anyMatch(value->{return value.startsWith("One");});
        System.out.println(result);

        //AllMatch()
        boolean result1 = fruits.stream().allMatch(value->{return value.startsWith("One");});
        System.out.println(result1);

        //NoneMatch()
        boolean result2 = fruits.stream().noneMatch(Value-> {return Value.startsWith("One");});
        System.out.println(result2);

        List<String> name = Arrays.asList("Ally","Bob","George");

        //FindAny()
        Optional<String> anyName = name.stream().findAny();
        System.out.println(anyName.get());

        //FindFirst()
        Optional<String> firstName = name.stream().findFirst();
        System.out.println(firstName.get());
    }
}
