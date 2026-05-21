import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;

public class Main{
    public static void main(String[] args){
        //an array list
        ArrayList<String> myCars = new ArrayList<String>();

        myCars.add("Discovery");
        myCars.add("Audi RS6");
        myCars.add("V8 Sahara");
        myCars.add("LC 90 Series");

        System.out.println(myCars);


        // for a HashSet -  its takes NO DUPLICATE DATA
        HashSet<String> myWhips = new HashSet<String>();

        myWhips.add("Volvo xc90");
        myWhips.add("Subaru");
        myWhips.add("Mazda Atenza");
        myWhips.add("Crown Athlete");

        System.out.println(myWhips);


        //for HashMap - key value pair, uses the method .put to append the data to the array

        HashMap<String, String> magari = new HashMap<String,String>();

        magari.put("Benzo", "Mercedes");
        magari.put("Honda", "Fit");
        magari.put("Toyota", "Lexus");

        System.out.println(magari);
    }
}