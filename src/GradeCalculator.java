
import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first value: ");
        double value1 = scanner.nextDouble();

        System.out.print("Enter the second value: ");
        double value2 = scanner.nextDouble();

        System.out.print("Enter the third value: ");
        double value3 = scanner.nextDouble();

        double sum = value1 + value2 + value3;
        double average = sum / 3;

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);

        String grade;

        if (average > 90) {
            grade = "A";
        } else if (average >= 80 && average <= 90) {
            grade = "B";
        } else if (average >= 70 && average < 80) {
            grade = "C";
        } else {
            grade = "D";
        }

        System.out.println("Grade: " + grade);
    }
}
