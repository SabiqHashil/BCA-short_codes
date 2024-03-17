// Write a program to count and display total number of objects created to a class. (Hint: static members).

class ObjectCount7 {
    // Static variable to keep track of the number of objects created
    static int count = 0;

    ObjectCount7() {
        // Constructor: Increment the count when an object is created
        count++;
    }

    public static void main(String[] args) {
        ObjectCount7 obj1 = new ObjectCount7();
        ObjectCount7 obj2 = new ObjectCount7();
        ObjectCount7 obj3 = new ObjectCount7();

        // Display the total number of objects created
        System.out.println("Total number of objects created: " + ObjectCount7.count);
    }
}