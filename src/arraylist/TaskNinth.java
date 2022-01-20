package arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Write a Java program to copy one array list into another.
public class TaskNinth {
    public static void main(String[] args) {
        List<String> list = OperationList.getList();
        List<String> list1 = new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            list1.add("12");
        }
        Collections.copy(list1, list);
        OperationList.showList(list1, "Result");
    }
}
