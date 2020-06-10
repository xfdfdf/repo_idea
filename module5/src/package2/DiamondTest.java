package package2;

import java.util.Comparator;
import java.util.Vector;

public class DiamondTest {
    static final void ss(){

    }

    public static void main(String[] args) {

        if(-0.0 == 0.0) {
            System.out.println("hao");
        }
        //钻石操作符：<>，new的对象里面的<>类型可以省去不写
        Comparator<Integer> comparator = new Comparator<>(){

            @Override
            public int compare(Integer o1, Integer o2) {
                return 0;
            }
        };
    }
}
