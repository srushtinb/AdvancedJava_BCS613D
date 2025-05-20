/*Write a java program for getting different colors through ArrayList interface and search whether
the color "Red" is available or not*/

import java.util.ArrayList;

public class SearchRed {
    public static void main(String[] args) {
        
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");

        // Search for the color "Red"
        if (colors.contains("Red")) {
            System.out.println("Red is in the list!");
        } else {
            System.out.println("Red is not in the list.");
        }
    }
}
