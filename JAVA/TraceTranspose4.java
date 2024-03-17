// Write a program to find the trace and transpose of a matrix.

import java.util.*;


public class TraceTranspose4 {
    public static void main(String args[]) {
        // Create a Scanner object for input
        Scanner sc = new Scanner(System.in);

        // Initialize a variable to store the sum of diagonal elements
        int sum = 0;

        // Get the number of rows from the user
        System.out.println("Rows: ");
        int rows = sc.nextInt();

        // Get the number of columns from the user
        System.out.println("Cols: ");
        int cols = sc.nextInt();

        // Create a 2D array to hold the matrix elements
        int matrix[][] = new int[rows][cols];

        // Input the matrix elements from the user
        System.out.println("Matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Print the transpose of the matrix
        System.out.println("Transpose:");
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(" " + matrix[j][i]);
            }
            System.out.println();
        }

        // Calculate and print the trace if matrix is square
        if (rows == cols) {
            for (int i = 0; i < cols; i++) {
                for (int j = 0; j < rows; j++) {
                    if (i == j) {
                        sum += matrix[i][j]; // Add diagonal elements
                    }
                }
            }

            System.out.println("Trace: " + sum);
        }

        // Close the Scanner object
        sc.close();
    }
}
