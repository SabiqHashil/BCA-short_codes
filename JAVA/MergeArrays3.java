// Write a program to merge two arrays.

import java.util.*;

public class MergeArrays3 {
    public static void main(String args[]) {
        // Create a Scanner object for input
        Scanner sc = new Scanner(System.in);

        // Get the limit for the first array from the user
        System.out.println("Enter array 1 limit: ");
        int n = sc.nextInt();

        // Create an array to hold the merged elements
        int c[] = new int[50];

        // Create the first array and input its elements
        int a[] = new int[n];
        System.out.println("Enter array 1 elements: ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            c[i] = a[i]; // Copy elements to the merged array
        }

        // Initialize a variable to track the position in the merged array
        int k = n;

        // Get the limit for the second array from the user
        System.out.println("Enter array 2 limit: ");
        int m = sc.nextInt();

        // Create the second array and input its elements
        int b[] = new int[m];
        System.out.println("Enter array 2 elements: ");
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
            c[k] = b[i]; // Copy elements to the merged array
            k++; // Increment position in the merged array
        }

        // Print the merged array
        System.out.println("Merged array: ");
        for (int i = 0; i < n + m; i++) {
            System.out.println(c[i]);
        }

        // Close the Scanner object
        sc.close();
    }
}
