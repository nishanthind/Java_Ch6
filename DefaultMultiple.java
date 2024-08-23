interface Interface1 {
    public void print() {
        System.out.println("This is default method in Interface1");
    }
}
interface Interface2 {
    default void print() {
        System.out.println("This is default method in Interface2");
    }
}
class MyClass implements Interface1,Interface2 {
    // Implementing the print() method of Interface1
    public void print() {
        Interface1.super.print(); // Calling the print() method of Interface1
    }
}
public class DefaultMultiple {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.print(); // Output: This is default method in Interface1
    }
}
