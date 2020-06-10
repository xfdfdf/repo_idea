package task11.package1;

public class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student(1001,"张飞");
        Student student2 = new Student(1001,"hello");
        Student student3 = new Student(1003,"hello");
        boolean flag = student2.equals(student3);
        System.out.println(flag);
        System.out.println(student2.hashCode());
        System.out.println(student3.hashCode());
        //System.out.println(flag);
        //System.out.println(student1 == student2);
        //System.out.println(student1.hashCode());
        //System.out.println(student2.hashCode());
        //System.out.println(student1);
        //System.out.println(student2);
        //System.out.println(student1.toString());
        //System.out.println(student2.toString());
        //System.out.println(student3.hashCode());
        //System.out.println("hello".hashCode()  + 12 * 31);



    }
}
