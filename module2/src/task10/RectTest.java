package task10;

public class RectTest {
    public static void main(String[] args) {
        Rect rect = new Circle();
        Rect rect1 = new Rect();
        Square s = new Square();

        if(rect instanceof Square) {
            Square s1 = (Square) rect;
            System.out.println("转换成功");

        } else {
            System.out.println("强转有风险，遇事需谨慎");
        }
    }
}
