import java.util.ArrayList;
import java.util.List;

public class SubListColors {
    public static void main(String[] args) {

        ArrayList<String> colors = new ArrayList<>();

        colors.add("Red");    
        colors.add("Green");   
        colors.add("Blue");    
        colors.add("Yellow");  
        colors.add("Purple");  

        System.out.println("Original Color List: " + colors);

        // Extract the 1st and 2nd elements 
        List<String> subColors = colors.subList(0, 2); // start index inclusive, end index exclusive

       
        System.out.println("Extracted Colors (1st and 2nd): " + subColors);
    }
}
