package arraylist;

import java.util.Collections;
import java.util.List;

public class TaskEleventh {
    public static void main(String[] args) {
        List<String> list = OperationList.getList();

        OperationList.showList(list, "Before");
        Collections.reverse(list);
        OperationList.showList(list, "After");
    }
}
