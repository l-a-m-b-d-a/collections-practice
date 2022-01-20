package arraylist;

import jdk.dynalink.linker.LinkerServices;

import java.util.ArrayList;
import java.util.List;

// Write a Java program to insert an element into the array list at the first position.
public class TaskThird {
    public static void main(String[] args) {
        String[] colors = new String[] {"Black", "Red", "White", "Orange", "Black",
                "Green", "Purple", "Blue", "Aqua", "White"};
        int size = 10;
        // default capacity 10 elements
        List<String> list = new ArrayList<>();
        // initialize arrayList
        for (int i = 0; i < size; i++) {
            list.add(0, colors[(int)(Math.random() * 10)]);
        }
        // show result 'arrayList.for useful hot key'
        for (String s : list) {
            System.out.println(s);
        }
    }
}
