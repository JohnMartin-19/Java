import java.util.*;

public class Main{
    public static void main(String[] args){
        List<Employee> employees = List.of(
                new Employee("E001", "John Mburu",    "Engineering", 95000, 28, true),
                new Employee("E002", "Jane Achieng",  "Engineering", 88000, 32, true),
                new Employee("E003", "Mike Odhiambo", "HR",          55000, 25, true),
                new Employee("E004", "Alice Wanjiru", "HR",          60000, 29, false),
                new Employee("E005", "Bob Kamau",     "Finance",     72000, 35, true),
                new Employee("E006", "Rose Mwangi",   "Finance",     68000, 31, false),
                new Employee("E007", "Peter Njoroge", "Engineering", 91000, 27, true),
                new Employee("E008", "Linet Chebet",  "HR",          58000, 24, true)
        );

        EmployeeService service = new EmployeeService();

        System.out.println("ACTIVE EMPLOYEES.....");
        service.getActiveEmployees(employees).forEach(System.out::println);

        System.out.println("ENGINEERING DEPT.....");
        service.getByDepartment(employees, "ENGINEERING").forEach(System.out::println);

        System.out.println("ALL NAMES.....");
        System.out.println(service.getAllNames(employees));

        System.out.println("HIGHEST PAID.....");
        service.getHighestPaid(employees)
                .ifPresent(e -> System.out.println(e.getName() + " - Ksh" + e.getSalary()));

        System.out.println("Grouped by Department.....");
        service.groupByDepartment(employees)
                .forEach((dept, emps) -> {
                    System.out.println(dept + ":");
                    emps.forEach(e -> System.out.println("  " + e.getName()));
                });
        System.out.println(" Total Salary Bill.....");
        System.out.println(service.getTotalSalary(employees));

        System.out.println(" Sorted By Salary (High to Low) ......");
        service.sortBySalaryDesc(employees).forEach(e ->
                System.out.println(e.getName()  + " - Ksh" + e.getSalary() ));

        System.out.println(" Count Per Department.....");
        service.countByDepartment(employees)
                .forEach((dept, count) -> System.out.println(dept + ": " + count));

        System.out.println(" Find Employee E005 ... ");
        service.findById(employees, "E005").ifPresent(System.out::println);
    }
}