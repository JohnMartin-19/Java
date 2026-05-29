public class MyTask implements Runnable{
    public String taskName;

    //constructor
    public MyTask(String taskName){
        this.taskName = taskName;
    }

    @Override
    public void run(){
        System.out.println(taskName + "running on:" + Thread.currentThread().getName());
    }
}