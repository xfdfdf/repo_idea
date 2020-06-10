package task10;

public class DirectionEnumTest {
    public static void main(String[] args) {
        DirectionEnum DOWN = DirectionEnum.DOWN;

        //DirectionEnum UP = DirectionEnum.UP;
        //DirectionEnum LEFT = DirectionEnum.LEFT;
        //DirectionEnum RIGHT = DirectionEnum.RIGHT;
        //System.out.println(DOWN);
        //System.out.println(UP);
        //System.out.println(LEFT);
        //System.out.println(RIGHT);
        //
        //System.out.println(DOWN.getDesc());
        //System.out.println(UP.getDesc());
        //System.out.println(LEFT.getDesc());
        //System.out.println(RIGHT.getDesc());

        DirectionEnum[] ds = DirectionEnum.values();
        for(DirectionEnum d : ds) {
            System.out.println(d + "---->>" + d.getDesc() + "对应的索引位置是 " + d.ordinal());
            d.show();
        }

      //show  DirectionEnum UP = DirectionEnum.valueOf("UP");
      //  DirectionEnum LEFT = DirectionEnum.valueOf("LEFT");
      //  DirectionEnum RIGHT = DirectionEnum.valueOf("RIGHT");
      //  System.out.println(UP);
      //  System.out.println(UP.toString());
      //  System.out.println(LEFT);
      //  System.out.println(LEFT.toString());
      //  System.out.println(UP.compareTo(LEFT));
      //  System.out.println(RIGHT.compareTo(LEFT));
    }
}
