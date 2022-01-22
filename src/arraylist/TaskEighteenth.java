package arraylist;

import java.util.ArrayList;
import java.util.List;

// write a java program to clone an array list to another array list
public class TaskEighteenth {
    public static void main(String[] args) {
        List<String> list1 = OperationList.getList();

        OperationList.showList(list1, "List 1");

        List<String> list2 = (List<String>) ((ArrayList<String>)list1).clone();

        OperationList.showList(list2, "List 2");
    }
}
