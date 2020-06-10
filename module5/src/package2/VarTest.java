package package2;

import org.junit.Test;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class VarTest {

    public static void main(String[] args) {

        // 由初始值可以推断出变量的类型，因此可以使用var取代
        //int num = 10;
        var num = 10;
        //List<Integer> list = new LinkedList<>();
        var list = new LinkedList<Integer>();
        list.add(10);

        for (var v : list) {
            System.out.println(v);
        }

        for (var i = 0; i < 10; i++) {}

        var list1 = new LinkedList<Integer>();
        list1.add(12);
        list1.add(121);
        for(var i : list1) {
            System.out.println(i);
        }
        int[][] a = new int[1][];
    }
    @Test
    public void test() {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入：");
        input.next();
        input.nextLine();
        System.out.println("as");
    }
}
