import java.util.Scanner;

class Number {
     double num1;
     double num2;

    public Number(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double add() {
        return num1 + num2;
    }

    public double subtract() {
        return num1 - num2;
    }

    public double multiply() {
        return num1 * num2;
    }

    public double divide() {
        if (num2 == 0) {
            System.out.println("Error: Division by zero is not allowed.");
            return Double.NaN; 
        } else {
            return num1 / num2;
        }
    }
}

public class  Exp_1_q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = sc.nextDouble();

        Number obj = new Number(num1, num2);

        System.out.println("Addition: " + obj.add());
        System.out.println("Subtraction: " + obj.subtract());
        System.out.println("Multiplication: " + obj.multiply());
        System.out.println("Division: " + obj.divide());

        sc.close();
    }
}


