// Main class out of custom package to access the classes os custom package

package mypack;

import mypack.custompack.PublicClass;
import mypack.custompack.ProtectedClass;
import mypack.custompack.DefaultClass;
import mypack.custompack.PrivateClass;

public class Main extends ProtectedClass {
    public static void main(String[] args) {
        // Access public class and method
        PublicClass publicObj = new PublicClass();
        publicObj.publicMethod();

        // Access protected class and method directly
        // ProtectedClass protectedObj = new ProtectedClass();
        // protectedObj.protectedMethod();

        // Access protected class and method through its sub class
        // Main protectedObj = new Main();
        // protectedObj.protectedMethod();

        // Access default class and method (within the same package)
        DefaultClass defaultObj = new DefaultClass();
        defaultObj.defaultMethod();

        // Access private class and method (not allowed)
        PrivateClass privateObj = new PrivateClass(); // Results in a compilation error
        privateObj.privateMethod(); // Results in a compilation error
    }
}
