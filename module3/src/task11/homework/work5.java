package task11.homework;

import org.junit.Test;

import java.util.*;

public class work5 {
    //存放全部的牌
    private static Map<Integer,String> allPai  = new HashMap<>();
//    玩家1
    private static List<Integer> player1  = new ArrayList<>();
//    玩家2
    private static List<Integer> player2  = new ArrayList<>();
//    玩家3
    private static List<Integer> player3  = new ArrayList<>();
    //存储底牌
    private static List<Integer> diPai  = new ArrayList<>();

    public static void main(String[] args) {

        //牌的花色，黑桃♠、红心♥、梅花♣、方块♦
        String[] paiColor = new String[]{"♠", "♥", "♣", "♦"};
        //牌的大小
        String[] paiSize = new String[]{"2", "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3"};


        //将54张牌加入到allPai里面。同时排好根据编号顺序
//        先加入大王，小王
        int count = 1;
        allPai.put(count++,"大王");
        allPai.put(count++,"小王");
        for(int i = 0;i < paiSize.length;i++) {
            for(int j = 0;j < paiColor.length;j++) {
                allPai.put(count++,paiColor[j] + paiSize[i]);
            }
        }

        //将牌对应的键提取出来，进行打乱。
        Set<Integer> set = allPai.keySet();
        List<Integer> l1 = new ArrayList<>();
        for(int i : set) {
            l1.add(i);
        }


        //打乱牌
        Collections.shuffle(l1);
        System.out.println("l1 : " + l1);
        //发牌
        for(int i = 0;i < l1.size();i++) {
            if(i >= 51) {
                diPai.add(l1.get(i));
            } else if( i % 3 == 1) {
                player1.add(l1.get(i));
            }else if( i % 3 == 2) {
                player2.add(l1.get(i));
            }else if( i % 3 == 0) {
                player3.add(l1.get(i));
            }
        }


        //将玩家的牌排好序
        Collections.sort(player1);
        Collections.sort(player2);
        Collections.sort(player3);
        System.out.println("player1 = " + player1);
        System.out.println("player2 = " + player2);
        System.out.println("player3 = " + player3);

        //打印牌
        showPai("底牌",diPai);
        showPai("玩家1",player1);
        showPai("玩家2",player2);
        showPai("玩家3",player3);

    }

//    打印牌的方法
    public  static void showPai(String name,List<Integer> list){
        System.out.print(name + "中的牌是 ： ");
        for(int i = 0;i < list.size();i++) {
            if(i == list.size() - 1){
                System.out.print(allPai.get(list.get(i)) );

            } else {
                System.out.print(allPai.get(list.get(i)) + "  ");

            }
        }
        System.out.println();

    }
}
