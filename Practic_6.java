import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Practic_6 {
    public static void main(String[] args) {
        ArrayList<Integer> List = new ArrayList<Integer>(25);
        for (int i = 0; i < 25; i++) {
            List.add((int) (Math.random() * 10));
        }

        HashMap<Integer, Integer> Unique = new HashMap<>();
        Set<Integer> UniqueSet = new HashSet<>();
        for (int i = 0; i < List.size(); i++) {
            UniqueSet.add(List.get(i));
        }

        for (int value : UniqueSet) {
            Unique.put(List.indexOf(value), value);
        }
        System.out.println("List:" + List);
        System.out.println("Set:" + UniqueSet + " number of unique element:" + UniqueSet.size());
        System.out.println("Map:" + Unique);
    }
}
