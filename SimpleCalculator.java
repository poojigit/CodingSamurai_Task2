import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Simple Calculator!");

        while (true) {
            // Displaying the menu
            System.out.println("/nChoose an operation:");
            System.out.println("1. Addition (+)");
            System.out.println("2. Subtraction (-)");
            System.out.println("3. Multiplication (*)");
            System.out.println("4. Division (/)");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            // Exit condition
            if (choice == 5) {
                System.out.println("Thank you for using the calculator. Goodbye!");
                break;
            }

            // Input validation for valid choices
            if (choice < 1 || choice > 5) {
                System.out.println("Invalid choice. Please try again.");
                continue;
            }

            // Taking inputs for the arithmetic operation
            System.out.print("Enter the first number: ");
            double num1 = scanner.nextDouble();

            System.out.print("Enter the second number: ");
            double num2 = scanner.nextDouble();

            double result;

            // Switch case to perform the chosen operation
            switch (choice) {
                case 1:
                    result = num1 + num2;
                    System.out.printf("Result: %.2f + %.2f = %.2f%n", num1, num2, result);
                    break;
                case 2:
                    result = num1 - num2;
                    System.out.printf("Result: %.2f - %.2f = %.2f%n", num1, num2, result);
                    break;
                case 3:
                    result = num1 * num2;
                    System.out.printf("Result: %.2f * %.2f = %.2f%n", num1, num2, result);
                    break;
                case 4:
                    // Handling division by zero
                    if (num2 == 0) {
                        System.out.println("Error: Division by zero is not allowed.");
                    } else {
                        result = num1 / num2;
                        System.out.printf("Result: %.2f / %.2f = %.2f%n", num1, num2, result);
                    }
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }

        scanner.close();
    }
}
