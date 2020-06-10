package task11.homework;

import java.util.HashMap;
import java.util.Map;

/**
 * 作业3  统计字符串出现的个数
 */
public class work3 {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap();
        String str = "123,456,789,123,456";
        String[] strings = str.split(",");
        for(int i = 0;i < strings.length;i++) {
            if(map.isEmpty()) {
                map.put(strings[i],1);
            } else {
                if(map.containsKey(strings[i])) {
                    map.put(strings[i],map.get(strings[i]) + 1);
                } else {
                    map.put(strings[i],1);
                }
            }
        }

        for(String s : map.keySet()) {
            System.out.println(s + " 出现了 " + map.get(s) + " 次 ");
        }
    }
}
