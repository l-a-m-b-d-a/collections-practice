package arraylist;

import java.util.List;

// write a java program with method which delete all elements in list
public class TaskSixteenth {
    public static void main(String[] args) {
        List<String> list = OperationList.getList();
        OperationList.showList(list, "List");

        list.removeAll(list);

        OperationList.showList(list, "List");
    }
}
