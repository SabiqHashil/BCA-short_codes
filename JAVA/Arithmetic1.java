// Write a program to find the sum, difference, product, quotient and remainder of two numbers passed as command line argument.


public class Arithmetic1 {
    public static void main(String args[]) {
        int a, b, add, subtract, multiply, remainder;
        float devide;

        a = Integer.parseInt(args[0]);
        b = Integer.parseInt(args[1]);

        add = a + b;
        subtract = a - b;
        multiply = a * b;
        devide = (float) a / b;
        remainder = a % b;

        System.out.println("Sum = " + add);
        System.out.println("Difference = " + subtract);
        System.out.println("Product = " + multiply);
        System.out.println("Quotient = " + devide);
        System.out.println("Remainder = " + remainder);
        
    }
}
