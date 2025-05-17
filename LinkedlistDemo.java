import java.util.*;

public class LinkedlistDemo {
    public static void main(String[] args) {
        List<String> linkedList = new LinkedList<>();

        // 1. Adding elements
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");
        System.out.println("1. After adding elements: " + linkedList);

        // 2. Adding element at specific index
        linkedList.add(1, "Grapes");
        System.out.println("2. After adding 'Grapes' at index 1: " + linkedList);

        // 3. Adding multiple elements
        List<String> moreFruits = Arrays.asList("Mango", "Pineapple");
        linkedList.addAll(moreFruits);
        System.out.println("3. After adding multiple elements: " + linkedList);

        // 4. Accessing elements
        System.out.println("4. Element at index 2: " + linkedList.get(2));

        // 5. Updating elements
        linkedList.set(2, "Kiwi");
        System.out.println("5. After updating index 2 to 'Kiwi': " + linkedList);

        // 6. Removing elements
        linkedList.remove("Banana");
        linkedList.remove(0);
        System.out.println("6. After removing 'Banana' and first element: " + linkedList);

        // 7. Searching elements
        String search = "Mango";
        if (linkedList.contains(search)) {
            System.out.println("7. '" + search + "' found at index " + linkedList.indexOf(search));
        } else {
            System.out.println("7. '" + search + "' not found.");
        }

        // 8. List size
        System.out.println("8. List size: " + linkedList.size());

        // 9. Iterating over list using for-each
        System.out.print("9. Iterating using for-each: ");
        for (String fruit : linkedList) {
            System.out.print(fruit + " ");
        }
        System.out.println();

        // 10. Using Iterator
        System.out.print("10. Iterating using Iterator: ");
        Iterator<String> iterator = linkedList.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        // 11. Sorting
        Collections.sort(linkedList);
        System.out.println("11. Sorted list: " + linkedList);

        // 12. Sublist
        if (linkedList.size() >= 3) {
            List<String> subList = linkedList.subList(1, 3);
            System.out.println("12. Sublist (1 to 3): " + subList);
        } else {
            System.out.println("12. Sublist not created due to insufficient elements.");
        }

        // 13. Clearing the list
        linkedList.clear();
        System.out.println("13. After clearing the list: " + linkedList);
    }
}
