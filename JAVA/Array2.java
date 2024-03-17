/*
    Read an array of 10 or more numbers and write a program to find the
    a) Smallest element in the array
    b) Largest element in the array
    c) Second largest element in the array
*/

import java.util.*;

public class Array2 {
    public static void main(String args[]) {
        int array[] = {5, 2, 9, 5, 3};

        Arrays.sort(array);

        for(int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        System.out.println("Smallest element: " + array[0]);
        System.out.println("Smallest element: " + array[array.length - 1]);
        System.out.println("Smallest element: " + array[array.length - 2]);
    }
}