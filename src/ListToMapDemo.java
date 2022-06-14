import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Student {
    int id;
    String name;
    int marks;

    public Student(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }
}

public class ListToMapDemo {
    public static void main(String[] args) {
        List<Student> std = new ArrayList<>();

        std.add(new Student(1, "Ally", 90));
        std.add(new Student(2, "Neon", 89));
        std.add(new Student(3, "Bob", 80));
        std.add(new Student(4, "Harry", 92));
        std.add(new Student(5, "Hazel", 88));

        /*Map<Integer, Integer> stdMap = std.stream()
                .filter(s->s.marks >= 90)
                               .collect(Collectors.toMap(s -> s.id, s -> s.marks));
        System.out.println(stdMap);*/

        List<Integer> stdList = std.stream()
                .filter(s -> s.marks > 85)
                .map(s -> s.marks)
                .sorted()
                .collect(Collectors.toList());

        System.out.println(stdList);
    }
}
