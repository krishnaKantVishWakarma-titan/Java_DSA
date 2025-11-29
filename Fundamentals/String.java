package org.example;

public class Main {
    public static void main(String[] args) {
        // Strings
        // A String variable contains a collection of characters surrounded by double quotes ("").
        // A String is immutable, meaning once created, you cannot change it.
        // Whenever you modify a String, Java creates a new object in memory.
        String greeting = "Hello";

        // Length of the string
        System.out.println("Length of the string: " + greeting.length());

        String txt = "Hello World";
        // Upper-case and Lower-case
        System.out.println(txt.toUpperCase());
        System.out.println(txt.toLowerCase());

        // Convert string to Array
        char[] charArray = txt.toCharArray();

        // Find a substring using start and end indexes
        System.out.println(txt.substring(2, 6));

        // Find a character in a string
        System.out.println(txt.indexOf("orl")); // If found then return (index-1) and if not found then return -1;

        // Check if the character is present in the string or not
        System.out.println(txt.contains("orl")); // If found then return true and if not found then return false;

        // Find a character by index
        System.out.println(txt.charAt(2));

        // Compare two string
        String txt1 = "Hello";
        String txt2 = "Hello";

        System.out.println(txt.equals(txt1));
        System.out.println(txt2.equals(txt1));

        // Concatenation - two strings
        System.out.println(txt + " " + txt1);

        // Concatenation by method
        System.out.println(txt.concat(txt1)); // Draw-back is space between two string are not their

        // Removing white spaces from both sides from the string
        String txt4 = "     Hello World         ";
        System.out.println("Before removing: " + txt4);
        System.out.println("After removing: "+ txt4.trim());

        // ############################################################################################
        // StringBuilder is mutable, meaning you can change the same object without creating new ones.
        // Faster than String
        // Best for loops, concatenation, editing strings
        System.out.println("String builder #############################");
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        System.out.println(sb);

        // Insertion by Index
        sb.insert(0, "I love ");
        System.out.println(sb);

        // Deletion: By given index range
        sb.delete(2, 7);
        System.out.println(sb);

        // Reverse a string
        sb.reverse();
        System.out.println(sb);
        sb.reverse();

        // StringBuffer is similar to StringBuilder but
        // StringBuffer is thread-safe.
        // StringBuilder is not thread-safe.

        // Convert String to StringBuilder and vice-versa.

        // String → StringBuilder
        String str = "Welcome";
        StringBuilder sbb = new StringBuilder(str);
        System.out.println(sbb);

        // Modify using StringBuilder
        sbb.append(" to Java!");
        System.out.println(sbb);

        // StringBuilder → String
        String finalString = sbb.toString();

        System.out.println(finalString);

    }
}
