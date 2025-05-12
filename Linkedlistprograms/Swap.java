import java.util.Collections;
import java.util.LinkedList;

public class Swap{
    public static void main(String[] args) {
        LinkedList<String> colors = new LinkedList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");

        System.out.println("Original LinkedList: " + colors);

        // Swap the first and third elements using Collections.swap()
        Collections.swap(colors, 0, 2); // Swapping elements at index 0 and 2

        System.out.println("LinkedList after swapping first and third elements: " + colors);
    }
}
