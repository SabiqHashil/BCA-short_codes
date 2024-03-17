// Write a multi thread java program for displaying odd numbers and even numbers up 
// to a limit (Hint: Implement thread using Runnable interface).


import java.util.Scanner;

class NumberPrinter implements Runnable {
    private final int limit;
    private final boolean isEven;

    public NumberPrinter(int limit, boolean isEven) {
        this.limit = limit;
        this.isEven = isEven;
    }

    public void run() {
        for (int i = isEven ? 2 : 1; i <= limit; i += 2) {
            if ((i % 2 == 0 && isEven) || (i % 2 != 0 && !isEven)) {
                System.out.println(i);
            }
        }
    }
}

public class MultiThread9{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the limit: ");
        int limit = scanner.nextInt();

        new Thread(new NumberPrinter(limit, true)).start();
        new Thread(new NumberPrinter(limit, false)).start();
    }
}



// import java.util.Scanner;

// class NumberPrinter implements Runnable {
//     private int limit;
//     private boolean isEven;

//     public NumberPrinter(int limit, boolean isEven) {
//         this.limit = limit;
//         this.isEven = isEven;
//     }

//     @Override
//     public void run() {
//         int number = isEven ? 2 : 1;

//         while (number <= limit) {
//             if ((number % 2 == 0 && isEven) || (number % 2 != 0 && !isEven)) {
//                 System.out.println(number);
//             }

//             number += 2;
//         }
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter the limit: ");
//         int limit = scanner.nextInt();

//         Thread evenThread = new Thread(new NumberPrinter(limit, true));
//         Thread oddThread = new Thread(new NumberPrinter(limit, false));

//         evenThread.start();
//         oddThread.start();
//     }
// }