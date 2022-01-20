package arraylist;

import java.util.ArrayList;
import java.util.List;

public class
OperationList {
    private static int size = 10;
    private static String[] colors = new String[] {"Black", "Red", "White", "Orange", "Black",
            "Green", "Purple", "Blue", "Aqua", "White"};

    public static List<String> getList() {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add(colors[(int) (Math.random() * 10)]);
        }
        return list;
    }

    public static void showList(List<String> list, String word) {
        System.out.println('\n' + word + '\n');
        for (String s : list) {
            System.out.println(s);
        }
    }
}

