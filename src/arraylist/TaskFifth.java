package arraylist;

import java.util.List;

// Write a Java program to update specific array element by given element
public class TaskFifth {
    public static void main(String[] args) {
    List<String> list = OperationList.getList();

    int index = (int)(Math.random() * 10);

    System.out.println("\nBefore\n");
    for (String s : list) {
        System.out.println(s);
    }

    list.set(index, "WTF");

    System.out.println("\nAfter\n");
    for (String s : list) {
        System.out.println(s);
    }
}
}
