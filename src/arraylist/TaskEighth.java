package arraylist;

import java.util.Collections;
import java.util.List;

// Write a Java program to sort a given array list
public class TaskEighth {
    public static void main(String[] args) {
        List<String> list = OperationList.getList();
        OperationList.showList(list, "Before");

        Collections.sort(list);
        OperationList.showList(list, "After");
    }
}
