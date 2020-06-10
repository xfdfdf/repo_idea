package task11.package5;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class HashSetTest {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        Set<String> set1 = new LinkedHashSet<>();
        
        set.add("two");
        set.add("one");
        set.add("three");
        set.add("one");

        set1.add("two");
        set1.add("one");
        set1.add("three");
        set1.add("one");
        System.out.println(set);
        System.out.println(set1);
    }
}
