import java.util.Scanner;

public class StudentScores {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int score;
        int passed = 0;
        int failed = 0;

        for (int student = 1; student <= 8; student++) {
            System.out.print("Enter score for student " + student + ": ");
            score = input.nextInt();

            if (score >= 50) {
                passed++;
            } else {
                failed++;
            }
        }

        System.out.println("Number of students who passed: " + passed);
        System.out.println("Number of students who failed: " + failed);

        input.close();
    }
}
