package arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Write a Java program to iterate through all elements in a array list
public class TaskSecond {
    public static void main(String[] args) {
        // create list
        List<String> list = new ArrayList<>();
        // add color to list
        list.add("Green");
        list.add("Orange");
        list.add("Purple");
        // with iterator
        Iterator<String> it = list.listIterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
