package treeset;

import java.util.Collections;
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

        // Write a Java program to add all the elements of a specified tree set to another tree set
        Set<String> set = new TreeSet<>(strings);
        for (String s : set) {
            System.out.println(s);
        }

        // Reverse output
        it = ((TreeSet<String>)set).descendingIterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }

        // Write a Java program to get the first (lowest) key and the last (highest) key currently in a map
        TreeSet<Integer> task5 = new TreeSet<>();
        task5.add(11);
        task5.add(18);
        task5.add(9);
        task5.add(3);
        task5.add(10);
        task5.add(19);
        task5.add(17);
        System.out.println(task5.first());
        System.out.println(task5.last());


    }
}
