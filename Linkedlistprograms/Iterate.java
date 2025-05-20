import java.util.LinkedList;
import java.util.ListIterator;

public class Iterate{
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Red");
        list.add("Green");
        list.add("Blue");
        list.add("Yellow");

        ListIterator<String> iterator = list.listIterator(1); // Start from index 1 (2nd element)

        System.out.println("Iterating from 2nd position:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
