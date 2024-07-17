package m01_first_program;

import java.util.Scanner;

public class HelloBro {
    public static void main(String[] args) {
        //sout
        System.out.println("Hello Bro");

        SimpleCalculator.calculate();
    }

    public static class SimpleCalculator {
        public static void calculate() {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter first number: ");
            double num1 = scanner.nextDouble();

            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();

            System.out.print("Enter operator (+, -, *, /): ");
            char operator = scanner.next().charAt(0);

            double result;
            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 == 0) {
                        System.out.println("Error! Division by zero is not allowed.");
                        return;
                    }
                    result = num1 / num2;
                    break;
                default:
                    System.out.println("Error! Invalid operator.");
                    return;
            }

            System.out.println("Result: " + result);
        }
    }
}