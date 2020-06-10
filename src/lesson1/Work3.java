package lesson1;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

//3. 编程题 实现双色球抽奖游戏中奖号码的生成，中奖号码由 6 个红球号码和 1 个蓝球号码组成。 其中红球号码要求随机生成 6 个 1~33 之间不重复的随机号码。 其中蓝球号码要求随机生成 1 个 1~16 之间的随机号码。
public class Work3 {
    public static void main(String[] args) {
        String str = "红球号码是：";
        Set<Integer> set1 = new HashSet<>();
        Random random = new Random();
        //生成六个红球号码
        while(true) {

            int a = 1 + random.nextInt(33);
            set1.add(a);
            if(set1.size() == 6) {
                break;
            }


        }

        for(Integer i : set1) {
            str += i + " ";
        }
        str += "蓝球号码是：" + (1 + random.nextInt(16) );
        System.out.println("本期双色球中奖号码是 ： " + str);
    }
}
