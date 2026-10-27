import java.util.*;

public class Main {

    public static void addNumbers(List<? super Integer> numbers) {
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        System.out.println("Numbers: " + numbers);
    }

    public static void main(String[] args) {
        List<Number> list = new ArrayList<>();

        addNumbers(list);
    }
}
