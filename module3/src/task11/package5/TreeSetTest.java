package task11.package5;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String[] args) {
        Set<String> set = new TreeSet<>();
        set.add("bb");
        set.add("cc");
        set.add("aa");
        System.out.println(set);


        Comparator<Student> comparator = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName() .compareTo( o2.getName());
            }
        };

        Comparator<Student> comparator1 = (Student o1, Student o2) -> {
            return o1.getAge() - o2.getAge();
        };
        System.out.println("******************************");
        Set<Student> s2 = new TreeSet<>(comparator1);
        s2.add(new Student("zhangfei",18));
        s2.add(new Student("lisi",28));
        s2.add(new Student("wangwu",38));
        s2.add(new Student("wangwu",38));
        s2.add(new Student("wangwu",37));
        System.out.println(s2);
    }
}
