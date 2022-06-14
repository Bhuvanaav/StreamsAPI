import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapDemo2 {
    public static void main(String[] args) {

        List<String> teamA = Arrays.asList("Virat","Rohit","Dhoni");
        List<String> teamB = Arrays.asList("Ishan","Rishab","Shreyas");
        List<String> teamC = Arrays.asList("Sachin","Dravid","Ganguly");

        List<List<String>> playersAsAWhole = new ArrayList<List<String>>();

        playersAsAWhole.add(teamA);
        playersAsAWhole.add(teamB);
        playersAsAWhole.add(teamC);

        /*for(List<String> groups : playersAsAWhole) {
            for (String names : groups) {
                System.out.println(names);
            }
        }*/

        List<String> allPlayers = playersAsAWhole.stream()
                .flatMap(x->x.stream())
                .collect(Collectors.toList());

        System.out.println(allPlayers);
    }
}
