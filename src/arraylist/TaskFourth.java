package arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//  Write a Java program to retrieve an element (at a specified index) from a given array list
public class TaskFourth {
    public static void main(String[] args) {
        int index;
        int size = 10;
        Scanner scanner = new Scanner(System.in);
        String[] colors = new String[] {"Black", "Red", "White", "Orange", "Black",
                "Green", "Purple", "Blue", "Aqua", "White"};
        System.out.println("Input index");
        index = scanner.nextInt();
        // default capacity 10 elements
        List<String> list = new ArrayList<>();
        // initialize arrayList
        for (int i = 0; i < size; i++) {
            list.add(0, colors[(int)(Math.random() * 10)]);
        }
        if (!(index <= 0 || index >= list.size())) {
            System.out.println(list.get(index - 1));
        } else {
            System.out.println("Tyty");
        }
    }
}
