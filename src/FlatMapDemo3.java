import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Employee {
    int id;
    String name;
    char grade;

    public Employee(int id, String name, char grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }
}
public class FlatMapDemo3 {
    public static void main(String[] args) {

        List<Employee> list1 = new ArrayList<Employee>();
        list1.add(new Employee(101, "Ally", 'A'));
        list1.add(new Employee(102, "George", 'C'));
        list1.add(new Employee(103, "Hazle", 'B'));

        List<Employee> list2 = new ArrayList<Employee>();
        list2.add(new Employee(104, "Berry", 'C'));
        list2.add(new Employee(105, "Susan", 'A'));
        list2.add(new Employee(106, "Rick", 'C'));

        List<Employee> list3 = new ArrayList<Employee>();
        list3.add(new Employee(107, "Harry", 'B'));
        list3.add(new Employee(108, "Bob", 'A'));
        list3.add(new Employee(109, "Zee", 'C'));

        List<List<Employee>> employeeGroup = new ArrayList<List<Employee>>();
        employeeGroup.add(list1);
        employeeGroup.add(list2);
        employeeGroup.add(list3);

        /*for (List<Employee> group : employeeGroup) {
            for (Employee lists : group) {
                if (lists.grade == 'A') {
                    System.out.println(lists.name);
                }
            }
        }*/
        List<String> allEmployees = employeeGroup.stream()
                .flatMap(elist -> elist.stream())
                .filter(s->s.grade=='A')
                .map(s -> s.name)
                .collect(Collectors.toList());
        System.out.println(allEmployees);
    }
}
