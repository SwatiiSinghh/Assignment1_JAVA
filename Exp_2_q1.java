import java.util.Scanner;

public class Exp_2_q1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {
            System.out.println("Enter details for Employee " + i + ":");

            System.out.print("Enter Employee ID: ");
            int employeeId = scanner.nextInt();

            System.out.print("Enter Employee Name: ");
            String employeeName = scanner.next();

            System.out.print("Enter Employee Salary: ");
            double employeeSalary = scanner.nextDouble();

            System.out.println("\nEmployee " + i + " Details:");
            System.out.println("Employee ID: " + employeeId);
            System.out.println("Employee Name: " + employeeName);
            System.out.println("Employee Salary: " + employeeSalary);
            System.out.println("------------------------");
        }

        scanner.close();
    }
}
