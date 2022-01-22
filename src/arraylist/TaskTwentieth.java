package arraylist;

import java.util.ArrayList;

public class TaskTwentieth {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>(3);

        arrayList.add("Ali");
        arrayList.add("Rev");
        arrayList.add("Sio");

        arrayList.ensureCapacity(6);

        arrayList.add("Arme");
        arrayList.add("Armi");
        arrayList.add("Armu");

        for (String s : arrayList) {
            System.out.println(s);
        }
    }
}
