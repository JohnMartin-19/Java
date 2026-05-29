//attempting to solve for RACE CONDITIONS using : 1)Synchronized keyword 2)Atomic Integer 3) Sync Block


public class Counter{
    private int count = 0;

    public synchronized void increment(){
        count++;
    }

    public synchronized int getCount(){
        return count;
    }
}