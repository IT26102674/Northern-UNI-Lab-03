import java.util.Scanner;

public class IT26102674Lab3Q2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter monthly salary: ");
        double salary = input.nextDouble();

        System.out.print("Enter OT hours: ");
        double hours = input.nextDouble();

        System.out.print("Enter OT hourly rate: ");
        double rate = input.nextDouble();

        double otAmount = hours * rate;
        double totalSalary = salary + otAmount;

        System.out.println("OT Amount = " + otAmount);
        System.out.println("Total Salary = " + totalSalary);
    }
}