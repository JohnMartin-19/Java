public class Main{
//    public static void main(String[] args) {
//        System.out.println("Hello John!. This is my first Java program since Uni.");
//    }

      public static void main (String[] args) {
        System.out.println("Niaje cutie. Na umeiva");
        System.out.println("Woow");
        String name = "John";
        System.out.println("Hello" + name);

        //Data types
        String jina = "Shanice";
        int studentID =14020;
        double score = 420.00;
        char grade = 'A';

        System.out.println(jina);
        System.out.println(studentID);
        System.out.println(score);
        System.out.println(grade);

        //strings
        String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println(letters.length());
        System.out.println(letters.toLowerCase());
        System.out.println(letters.toUpperCase());
        System.out.println(letters.indexOf("D"));
        System.out.println(letters.indexOf("Z"));


        //concatenation of strings
        String firstName = "Shanice";
        String lastName = "Wanjiru";
        var jinaFull = firstName + " " + lastName;
        String fullName = firstName.concat(lastName);
        System.out.println(fullName);
        System.out.println(jinaFull);

      }


      
}

