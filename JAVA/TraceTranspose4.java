// Write a program to find the trace and transpose of a matrix.

import java.util.*;

public class TraceTranspose4 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;

        System.out.println("Rows: ");
        int rows = sc.nextInt();

        System.out.println("Cols: ");
        int cols = sc.nextInt();

        int matrix[][] = new int[rows][cols];

        System.out.println("Matrix:");
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Transpose:");
        for(int i = 0; i < cols; i++) {
            for(int j = 0; j < rows; j++) {
                System.out.print(" " + matrix[j][i]);
            }
            System.out.println();
        }

        if(rows == cols) {
            for(int i = 0; i < cols; i++) {
                for(int j = 0; j < rows; j++) {
                    if(i == j) {
                        sum += matrix[i][j];
                    }
                }
            }

            System.out.println("Trace: " + sum);
        }
    }
}