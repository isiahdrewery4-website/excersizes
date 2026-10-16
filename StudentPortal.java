import java.util.Scanner;

public class StudentPortal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean running = true;
        int choice;

        while (running) {
            System.out.println("\nStudent Portal Menu");
            System.out.println("1. View registered courses");
            System.out.println("2. View student information");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            choice = input.nextInt();

            if (choice == 1) {
                System.out.println("Displaying registered courses...");
            } else if (choice == 2) {
                System.out.println("Displaying student information...");
            } else if (choice == 3) {
                System.out.println("Exiting student portal.");
                running = false;
            } else {
                System.out.println("Error: Invalid option. Try again.");
            }
        }

        input.close();
    }
}
