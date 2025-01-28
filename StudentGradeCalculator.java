import java.util.Scanner;

public class StudentGradeCalculator {

    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

        // Input marks for three subjects
        System.out.print("Enter marks for Subject 1: ");
        double subject1 = scanner.nextDouble();

        System.out.print("Enter marks for Subject 2: ");
        double subject2 = scanner.nextDouble();

        System.out.print("Enter marks for Subject 3: ");
        double subject3 = scanner.nextDouble();

        // Calculate average
        double average = (subject1 + subject2 + subject3) / 3;

        // Determine grade
        char grade;
        if (average >= 90) {
            grade = 'A';
        } else if (average >= 75) {
            grade = 'B';
        } else if (average >= 50) {
            grade = 'C';
        } else {
            grade = 'F';
        }

        // Display result
        System.out.println("Average Marks: " + average);
        System.out.println("Final Grade: " + grade);

        scanner.close();
    }
}
