import java.util.HashMap;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Collections;

public class Main{
    public static void main(String[] args){
        ArrayList<String> employees = new ArrayList<String>();
        employees.add("John");
        employees.add("Peter");
        employees.add("Mike");
        employees.add("Mercy");
        employees.add("Zac");

        System.out.println(employees);

        //sorting the employees alphabetically

        Collections.sort(employees);

        for (String employee:employees){
            System.out.println(employee);
        }

        HashSet<String> departments = new HashSet<String>();
        departments.add("HR&Admin");
        departments.add("Engineering");
        departments.add("Marketing");
        departments.add("Finance");
        departments.add("Support");

        System.out.println(departments);


        HashMap<Integer, String> wafanyikazi = new HashMap<Integer, String>();
        wafanyikazi.put(1,"John");
        wafanyikazi.put(2,"Peter");
        wafanyikazi.put(3,"Mike");
        wafanyikazi.put(4,"Stacy");
        wafanyikazi.put(5,"Faith");


        System.out.print(wafanyikazi);

        HashMap<Integer,String> salaries = new HashMap<Integer, String>();
        salaries.put(150000,"John");
        salaries.put(72000,"Peter");
        salaries.put(83000,"Mike");
        salaries.put(97990,"Stacy");
        salaries.put(56000,"Faith");

        System.out.println(salaries);

        ArrayList<Integer> employeesAge = new ArrayList<>();

        employeesAge.add(24);
        employeesAge.add(32);
        employeesAge.add(21);
        employeesAge.add(27);
        employeesAge.add(36);

        Collections.sort(employeesAge);

        for(Integer employeeAge: employeesAge){
            System.out.println(employeeAge);
        }


    }

}