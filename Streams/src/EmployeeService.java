import java.util.*;
import java.util.stream.*;

public class EmployeeService{
    //return all active employees
    public List <Employee> getActiveEmployees(List<Employee> employees){
        return  employees.stream()
                .filter(employee -> employee.isActive())
                .collect(Collectors.toList());
    }

    // return all employees in a department
    public List<Employee> getByDepartment(List<Employee> employees, String department) {
        return employees.stream()
                .filter(employee -> employee.getDepartment().equals(department))
                .collect(Collectors.toList());

    }

    //Get just the names of all employees as a List<String>
    public List<String> getAllNames(List<Employee> employees) {
        return employees.stream()
                .map(employee -> employee.getName())
                .collect(Collectors.toList());
    }

    // Find the employee with the highest salary
    public Optional<Employee> getHighestPaid(List<Employee> employees) {
        return employees.stream()
                .max(Comparator.comparingDouble(Employee::getSalary));
        //returns Optional<Employee> directly — no collect needed

    }

    // Group employees by department
    // Returns Map<departmentName, List<employees in that department>>
    public Map<String, List<Employee>> groupByDepartment(List<Employee> employees) {
        return employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));
    }

    // get total salary bill (sum of all salaries)
    public double getTotalSalary(List<Employee> employees) {
        return employees.stream()
                .mapToDouble(Employee::getSalary).sum();

    }

    //  Sort employees by salary descending (highest first)
    public List<Employee> sortBySalaryDesc(List<Employee> employees) {
        return employees.stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                .collect(Collectors.toList());

    }

    // sort by age ascending
    public List<Employee> sortByAgeAsc(List<Employee> employees) {
        return employees.stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary))
                .collect(Collectors.toList());
    }

    // Count employees per department

    public Map<String, Long> countByDepartment(List<Employee> employees) {
        return employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.counting()
                ));
    }

    // Find employee by ID — return Optional
    public Optional<Employee> findById(List<Employee> employees, String id) {
        return employees.stream()
                .filter(employee -> employee.getId().equals(id))
                .findFirst();
    }
}