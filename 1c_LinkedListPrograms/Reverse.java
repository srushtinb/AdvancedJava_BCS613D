/*Write a Java program to iterate a linked list in reverse order (using
objlist.descendingIterator())*/



import java.util.Iterator;
import java.util.LinkedList;

public class Reverse {
    public static void main(String[] args) {
        LinkedList<String> colors = new LinkedList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");

        // Get a descending iterator
        Iterator<String> reverseIterator = colors.descendingIterator();

        System.out.println("LinkedList in reverse order:");
        while (reverseIterator.hasNext()) {
            System.out.println(reverseIterator.next());
        }
    }
}
