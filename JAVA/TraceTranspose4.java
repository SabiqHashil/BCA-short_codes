// Write a program to find the trace and transpose of a matrix.

import java.util.Scanner;

public class TraceTranspose4 {
    public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the number of rows: ");
		int rows = scanner.nextInt();

		System.out.print("Enter the number of columns: ");
		int cols = scanner.nextInt();

		int[][] matrix = new int[rows][cols];

		System.out.println("Enter the elements of the matrix: ");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				matrix[i][j] = scanner.nextInt();
			}
		}

    System.out.println("Original matrix: ");

    displayMatrix(matrix);

		int trace = findTrace(matrix);
		System.out.println("Trace of the matrix: " + trace);

		int[][] transpose = findTranspose(matrix);
		System.out.println("Transpose of the matrix: ");
		displayMatrix(transpose);

		scanner.close();
	}

    public static int findTrace(int[][] matrix) {
        int trace = 0;
        for (int i = 0; i < matrix.length; i++) {
            trace += matrix[i][i];
        }
        return trace;
    }

    public static int[][] findTranspose(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int[][] transpose = new int[cols][rows];

        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                transpose[i][j] = matrix[j][i];
            }
        }
        return transpose;
    }

    public static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
