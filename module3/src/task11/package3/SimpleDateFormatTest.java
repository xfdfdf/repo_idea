package task11.package3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest {
    public static void main(String[] args) {
        Date d1= new Date();
        System.out.println("d1 = " + d1);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String str1 = sdf.format(d1);
        System.out.println(str1);
        Date d2 = null;
        try {
            d2 = sdf.parse(str1);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println("d2 = " + d2);
    }
}
