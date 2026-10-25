
import java.util.*;

public class Main {

    // Lower Bound: accepts Integer and its supertypes
    public static void addScores(List<? super Integer> scores) {
        scores.add(85);
        scores.add(92);
        scores.add(78);

        System.out.println("Student scores: " + scores);
    }

    // Generic method restricted to Number types
    public static <T extends Number> double average(List<T> values) {
        double sum = 0;

        for (T value : values) {
            sum += value.doubleValue();
        }

        return sum / values.size();
    }

    public static void main(String[] args) {
        List<Number> scores = new ArrayList<>();

        addScores(scores);

        List<Integer> grades = Arrays.asList(85, 92, 78);

        System.out.println("Average grade: " + average(grades));
    }
}

