package treeset;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class PracticeWithTreeSet {
    public static void main(String[] args) {
        Set<String> strings = new TreeSet<>();
        // Write a Java program to create a new tree set, add some colors (string) and print out the tree set
        strings.add("Red");
        strings.add("Black");
        strings.add("White");

        for (String string : strings) {
            System.out.println(string);
        }
        //Write a Java program to iterate through all elements in a tree set.

        Iterator<String> it = strings.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }
}
