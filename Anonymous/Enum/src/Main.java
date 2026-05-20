//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//enums ->  used to group constants(unchangeable vars)

public class Main {
    enum Level{
        LOW,
        MEDIUM,
        HARD
    }
    public static void main(String[] args) {
        Level myLevel = Level.HARD;
        System.out.println(myLevel);
    }
}