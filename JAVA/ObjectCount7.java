// Write a program to count and display total number of objects created to a class. (Hint: static members).

class Object {
    static int count; // Static variable to count objects

    Object() {
        count++; // Increment count each time an object is created
    }
}

public class ObjectCount7 {
    public static void main(String args[]) {
        // Creating four objects of the Object class
        Object shit = new Object();
        Object shit1 = new Object();
        Object shit2 = new Object();
        Object shit3 = new Object();

        // Printing the count of objects created
        System.out.println(Object.count);
    }
}
