import java.util.Scanner;

public class GradeFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of subjects for which you want to find the average:");
        int n = sc.nextInt();

        float totalMarks = 0, average;

        System.out.println("Enter the marks of each subject (out of 100):");
        for (int i = 0; i < n; i++) {
            float marks = sc.nextFloat();

            // Validate input marks
            if (marks < 0 || marks > 100) {
                System.out.println("Invalid marks entered. Please enter marks between 0 and 100.");
                return;
            }

            totalMarks += marks;
        }

        average = totalMarks / n;

        System.out.println("Total Marks Obtained: " + totalMarks);
        System.out.println("Average Marks: " + average);

        // Grade calculation
        if (average >= 90 && average <= 100) {
            System.out.println("Grade = O (Outstanding)");
        } else if (average >= 70 && average < 90) {
            System.out.println("Grade = A (Excellent)");
        } else if (average >= 60 && average < 70) {
            System.out.println("Grade = B (Good)");
        } else if (average >= 50 && average < 60) {
            System.out.println("Grade = C (Satisfactory)");
        } else if (average >= 40 && average < 50) {
            System.out.println("Grade = D (Pass)");
        } else if (average >= 0 && average < 40) {
            System.out.println("Fail");
        } else {
            System.out.println("Invalid average calculation. Please check your inputs.");
        }
    }
}
