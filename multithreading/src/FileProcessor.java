
import java.util.concurrent.*;

public class FileProcessor implements Callable<String>{
    private String fileName;
    private int recordCount;


    //constr
    public FileProcessor(String fileName, int recordCount){
        this.fileName = fileName;
        this.recordCount = recordCount;
    }

    public int getRecordCount(){
        return recordCount;
    }

    //method
    @Override
    public String call() throws Exception{
        String threadName = Thread.currentThread().getName();
        System.out.println("Starting: " + fileName + " on " + threadName);

        //simulate file processing time based on ecord count
        Thread.sleep(recordCount * 10L);

        var result = "Processed " + recordCount + " records from "
                + fileName + " on " + threadName;
        System.out.println("Completed: " + fileName);
        return result;
    }
}