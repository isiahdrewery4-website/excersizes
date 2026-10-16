import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class ProcessScores {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("scores.txt");
        Scanner input = new Scanner(file);

        int score;
        int count = 0;
        int total = 0;

        while (input.hasNextInt()) {
            score = input.nextInt();
            total += score;
            count++;
        }

        if (count > 0) {
            double average = (double) total / count;

            System.out.println("Number of scores: " + count);
            System.out.println("Total score: " + total);
            System.out.println("Average score: " + average);
        } else {
            System.out.println("The file contains no scores.");
        }

        input.close();
    }
}
