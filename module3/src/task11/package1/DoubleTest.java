package task11.package1;

public class DoubleTest {
    public static void main(String[] args) {
        Double db1 = Double.valueOf(3.14);
        System.out.println("db1 = " + db1);

        double d1 = db1.doubleValue();
        System.out.println("d1 = " + d1);

        Double db2 = Double.valueOf("3.121");
        System.out.println("db2 = " + db2);

        System.out.println(0 / 0.0);
//        System.out.println(0 / 0);
        System.out.println("--------------------------------");
        Double db3 = 3.1444;
        double d2 = db3;
        System.out.println("db3 = " + db3);
        System.out.println("d2 = " + d2);
        System.out.println("----------------------------");
        try {
            double d3 = Double.parseDouble("13.1");
            System.out.println("d3 = " + d3);

            System.out.println(Double.valueOf(0/0.0).isNaN());

        }catch(Exception e) {

        }
    }
}
