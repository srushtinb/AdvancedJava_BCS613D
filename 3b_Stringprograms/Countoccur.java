public class Countoccur {

    // User-defined function to count occurrences of a substring
    public static int countOccurrences(String mainStr, String subStr) {
        if (mainStr == null || subStr == null || subStr.isEmpty()) {
            return 0;
        }

        int count = 0;
        int index = 0;

        // Keep searching for the substring from the current index
        while ((index = mainStr.indexOf(subStr, index)) != -1) {
            count++;
            index++;  // Move forward by 1 to allow overlapping substrings
        }

        return count;
    }

    public static void main(String[] args) {
        String mainString = "AIETAIETAIET";
        String subString = "AIET";

        int occurrences = countOccurrences(mainString, subString);

        System.out.println("The substring \"" + subString + "\" appears " + occurrences + " times.");
    }
}
