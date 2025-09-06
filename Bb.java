import java.util.function.*;

class Bb {
    public static void main(String[] args) {
        A ob = new A() {
           // @Override
            public void show() {
                System.out.println("Welcome");
            }
        };
        ob.show();
    }
}
