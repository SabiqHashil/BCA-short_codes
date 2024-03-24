// Create a class Student to read and display the student details. 
// Create another class mark inherit from Student to read marks of 5 subjects and find total and average. 
// Write a Java program to display the result of a student.

import java.util.*;

// Define a class named Student
class Student {
    // Instance variables
    String name, place;
    int age;

    // Method to read details of a student
    public void readDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name:");
        name = sc.nextLine();
        System.out.println("Enter place:");
        place = sc.nextLine();
        System.out.println("Enter age:");
        age = sc.nextInt();
        sc.close(); 
    }

    // Method to display details of a student
    public void displayDetails() {
        // Print student details
        System.out.println("Name: " + name + "\nPlace: " + place + "\nAge: " + age);
    }
}

// Define a class named Mark which extends Student
class Mark extends Student {
    // Additional instance variables
    int[] sub = new int[5]; // Array to store subject marks
    float avg, total; // Variables for average and total marks

    // Method to read marks of 5 subjects
    public void readMarks() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks for 5 subjects:");
        for (int i = 0; i < 5; i++) {
            int temp = sc.nextInt(); // Read marks for each subject
            sub[i] = temp; // Store marks in the array
            total += temp; // Calculate total marks
        }

        avg = total / 5; // Calculate average marks

        // Print total and average marks
        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + avg);
        sc.close();
    }
}

// Main class
class Main {
    public static void main(String args[]) {
        Mark m = new Mark(); // Create an object of Mark class

        m.readDetails(); // Call readDetails method to read student details
        m.displayDetails(); // Call displayDetails method to display student details
        m.readMarks(); // Call readMarks method to read subject marks
    }
}
