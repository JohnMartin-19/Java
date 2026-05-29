import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

public class AtomicInt {
    private AtomicInteger count = new AtomicInt(0);

    public void increment(){
        count.incrementAndGet(); // atomic — one uninterruptible operation
    }

    public int getCount(){
        return count.get();
    }
}