import java.io.FileOutputStream;
import java.io.IOException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    static  void checkAge(int age){
        if(age < 18){
            throw new ArithmeticException("Too young bro!");
        } else {
            System.out.println("Access granted.");
        }
    }
    public static void main(String[] args) {

       checkAge(19);
       try{
           int[] myNumbers = {12,5,34,32,21,89};
           System.out.println(myNumbers[7]);
       } catch (Exception e){
           System.out.println("Error");
       } finally {
           System.out.println("try ... catch is finished");
       }

       //1 try multiple catches
        try{
            int[] numbers = {1,2,3,4,4,5};
            System.out.println(numbers[5]);
            var result = 10/0;
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array ndex does ot exist");
        } catch(ArithmeticException e){
            System.out.println("Cannot divide by zero");
        } catch(Exception e) {
            System.out.println("Something else went wrong.");
        }

        //try-with-resources
        try(FileOutputStream output = new FileOutputStream("filename.txt")){
            output.write("Hello" .getBytes()); // no need to call output.close();
            System.out.println("Successfully wrote the file");
        } catch (IOException e){
            System.out.println("Err writing the file");
        }

        //Rule of thumb: Whenever you work with files, streams, or database connections,
        // use try-with-resources to make sure they are closed properly.

    }
}