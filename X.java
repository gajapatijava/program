class X {
    static void call() {
        System.out.println("It is a class method");
    }

    void show() {
        System.out.println("It is an object method");
    }
}

public class MyDemo {  // Class name should start with an uppercase letter by convention
    public static void main(String[] args) {
        X.call();  // Call the static method
        new X().show();  // Create an instance and call the instance method
    }
}
