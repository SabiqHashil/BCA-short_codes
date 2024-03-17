import java.util.*;

public class MergeArrays3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array 1 limit: ");
        int n = sc.nextInt();

        int c[] = new int[50];

        int a[] = new int[n];
        System.out.println("Enter array 1 elements: ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            c[i] = a[i];
        }

        int k = n;

        System.out.println("Enter array 2 limit: ");
        int m = sc.nextInt();

        int b[] = new int[m];
        System.out.println("Enter array 2 elements: ");
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
            c[k] = b[i];
            k++;
        }

        System.out.println("Merged array: ");
        for (int i = 0; i < n + m; i++) {
            System.out.println(c[i]);
        }
        sc.close();
    }
}