package task11.package1;

public class CharacterTest {
    public static void main(String[] args) {
        Character ca1 = Character.valueOf('c');
        System.out.println("ca1 = " + ca1);

        char c1 = ca1.charValue();
        System.out.println("c1 = " + c1);

        System.out.println("**************************");
        Character ca2 = 'b';
        char c2 = ca2;
        System.out.println("ca2 = " + ca2);
        System.out.println("c2 = " + c2);
        System.out.println("***************************");
        System.out.println(Character.isUpperCase(c2));
        System.out.println(Character.isLowerCase(c2));
    }
}
