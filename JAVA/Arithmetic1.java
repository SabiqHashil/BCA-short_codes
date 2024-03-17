// Write a program to find the sum, difference, product, quotient and remainder of two numbers passed as command line argument.

public class Arithmetic1 {
    public static void main(String[] args) {

        // Convert command line arguments to integers
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);

        // Perform calculations
        int sum = num1 + num2;
        int diff = num1 - num2;
        int product = num1 * num2;
        int quotient = num1 / num2;
        int remainder = num1 % num2;

        // Display results
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + diff);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);
    }
}
