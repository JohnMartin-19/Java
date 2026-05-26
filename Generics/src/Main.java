


//generics help us/lets us write/reuse a method, constructor etc without having to redefine the datatype
class Box<T> {
    T value;

    void set(T value){
        this.value = value;
    }
    T get(){
        return value;
    }
}
public class Main{
    public static void main(String[] args){
        //create a Box holding string datatype
        Box<String> stringBox = new Box<>();
        stringBox.set("Woza woza nauza zamoza");
        var result = stringBox.get();
        System.out.println(result);

        //create a box holding int value
        Box<Integer> intBox = new Box<>();
        intBox.set(28);
        var outcome = intBox.get();
        System.out.println(outcome);
    }
}