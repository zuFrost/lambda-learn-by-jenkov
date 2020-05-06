import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;

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

        List<Integer> list = Arrays.asList(1, 2, 3, 4 , 5, 6, 7, 8, 9);

        System.out.println("output all elements ");
        evaluate(list, (n)-> true);

        System.out.println("не выводит ни одного числа: ");
        evaluate(list, n -> false);

        System.out.println("вывод четных чисел: ");
        evaluate(list, n -> n % 2 == 0);

        System.out.println("вывод нечетных чисел: ");
        evaluate(list, n -> n % 2 == 1);

        System.out.println("вывод чисел больше 5: ");
        evaluate(list, n -> n > 5);

        System.out.println("квадрат каждого числа : ");
        list.stream()
                .map((n) -> n * n)
                .forEach(n -> {
                    System.out.print(n + " ");
                    System.out.print(":) ");
                });
        System.out.println();

        System.out.println("cумма квадрат каждого числа : ");
        int sum = list.stream().map(x -> x*x).reduce((x,y) -> x + y).get();
        System.out.println(sum);


    }

    public static void evaluate(List<Integer> list, Predicate<Integer> predicate) {
        for(Integer n: list) {
            if (predicate.test(n))  {
                System.out.print(n + " ");
            }
        }
        System.out.println();
    }
}
