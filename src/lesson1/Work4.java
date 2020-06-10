package lesson1;

import java.util.Arrays;

//4. 编程题 自定义数组扩容规则，当已存储元素数量达到总容量的 80%时，扩容 1.5 倍。 例如，总容量是 10，当输入第 8 个元素时，数组进行扩容，容量从 10 变 15。
public class Work4 {
    public static void main(String[] args) {

        MyArrays<String> myarrays = new MyArrays<>();
        myarrays.insert("1");
        System.out.println(myarrays.length());
        myarrays.insert("1");
        myarrays.insert("1");
        myarrays.insert("1");
        myarrays.insert("1");
        myarrays.insert("1");
        myarrays.insert("1");


        myarrays.insert("1");
        System.out.println(myarrays.length());
        myarrays.insert("1");
        System.out.println(myarrays.length());
        myarrays.insert("1");
        System.out.println(myarrays.length());
        myarrays.insert("1");
        System.out.println(myarrays.length());
        myarrays.insert("1");
        myarrays.insert("1");
        myarrays.insert("1");
        myarrays.insert("1");
        myarrays.insert("1");
        myarrays.insert("1");
        myarrays.insert("1");
        myarrays.insert("1");
        myarrays.insert("1");
        myarrays.insert("1");
        myarrays.insert("1");
        myarrays.insert("1");
        myarrays.insert("1");
        myarrays.insert("1");
        myarrays.insert("1");
        myarrays.insert("1");
        myarrays.insert("1");
        myarrays.insert("1");
        myarrays.insert("1");
        myarrays.insert("1");
        myarrays.insert("1");
        myarrays.insert("1");
        myarrays.insert("1");
        myarrays.insert("1");
        myarrays.insert("1");
        myarrays.insert("1");
        myarrays.insert("1");
        myarrays.insert("1");
        myarrays.insert("1");
        myarrays.insert("1");
        myarrays.insert("1");
        myarrays.insert("1");
        myarrays.insert("1");
        myarrays.insert("1");
        myarrays.insert("1");
        myarrays.insert("1");
        myarrays.insert("1");
        myarrays.insert("1");
        myarrays.insert("1");
        myarrays.insert("1");
        myarrays.insert("1");
        System.out.println(myarrays.length());
        System.out.println(myarrays.getCapacity());

    }
}


class MyArrays<T> {

    private T[] items;
    private int capacity;
    public MyArrays() {
        items = (T[])new Object[10];
        capacity = 0;
    }

    public void insert(T t) {
        items[capacity++] = t;

        if(capacity >= 0.8 * items.length) {
            revise(items);
        }
    }

    //获取数组的长度
    public int length() {
        return items.length;
    }

    //获取数组的存储的元素
    public int getCapacity() {
        return capacity;
    }

    //对于数组进行扩容
    private void revise(T[] items) {
        T[] newArrays = (T[]) new Object[(int) (items.length * 1.5)];
        for(int i = 0;i < items.length;i++) {
            newArrays[i] = items[i];
        }

        this.items = newArrays;
    }


}