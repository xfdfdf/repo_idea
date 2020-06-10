package package2;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionTest {
    public static void main(String[] args) {
        //以下都是不可变的实例
        List<String> list = List.of("1","2","3","2");
        System.out.println(list);
//        list.add("12"); 报错：UnsupportedOperationException
        System.out.println("********************");
        Set<String> set = Set.of("12","124","1224","11","122");
        System.out.println(set);
//        set.add("124234");报错：UnsupportedOperationException
        System.out.println("********************");

        Map<Integer,String> map = Map.of(1,"23",2,"22");
        System.out.println(map);
//        map.put(3,"123");报错：UnsupportedOperationException
        System.out.println(map);
    }
}
