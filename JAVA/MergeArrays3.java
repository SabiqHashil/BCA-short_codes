// Write a program to merge two arrays.

import java.util.Arrays;
import java.util.Scanner;

class MergeArrays {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the number of elements in the first array: ");
        int n = s.nextInt();
        int[] a = new int[n];

        System.out.println("Enter the elements of the first array:");
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }

        System.out.print("Enter the number of elements in the second array: ");
        int m = s.nextInt();
        int[] b = new int[m];

        System.out.println("Enter the elements of the second array:");
        for (int i = 0; i < m; i++) {
            b[i] = s.nextInt();
        }

        int[] me = new int[n + m];
        System.arraycopy(a, 0, me, 0, n);
        System.arraycopy(b, 0, me, n, m);

        System.out.println("Merged Array: " + Arrays.toString(me));

        s.close();
    }
}

