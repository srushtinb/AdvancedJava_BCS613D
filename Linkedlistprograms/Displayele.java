/*Write a Java program to display elements and their positions in a linked list ( using
l_listobj.get(p) )*/

import java.util.LinkedList;

public class Displayele{
    public static void main(String[] args) {

        LinkedList<String> colors = new LinkedList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");

        // Display elements with their positions
        System.out.println("Elements with their positions:");
        for (int i = 0; i < colors.size(); i++) {
            System.out.println("Position " + i + ": " + colors.get(i));
        }
    }
}
