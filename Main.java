import java.util.*;

public class Main {

    public static void addGrades(List<? super Integer> grades) {
        grades.add(85);
        grades.add(90);
        grades.add(78);
        grades.add(95);

        System.out.println("Student Grades: " + grades);

        int total = 0;

        for (Object grade : grades) {
            total += (Integer) grade;
        }

        System.out.println("Total Grades: " + total);
        System.out.println("Number of Grades: " + grades.size());
        System.out.println("Average: " + (total / grades.size()));
    }

    public static void main(String[] args) {
        List<Number> grades = new ArrayList<>();

        addGrades(grades);
    }
}
