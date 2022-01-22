package arraylist;

import java.text.CollationElementIterator;
import java.util.Collections;
import java.util.List;

// Write a Java program of swap two elements in an array list
public class TaskFourteenth {
    public static void main(String[] args) {
        int index1, index2;
        List<String> list = OperationList.getList();
        index1 = (int)(Math.random() * 10);
        index2 = (int)(Math.random() * 10);
        OperationList.showList(list, "Before");
        Collections.swap(list, index1, index2);
        OperationList.showList(list, "After");

    }
}

