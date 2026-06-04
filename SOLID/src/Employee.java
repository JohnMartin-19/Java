
//USING THIS TO LEARN SINGLE RESPONSIBILITY IN THE SOLID PRINCIPLES

//Real world connection: Look at your Linka Africa backend. We have Campaign,
// CampaignRepository, CampaignService — all separate. That's SRP in production.
// The Django views don't also write SQL — the ORM does that. Same concept.

// Responsibility 1: Employee data only
public class Employee {
    private String name;
    private String department;
    private double salary;

    public Employee(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String getName() { return name; }
    public String getDepartment() { return department; }
    public double getSalary() { return salary; }
}

// Responsibility 2:Repo handles all the Database operations
public class EmployeeRepository {
    public void save(Employee employee) {
        System.out.println("Saving " + employee.getName() + " to DB...");
        // SQL logic here
    }

    public Employee findById(int id) {
        // SQL select logic
        return null;
    }
}

// Responsibility 3: Report generation
public class PayslipGenerator {
    public String generate(Employee employee) {
        return "===== PAYSLIP =====\n" +
                "Name:       " + employee.getName() + "\n" +
                "Department: " + employee.getDepartment() + "\n" +
                "Salary:     KES " + employee.getSalary();
    }
}