package arraylist;

import java.util.Collections;
import java.util.List;
// Write a Java program to compare two array lists
public class TaskThirteenth {
    public static void main(String[] args) {
        List<String> list1 = OperationList.getList();
        List<String> list2 = OperationList.getList();

        for (String s : list2) {
            System.out.println(list1.contains(s));
        }
     }
}
