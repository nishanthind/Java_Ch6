interface MyInterface {
    static void staticMethod() {
        System.out.println("This is a static method in MyInterface");
    }
}

class MyClass implements MyInterface {
    // Class implementing the interface
}

public class Main {
    public static void main(String[] args) {
        // Creating an instance of MyClass
        // MyClass myInstance = new MyClass();

        // Accessing the static method through the instance (not recommended)
        // myInstance.staticMethod(); // This will work but is not recommended

        // Accessing the static method through the interface (recommended)
        MyInterface.staticMethod(); // This is the preferred way to access a static method
    }
}
