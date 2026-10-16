import java.util.Scanner;
public class WorkingHours {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
double total = 0;
// Repeat exactly 5 times
for (int count = 1; count <= 7; count++) {
System.out.print("Enter working hours for day "
+ count + ": ");
double score = input.nextDouble();
total += score;
}
double average = total / 7;
System.out.printf("Total hours worked: %.2f%n", total);
System.out.printf("Average hours worked per day: %.2f%n", average);
input.close();
input.close();
}
}
