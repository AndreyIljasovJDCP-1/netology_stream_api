package topic3;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Собрать Map:
 * 1. Ключом JobTitle;
 * 2. Значением является объект Employee.
 */
public class CollectOperation {

    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee("Max", 50000, JobTitle.DEVELOPER),
                new Employee("Irina", 30000, JobTitle.ADMINISTRATOR),
                new Employee("Sam", 45000, JobTitle.DEVELOPER),
                new Employee("Andrey", 80000, JobTitle.MANAGER),
                new Employee("Alena", 20000, JobTitle.ADMINISTRATOR)
        );

        Map<JobTitle, List<Employee>> collect = employees.stream()
                .collect(Collectors.groupingBy(Employee::getTitle, Collectors.toList()));

        Map<JobTitle, Long> collect1 = employees.stream()
                .collect(Collectors.groupingBy(Employee::getTitle, Collectors.counting()));

        System.out.println("Общее количество работников: " + employees.size());
        System.out.println("Количество работников на каждой позиции: " + collect1);

        List<Employee> managers = collect.get(JobTitle.MANAGER);
        List<Employee> developers = collect.get(JobTitle.DEVELOPER);
        List<Employee> administrators = collect.get(JobTitle.ADMINISTRATOR);

        System.out.println("Managers: " + managers);
        System.out.println("Developers: " + developers);
        System.out.println("Administrators: " + administrators);
    }
}

enum JobTitle {
    DEVELOPER, MANAGER, ADMINISTRATOR
}

class Employee {
    private String name;
    private int salary;
    private JobTitle title;

    public Employee(String name, int salary, JobTitle title) {
        this.name = name;
        this.salary = salary;
        this.title = title;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public JobTitle getTitle() {
        return title;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setTitle(JobTitle title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", title=" + title +
                '}';
    }
}
