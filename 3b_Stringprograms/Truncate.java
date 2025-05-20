/*Write a Java Program for Shortening a string to a specified length and adds an ellipsis using user
defined function truncate() */


public class Truncate{
    public static void main(String[] args) {
        String input = "This is a long sentence.";
        int maxLength = 10;
        System.out.println("Truncated: " + truncate(input, maxLength));
    }

    public static String truncate(String str, int maxLength) {
        if (str.length() <= maxLength) {
            return str;
        } else {
            return str.substring(0, maxLength) + "...";
        }
    }
}