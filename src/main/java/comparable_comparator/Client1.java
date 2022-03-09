package comparable_comparator;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Client1 {

    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee(102, "Rajesh Kumar", "rajesh@gmail.com", 19000l),
                new Employee(104, "Vijay Kumar", "vijay@gmail.com", 18000l),
                new Employee(105, "Lokesh Singh", "rajesh@gmail.com", 20000l),
                new Employee(101, "Awadesh Yadav", "rajesh@gmail.com", 28000l),
                new Employee(103, "Ashish Singh", "ashish@gmail.com", 12000l)
        );

       /* List<Employee> employeeList = employees.stream()
                .sorted(Comparator.comparing(Employee::getSalary).reversed()
                        .thenComparing(Employee::getEmpId))
                .collect(Collectors.toList());*/
        List<Employee> employeeList = employees.stream()
                .sorted(Comparator.comparing(Employee::getEmpId).reversed())
                .collect(Collectors.toList());
        employeeList.forEach(System.out::println);
    }
}
