package hashset;

import java.util.HashSet;
import java.util.List;
// Write a Java program to convert a hash set to a List/ArrayList
public class PracticeWithHashSet {
    public static void main(String[] args) {
        Human h = new Human.BuilderHuman().setAge(12).setName("Alex").setSurname("Dyuba").buildHuman();
        HashSet<Human> humanSet = new HashSet<>();
        humanSet.add(h);
        List<Human> humanList = humanSet.stream().toList();

        for (Human human : humanList) {
            System.out.println(human);
        }
    }
}
