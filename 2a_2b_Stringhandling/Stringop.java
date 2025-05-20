/* 2 a. Develop a java program for performing various string operations with different string
handling functions directed as follows
String Creation and Basic Operations, Length and Character Access, String Comparison, String
Searching, Substring Operations , String Modification, Whitespace Handling, String
Concatenation, String Splitting, StringBuilder Demo, String Formatting , Validate Email with
contains( ) and startsWith() and endsWith()*/



public class Stringop{
    public static void main(String[] args) {
        // String Creation and Basic Operations
        String str1 = "Hello, World!";
        String str2 = new String("Java Programming");

        System.out.println("String Creation:");
        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);

        // Length and Character Access
        System.out.println("\nLength and Character Access:");
        System.out.println("Length of str1: " + str1.length());
        System.out.println("Character at position 1 in str1: " + str1.charAt(1));

        // String Comparison
        System.out.println("\nString Comparison:");
        String str3 = "Hello";
        String str4 = "hello";
        System.out.println("str3 equals str4: " + str3.equals(str4));  // Case-sensitive comparison
        System.out.println("str3 equalsIgnoreCase str4: " + str3.equalsIgnoreCase(str4));  // Case-insensitive comparison

        // String Searching
        System.out.println("\nString Searching:");
        String searchString = "World";
        System.out.println("Does str1 contain 'World': " + str1.contains(searchString));

        // Substring Operations
        System.out.println("\nSubstring Operations:");
        String substring = str1.substring(7, 12);  // Extracts "World"
        System.out.println("Substring from str1 (index 7 to 12): " + substring);

        // String Modification
        System.out.println("\nString Modification:");
        String modifiedStr = str2.replace("Java", "C++");
        System.out.println("Modified str2 (replace 'Java' with 'C++'): " + modifiedStr);

        // Whitespace Handling
        System.out.println("\nWhitespace Handling:");
        String strWithSpaces = "  Java Programming  ";
        System.out.println("Original: '" + strWithSpaces + "'");
        System.out.println("Trimmed: '" + strWithSpaces.trim() + "'");

        // String Concatenation
        System.out.println("\nString Concatenation:");
        String concatenatedStr = str1.concat(" Welcome to Java!");
        System.out.println("Concatenated string: " + concatenatedStr);

        // String Splitting
        System.out.println("\nString Splitting:");
        String[] words = str1.split(" ");
        System.out.println("Words in str1:");
        for (String word : words) {
            System.out.println(word);
        }

        // StringBuilder Demo
        System.out.println("\nStringBuilder Demo:");
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        System.out.println("StringBuilder after append: " + sb.toString());
        sb.insert(6, " Java");
        System.out.println("StringBuilder after insert: " + sb.toString());
        sb.reverse();
        System.out.println("StringBuilder after reverse: " + sb.toString());

        // String Formatting
        System.out.println("\nString Formatting:");
        String formattedStr = String.format("The value of PI is approximately %.2f", Math.PI);
        System.out.println(formattedStr);

        // Validate Email using contains(), startsWith(), and endsWith()
        System.out.println("\nValidate Email:");
        String email = "example@domain.com";
        if (email.contains("@") && email.endsWith(".com") && email.startsWith("e")) {
            System.out.println("The email '" + email + "' is valid based on the criteria.");
        } else {
            System.out.println("The email '" + email + "' is invalid.");
        }
    }
}

