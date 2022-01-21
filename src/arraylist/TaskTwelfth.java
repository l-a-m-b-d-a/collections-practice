package arraylist;

import java.util.Collections;
import java.util.List;

// Write a Java program to extract a portion of a array list
public class TaskTwelfth {
    public static void main(String[] args) {
        int index1, index2;
        index1 = (int)(Math.random() * 10);
        index2 = (int)(Math.random() * 10);
        if (index1 > index2) {
            index1 ^= index2;
            index2 ^= index1;
            index1 ^= index2;
        }
        List<String> list = OperationList.getList();

        System.out.println(list.subList(index1, index2));
    }
}
