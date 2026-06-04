//Interface Segregation Principle (ISP)
//A class should not be forced to implement methods it doesn't use.
// Many small specific interfaces are better than one large general one.


// Small, focused interfaces
public interface Workable {
    void work();
}

public interface Eatable {
    void eat();
}

public interface Sleepable {
    void sleep();
}

public interface Reportable {
    void writeReport();
}

public interface Meetable {
    void attendMeeting();
}

// Human worker — implements what humans do
public class HumanWorker implements Workable, Eatable, Sleepable, Reportable, Meetable {
    @Override public void work()         { System.out.println("Human working"); }
    @Override public void eat()          { System.out.println("Human eating"); }
    @Override public void sleep()        { System.out.println("Human sleeping"); }
    @Override public void writeReport()  { System.out.println("Human writing report"); }
    @Override public void attendMeeting(){ System.out.println("Human in meeting"); }
}

// Robot worker — only implements what robots do
public class RobotWorker implements Workable, Reportable, Meetable {
    @Override public void work()         { System.out.println("Robot working"); }
    @Override public void writeReport()  { System.out.println("Robot writing report"); }
    @Override public void attendMeeting(){ System.out.println("Robot in meeting"); }
}