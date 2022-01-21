package arraylist;

import java.util.Collections;
import java.util.List;

// Write a Java program to shuffle elements in a array list
public class TaskTenth {
    public static void main(String[] args) {
        List<String> list = OperationList.getList();

        OperationList.showList(list, "Before");
        Collections.shuffle(list);
        OperationList.showList(list, "After");
    }
}
