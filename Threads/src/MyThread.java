//extending/Inheriting Thread

public class MyThread extends Thread{
    private String taskName;

    public MyThread (String taskName){
        this.taskName = taskName;
    }

    @Override
    public void run(){
        System.out.println(taskName + "running on:" + Thread.currentThread().getName());
        try{
            Thread.sleep(2000);
        } catch( InterruptedException e){
            Thread.currentThread().interrupt();
        }
        System.out.println(taskName + "Completed");
    }


}
