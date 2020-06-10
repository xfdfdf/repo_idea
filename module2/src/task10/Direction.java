package task10;

public class Direction {
    private String desc;

    public static Direction UP =  new Direction("向上");
    public static Direction DOWN = new Direction("向下");
    public static Direction LEFT = new Direction("向左");
    public static Direction RIGHT = new Direction("向右");

    private Direction(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return this.desc;
    }
}
