import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class Program1 {
    public static void main(String[] args) {
        List<String> vehicles = Arrays.asList("Bus", "Car", "Cycle", "Van", "Truck");

        // To upper case
        /*List<String> vehiclesInCapital = new ArrayList<>();
        for(String names : vehicles) {
            vehiclesInCapital.add(names.toUpperCase(Locale.ROOT));
        }
        System.out.println(vehiclesInCapital);*/

        List<String> vehiclesInCapital = vehicles.stream()
                .map(name -> name.toUpperCase(Locale.ROOT))
                .collect(Collectors.toList());
        System.out.println(vehiclesInCapital);

        // Length of the each String

        /*for (String names : vehicles) {
            System.out.println(names.length());
        }*/

        vehicles.stream()
                .map(names -> names.length())
                .forEach(System.out::println);

    }
}
