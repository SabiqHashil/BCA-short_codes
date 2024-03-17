// Write a program to find the sum, difference, product, quotient and remainder of two numbers passed as command line argument.


public class Arithmetic1 {
    public static void main(String args[]) {
        int first, second, add, subtract, multiply, remainder;
        float devide;

        first = Integer.parseInt(args[0]);
        second = Integer.parseInt(args[1]);

        add = first + second;
        subtract = first - second;
        multiply = first * second;
        devide = (float) first / second;
        remainder = first % second;

        System.out.println("Sum = " + add);
        System.out.println("Difference = " + subtract);
        System.out.println("Product = " + multiply);
        System.out.println("Quotient = " + devide);
        System.out.println("Remainder = " + remainder);
        
    }
}
