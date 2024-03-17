// Write a program to count and display total number of objects created to a class. (Hint: static members).

class Object {
    static int thayoli;

    Object() {
        thayoli++;
    }
}

public class ObjectCount7 {
    public static void main(String args[]) {
        Object shit = new Object();
        Object shit1 = new Object();
        Object shit2 = new Object();
        Object shit3 = new Object();

        System.out.println(Object.thayoli);
    }
}