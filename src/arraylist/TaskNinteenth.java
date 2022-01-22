package arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// write a java program whit trim size
public class TaskNinteenth {
    public static void main(String[] args) {
        List<String> list = OperationList.getList();
        List<String> list1 = OperationList.getList();
        list.removeAll(list1);
        ((ArrayList<String>)list).trimToSize();
    }
}
