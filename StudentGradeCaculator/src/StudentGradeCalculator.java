import java.util.Scanner;

public class StudentGradeCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        System.out.print("Enter marks of Subject 1: ");
        double subject1 = sc.nextDouble();

        System.out.print("Enter marks of Subject 2: ");
        double subject2 = sc.nextDouble();

        System.out.print("Enter marks of Subject 3: ");
        double subject3 = sc.nextDouble();

        double total = subject1 + subject2 + subject3;
        double percentage = total / 3;

        String grade;

        if (percentage >= 90) {
            grade = "A+";
        } else if (percentage >= 80) {
            grade = "A";
        } else if (percentage >= 70) {
            grade = "B";
        } else if (percentage >= 60) {
            grade = "C";
        } else if (percentage >= 50) {
            grade = "D";
        } else {
            grade = "Fail";
        }

        System.out.println("\n----- Student Result -----");
        System.out.println("Name: " + name);
        System.out.println("Total Marks: " + total);
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Grade: " + grade);

        sc.close();
    }
}