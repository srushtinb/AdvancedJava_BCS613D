/*Q1. Write a Java Program for Checking if a given string is null or contains only whitespace using user
defined function isNullOrEmpty(). */


public class Nullornot {
    
    public static boolean isNullOrEmpty(String input) {
        return input == null || input.trim().isEmpty();
    }

    public static void main(String[] args) {
        
        String s1 = null;
        String s2 = "   ";
        String s3 = "AIET";
        String s4 = "";

        System.out.println("s1: " + isNullOrEmpty(s1)); 
        System.out.println("s2: " + isNullOrEmpty(s2)); 
        System.out.println("s3: " + isNullOrEmpty(s3)); 
        System.out.println("s4: " + isNullOrEmpty(s4)); 
    }
}
