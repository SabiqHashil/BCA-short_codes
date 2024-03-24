/* 
    Write a Java Programming Code to Check given string is Anagram or Not.
    If the two strings are anagram to each other, then one string can be rearranged 
    to form the other string. For Example: abc and cba are anagram string.
*/

import java.util.*;


public class AnagramChecker5 {
    public static void main(String args[]) {
        // Create a Scanner object for input
        Scanner sc = new Scanner(System.in);

        // Read two strings from the user
        System.out.println("Enter the first string:");
        String S1 = sc.nextLine();
        System.out.println("Enter the second string:");
        String S2 = sc.nextLine();

        // Convert the strings to character arrays and remove spaces
        char string1[] = S1.replaceAll("\\s", "").toCharArray();
        char string2[] = S2.replaceAll("\\s", "").toCharArray();

        // Sort the character arrays
        Arrays.sort(string1);
        Arrays.sort(string2);

        // Check if the sorted arrays are equal (anagrams)
        if (Arrays.equals(string1, string2)) {
            System.out.println("The strings are Anagrams");
        } else {
            System.out.println("The strings are Not Anagrams");
        }

        // Close the Scanner object
        sc.close();
    }
}
