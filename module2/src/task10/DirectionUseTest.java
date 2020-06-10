package task10;

public class DirectionUseTest {
    public static void test1(String str) {
        switch(str) {
            case "向上":
                System.out.println("抬头望明月！");
                break;
                case "向下":
                System.out.println("低头思故乡！");
                break;
                case "向左":
                System.out.println("左青龙！");
                break;
                case "向右":
                System.out.println("右白虎！");
                break;
            default:
                System.out.println("没有这个方向！");

        }
    }

    public static void test2(DirectionEnum de) {
        switch(de) {
            case UP:
                System.out.println("抬头望明月！");
                break;
                case DOWN:
                System.out.println("低头思故乡！");
                break;
                case LEFT:
                System.out.println("左青龙！");
                break;
                case RIGHT:
                System.out.println("右白虎！");
                break;
            default:
                System.out.println("没有这个方向！");

        }
    }
    public static void main(String[] args) {
            test1(Direction.UP.getDesc());
            test2(DirectionEnum.DOWN);
            test2(DirectionEnum.RIGHT);
            test2(DirectionEnum.LEFT);
            test2(DirectionEnum.UP);
            DirectionEnum[] d = DirectionEnum.values();
        System.out.println(d[0]);
        System.out.println(d[1]);
        System.out.println(d[2]);
        System.out.println(d[3]);
        System.out.println(DirectionEnum.UP.toString());
        System.out.println(DirectionEnum.DOWN.ordinal());
        System.out.println(DirectionEnum.LEFT.ordinal());
        System.out.println(DirectionEnum.RIGHT.ordinal());
    }
}
