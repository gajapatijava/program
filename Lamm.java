import java.util.function.BiFunction;

class Lamm {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;
        System.out.println(add.apply(20, 30));
    }
}
