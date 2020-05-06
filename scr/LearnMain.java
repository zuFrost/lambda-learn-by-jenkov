import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class LearnMain {
    public static void main(String[] args) {

//        Runnable r = () -> {
//            System.out.println("hello world");
//        };

        new Thread(
                () -> System.out.println("hello world")
        ).start();

//        Consumer<Integer> c = (int x) -> {
//            System.out.println(x)
//        };

        BiConsumer<Integer, String> b = (Integer x, String y) -> {
            System.out.println(x + " : " + y);
        };

    }
}
