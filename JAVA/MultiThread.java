// Write a multi thread java program for displaying odd numbers and even numbers up 
// to a limit (Hint: Implement thread using Runnable interface).

// Define a class NP that implements the Runnable interface
class EO implements Runnable {
    int limit;
    boolean isEven;

    // Constructor to initialize the limit and whether to print even or odd numbers
    EO(int l, boolean i) {
        limit = l;
        isEven = i;
    }

    // Overriding the run() method from the Runnable interface
    public void run() {
        // Determine the starting number based on whether to print even or odd numbers
        int n = isEven ? 2 : 1;

        // Print numbers up to the specified limit (inclusive)
        while (n <= limit) {
            System.out.println(n);
            n += 2; // Increment by 2 to get the next even number or odd number
        }
    }
}

public class MultiThread {
    public static void main(String[] args) {
        // Create two threads, one for printing even numbers and one for odd numbers
        Thread e = new Thread(new EO(20, true)); // Thread for even numbers up to 20
        Thread o = new Thread(new EO(20, false)); // Thread for odd numbers up to 20

        // Start both threads
        e.start();
        o.start();
    }
}
