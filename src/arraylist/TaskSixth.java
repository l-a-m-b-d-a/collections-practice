package arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
// Write a Java program to remove the third element from a array list.
public class TaskSixth {
    public static void main(String[] args) {
        List<String> list = OperationList.getList();
        OperationList.showList(list, "Before");
        list.remove(3);
        OperationList.showList(list, "After");
        //((ArrayList<String>)list).trimToSize();
    }
}
