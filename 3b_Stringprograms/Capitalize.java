public class Capitalize{

    public static String capitalizeWords(String input) {
        if (input == null || input.length() == 0) {
            return input;
        }

        StringBuilder result = new StringBuilder();
        boolean capitalizeNext = true; // Flag to capitalize first character

        for (int i = 0; i < input.length(); i++) {
            char current = input.charAt(i);

            // If current character is a space, next char should be capitalized
            if (Character.isWhitespace(current)) {
                result.append(current);
                capitalizeNext = true;
            } else if (capitalizeNext) {
                result.append(Character.toUpperCase(current));
                capitalizeNext = false;
            } else {
                result.append(current);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String sentence = "java is fun and powerful";
        String capitalized = capitalizeWords(sentence);

        System.out.println("Original: " + sentence);
        System.out.println("Capitalized: " + capitalized);
    }
}
