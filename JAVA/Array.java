/*
    Read an array of 10 or more numbers and write a program to find the
    a) Smallest element in the array
    b) Largest element in the array
    c) Second largest element in the array
*/

import java.util.*;

public class Array {
    public static void main(String args[]) {
        // Initialize an integer array
        int array[] = { 5, 2, 9, 5, 3 };

        // Sort the array in ascending order
        Arrays.sort(array);

        // Print the sorted array
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        // Print the smallest element (first element after sorting)
        System.out.println("Smallest element: " + array[0]);

        // Print the largest element (last element after sorting)
        System.out.println("Largest element: " + array[array.length - 1]);

        // Print the second largest element (second last element after sorting)
        System.out.println("Second largest element: " + array[array.length - 2]);
    }
}
