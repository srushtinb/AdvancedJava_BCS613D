/*Write a Java program to insert the specified element at the end of a linked list.( using
l_listobj.offerLast("Pink"))*/


import java.util.LinkedList;

public class InsertPink{
    public static void main(String[] args) {
        LinkedList<String> colors = new LinkedList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");

        System.out.println("Original LinkedList: " + colors);

        // Insert "Pink" at the end using offerLast()
        colors.offerLast("Pink");

        System.out.println("Updated LinkedList after offerLast: " + colors);
    }
}
