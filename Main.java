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


        //comparison of booleans
        int myAge = 24;
        int ageToVote = 18;

        if(myAge >= ageToVote){
            System.out.println("You are eligible to vote");
        }else {
            System.out.println("You are not eligible to vote");
        }

        int legalAge = 20;
        String checker = (myAge > legalAge) ? "Legal" : "minor"; 
        System.out.println(checker);

        //print even numbers using for loop
        var i = 0;
        for (i=0; i< 30; i=i+2){
          System.out.println(i);
        }
        //print odd numbers
        var j =1;
        for (j=1; j< 30; j=j+2){
          System.out.println(j);
        }

        //for ...each loops
        String[] cars = {"Atenzaa","Athlete","Benz","BMW", "RS6"};

        for(String car: cars){
          System.out.println(car);
        }

        int[] numbers = {1,4,90,12,45,21,87};

        for (int number:numbers){
          //var biggest = Math.max(number);
          System.out.println(number);
        }


        //break.. continue with a for loop
        for(int number:numbers){
          if (number < 5){
            continue;
          }
          if (number == 21){
            break;
          }
          System.out.println(number);
        }

        //arrays
        String names[] = {"mburu","mike","zac","ip"};
        names[2]= "symoh";
        System.out.println(names[2]);
        System.out.println(names.length);

        //looping thru the array with the for loop
          for (int n=0; n < names.length; n++){
            System.out.println(names[n]);
          }
        

          //looping thru an array and coming up with the summation
          int sum = 0;

          for(int l=0; l<numbers.length; l++){
            sum += numbers[l];
            System.out.println(sum);
          }

          //real life example
          int ages[] = {20, 22, 18, 35, 48, 26, 87, 70};

          float total = 0;
          //find the length of the array
          int length = ages.length;
          System.out.println(length);

          //summation
          for(int age:ages){
            total += age;
          }
          System.out.println(total);

          //average

          var average = sum/length;
          System.out.println(average);








      }

      
      
}

