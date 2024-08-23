// Program in Java that demonstrates the use of the @Deprecated annotation.
class DeprecatedExample {
  // Marking the oldMethod as deprecated, indicating it should no longer be used
    @Deprecated
    public void oldMethod() {
        System.out.println("This is an old method, use the new one instead.");
    }
    public void newMethod() {
        System.out.println("This is the new method, use this one.");
    }
}
class AnnoDeprecated {
    public static void main(String[] args) {
        DeprecatedExample example = new DeprecatedExample();
        example.oldMethod(); // Call the oldMethod, which is deprecated
        example.newMethod(); // Call the newMethod, which is recommended for use
    }
}
