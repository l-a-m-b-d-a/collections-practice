package arraylist;

import java.util.ArrayList;
import java.util.List;

// Write a Java program to create a new array list, add some colors (string) and print out the collection
public class TaskFirst {
    public static void main(String[] args) {
        //create list
        List<String> list = new ArrayList<>();
        // add color to list
        list.add("Green");
        list.add("Orange");
        list.add("Purple");
        // cycle foreach
        for (String s : list) {
            System.out.println(s);
        }
    }
}
