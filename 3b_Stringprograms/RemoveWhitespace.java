public class RemoveWhitespace {

    public static String removeWhitespace(String input) {
        if (input == null) {
            return null;
        }

        StringBuilder result = new StringBuilder();

        // Iterate through each character and skip whitespace
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            // Check manually for whitespace characters
            if (ch != ' ' && ch != '\t' && ch != '\n' && ch != '\r') {
                result.append(ch);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String input = "  Java\tis \tfun";
        String output = removeWhitespace(input);

        System.out.println("Original: \"" + input + "\"");
        System.out.println("Without Whitespace: \"" + output + "\"");
    }
}
