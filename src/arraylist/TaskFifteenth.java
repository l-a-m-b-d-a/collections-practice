package arraylist;

import java.util.Collections;
import java.util.List;

// Write a Java program to join two array lists
public class TaskFifteenth {
    public static void main(String[] args) {
        List<String> list1 = OperationList.getList();
        List<String> list2 = OperationList.getList();

        list1.addAll(list2);
    }
}
