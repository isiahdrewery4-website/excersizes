import java.util.Scanner;

public class ElectricityUsage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double usage;
        double totalUsage = 0;
        double averageUsage;

        for (int day = 1; day <= 7; day++) {
            System.out.print("Enter electricity usage for day " + day + " (kWh): ");
            usage = input.nextDouble();
            totalUsage += usage;
        }

        averageUsage = totalUsage / 7;

        System.out.println("Total electricity usage: " + totalUsage + " kWh");
        System.out.println("Average daily usage: " + averageUsage + " kWh");

        input.close();
    }
}
