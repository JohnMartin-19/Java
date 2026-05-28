import java.io.*;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        try{
            File myFile = new File("index.html");
            if(myFile.createNewFile()){
                System.out.println("File created successfully");
            }else{
                System.out.println("File already exists");
            }
        } catch (IOException e){
            System.out.println("Error occurred");
            e.printStackTrace();
        }


        //writing to a file
        try {
            FileWriter writtenFile = new FileWriter("index.html");
            writtenFile.write("Ooooh Kelvin De Bruyne");
            writtenFile.close(); //must close manually
            System.out.println("Success");
        } catch (IOException e){
            System.err.println("An error occurred");
            e.printStackTrace();
        }

        //Write To a File with try-with-resources
        //FileWriter will be closed automatically
        try(FileWriter yourFileWithResources = new FileWriter("index.html")){
            yourFileWithResources.write("Pep is the greatest");
            System.out.println("Success");
        } catch(IOException e){
            System.out.println("eRROR writing to file");
        }

        //read a file
        File readFile = new File("index.html");

        try(Scanner myScannedFile = new Scanner(readFile)){
            while(myScannedFile.hasNext()){
                var data = myScannedFile.nextLine();
                System.out.println(data);
            }
        } catch(FileNotFoundException e){
            System.out.println("Error happened while reading file");
        }


        //getting file information

        File infoFile = new File("index.html");
        if(infoFile.exists()){
            System.out.println("File name:" + infoFile.getName());
            System.out.println("Absolute Path:" + infoFile.getAbsolutePath());
            System.out.println("Writeable:" + infoFile.canWrite());
            System.out.println("Readable:" + infoFile.canRead());

        } else {
            System.out.println("File does not exist");
        }

        //reading file with FileInputStream
        try (FileInputStream input = new FileInputStream("index.html")){
            int j; // variable to store each byte that is read

            // Read one byte at a time until end of file (-1 means "no more data")s
            while((j = input.read()) != -1){
                System.out.println((char) j);
            }
        } catch( IOException e){
            System.out.println("Error while reading file");
        }

        //writing a file using FileOutputStream
        var text = "Hello world";
        try(FileOutputStream output = new FileOutputStream("index.html")){
            output.write(text.getBytes());
            System.out.println("Successfully wrote to the file");
        } catch (IOException e){
            System.out.println("An error occurred");
        }


        //reading a file using BufferedReader
        try (BufferedReader br = new BufferedReader(new FileReader("index.html"))){
            String line;
            while((line = br.readLine()) != null){
                System.out.println(line);
            }
        }catch (IOException e){
            System.out.println("Error occurred");
        }

        //writing using bufferedWriter
        try(BufferedWriter bw = new BufferedWriter(new FileWriter("index.html"))){
            bw.write("First Line");
            bw.newLine();
            bw.write("Second Line");
            System.out.println("Successfully written to the file");
        } catch( IOException e){
            System.out.println("Error raised");
        }


    }
}