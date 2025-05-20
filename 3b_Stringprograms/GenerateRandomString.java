/*Write a Java Program for Creating a random string of a specified length using user defined
function generateRandomString() */





import java.util.Random;

public class GenerateRandomString {
    public static void main(String[] args) {
        int length = 8;
        System.out.println("Random string: " + generateRandomString(length));
    }

    public static String generateRandomString(int length) {
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random rand = new Random();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < length; i++) {
            sb.append(chars.charAt(rand.nextInt(chars.length())));
        }

        return sb.toString();
    }
}