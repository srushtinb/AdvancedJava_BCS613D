
/*1a: ArrayList- Develop a Java program for adding elements [Apple, Banana, Orange] into an ArrayList
and a LinkedList to perform the following operations with different functions directed as
follows   : 1. Adding elements, 2. Adding element at specific index, 3. Adding multiple elements, 4.
Accessing elements,5. Updating elements, 6. Removing elements, 7. Searching elements, 8. List
size, 9. Iterating over list, 10. Using Iterator, 11. Sorting, 12. Sublist, 13. Clearing the list*/

import java.util.*;

public class ArrayListDemo{
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();

        // 1. Adding elements
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Orange");
        System.out.println("1. After adding elements: " + arrayList);

        // 2. Adding element at specific index
        arrayList.add(1, "Grapes");
        System.out.println("2. After adding 'Grapes' at index 1: " + arrayList);

        // 3. Adding multiple elements
        List<String> moreFruits = Arrays.asList("Mango", "Pineapple");
        arrayList.addAll(moreFruits);
        System.out.println("3. After adding multiple elements: " + arrayList);

        // 4. Accessing elements
        System.out.println("4. Element at index 2: " + arrayList.get(2));

        // 5. Updating elements
        arrayList.set(2, "Kiwi");
        System.out.println("5. After updating index 2 to 'Kiwi': " + arrayList);

        // 6. Removing elements
        arrayList.remove("Banana");
        arrayList.remove(0);
        System.out.println("6. After removing 'Banana' and first element: " + arrayList);

        // 7. Searching elements
        String search = "Mango";
        if (arrayList.contains(search)) {
            System.out.println("7. '" + search + "' found at index " + arrayList.indexOf(search));
        } else {
            System.out.println("7. '" + search + "' not found.");
        }

        // 8. List size
        System.out.println("8. List size: " + arrayList.size());

        // 9. Iterating over list using for-each
        System.out.print("9. Iterating using for-each: ");
        for (String fruit : arrayList) {
            System.out.print(fruit + " ");
        }
        System.out.println();

        // 10. Using Iterator
        System.out.print("10. Iterating using Iterator: ");
        Iterator<String> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        // 11. Sorting
        Collections.sort(arrayList);
        System.out.println("11. Sorted list: " + arrayList);

        // 12. Sublist
        if (arrayList.size() >= 3) {
            List<String> subList = arrayList.subList(1, 3);
            System.out.println("12. Sublist (1 to 3): " + subList);
        } else {
            System.out.println("12. Sublist not created due to insufficient elements.");
        }

        // 13. Clearing the list
        arrayList.clear();
        System.out.println("13. After clearing the list: " + arrayList);
    }
}
