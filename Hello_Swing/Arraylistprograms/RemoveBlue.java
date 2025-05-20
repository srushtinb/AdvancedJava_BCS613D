import java.util.ArrayList;

public class RemoveBlue {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();

       
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Purple");
        System.out.println("Original Color List: " + colors);

        // Remove the second element
        if (colors.size() > 1) {
            String removedColor = colors.remove(1);
            System.out.println("Removed second element : " + removedColor);
        }

        // Remove the color "Blue" 
        boolean removedBlue = colors.remove("Blue");
        if (removedBlue) {
            System.out.println("Removed the color: Blue");
        } else {
            System.out.println("Color Blue not found in the list.");
        }

        System.out.println("Final Color List: " + colors);
    }
}
