/*Write a java program for getting different colors through ArrayList interface and delete nth
element from the ArrayList object by using remove by index*/



import java.util.ArrayList;
import java.util.Scanner;

public class Removenth {
    public static void main(String[] args) {
      
        ArrayList<String> colors = new ArrayList<>();

        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Purple");

        System.out.println("Original Color List: " + colors);

        // Get user input for the position (n-th element) to remove
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the position (1-based index) of the element to delete: ");
        int n = scanner.nextInt();

        // Check if the input is valid
        if (n > 0 && n <= colors.size()) {
            String removedColor = colors.remove(n - 1); // convert to 0-based index
            System.out.println("Removed color: " + removedColor);
        } else {
            System.out.println("Invalid position. Please enter a value between 1 and " + colors.size());
        }

        System.out.println("Updated Color List: " + colors);

        scanner.close();
    }
}
