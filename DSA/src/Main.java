import java.util.*;
import java.util.HashMap;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.TreeSet;
import java.util.LinkedList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.TreeMap;

public class Main{
    public static void main(String[] args){
        //an array list
        ArrayList<String> myCars = new ArrayList<String>();

        myCars.add("Discovery");
        myCars.add("Audi RS6");
        myCars.add("V8 Sahara");
        myCars.add("LC 90 Series");

        System.out.println(myCars);

        //Linked List - has these methods( addFirst, getFirst, addLast, getLast) etc

        LinkedList<String> carSoko = new LinkedList<>();
        carSoko.addFirst("Toyota");
        carSoko.add("Volvo");
        carSoko.addFirst("Benz");
        carSoko.addLast("Yaris");

        System.out.println("Linked list:" + carSoko);


        // for a HashSet -  its takes NO DUPLICATE DATA
        HashSet<String> myWhips = new HashSet<String>();

        myWhips.add("Volvo xc90");
        myWhips.add("Subaru");
        myWhips.add("Mazda Atenza");
        myWhips.add("Crown Athlete");

        System.out.println(myWhips);

        //TreeSet -> Unique values that are sorted automatically
        TreeSet<String> shoes = new TreeSet<>();
        shoes.add("Js");
        shoes.add("Air force");
        shoes.add("Adidas");
        shoes.add("TimberLands");

        System.out.println(shoes);

        //LinkedHashSet -> Unique FIFO elements
        LinkedHashSet<Integer> salary = new LinkedHashSet<>();
        salary.addFirst(150000);
        salary.add(40000);
        salary.add(90000);
        salary.add(78000);
        salary.addLast(250000);

        System.out.println(salary);

        //for HashMap - key value pair, uses the method .put to append the data to the array

        HashMap<String, String> magari = new HashMap<String,String>();

        magari.put("Benzo", "Mercedes");
        magari.put("Honda", "Fit");
        magari.put("Toyota", "Lexus");

        System.out.println(magari);

        LinkedHashMap<String,Integer> studentsAge = new LinkedHashMap<>();
        studentsAge.put("John", 24);
        studentsAge.put("Simon", 32);
        studentsAge.put("Titus", 29);
        studentsAge.put("Zac", 23);
        studentsAge.put("Sylvia", 33);

        for(String student: studentsAge.keySet()){
            System.out.println(student + " " + "is:" + studentsAge.get(student));
        }



        //using Iterator for the looping (ArrayList)
        //get an Iterator for an obj
        Iterator<String> loop = myCars.iterator();

        while(loop.hasNext()){
            System.out.println(loop.next());
        }

        //list sorting (Array List)
        Collections.sort(myCars);
        for (String car:myCars){
            System.out.println("Sorted Cars:" + car);
        }
        //reversed a sorted ArrayList
        Collections.sort(myCars, Collections.reverseOrder());
    }




}