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
        switch (myLevel){
            case LOW:
                System.out.println("LOW LEVEL BRO");
                break;
            case MEDIUM:
                System.out.println("MEDIUM LEVEL BOIS");
                break;
            case HARD:
                System.out.println("HARD LEVEL BRO");
                break;
        }
        //System.out.println(myLevel);
    }
}


