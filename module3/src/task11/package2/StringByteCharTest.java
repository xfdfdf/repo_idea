package task11.package2;

public class StringByteCharTest {
    public static void main(String[] args) {
        String str1 = new String("world");
        System.out.println("str1 = " + str1);
        System.out.println("****************************");
        byte[] bArr = str1.getBytes();
        for(int i = 0;i < bArr.length;i++) {
            System.out.println("下标位置为 " + i + "的元素是：" + bArr[i]);
        }

        String str2 = new String(bArr);
        System.out.println(str2);


        char[] cArr = str2.toCharArray();
        for(int i = 0;i < cArr.length;i++) {
            System.out.println("下标位置为 " + i + "的元素是：" + cArr[i]);

        }
        String str3 = new String(cArr);
        System.out.println(str3);
    }
}
