package task10;

public enum DirectionEnum implements AnonymousInterface{
    UP("向上"){
        @Override
        public void show() {
            System.out.println("向上");
        }
    },
    DOWN("向下"){
        @Override
        public void show() {
            System.out.println("向下");

        }
    },
    LEFT("向左"){
        @Override
        public void show() {
            System.out.println("向左边");

        }
    },
    RIGHT("向右"){
        @Override
        public void show() {
            System.out.println("向右边");

        }
    },;

    private final String desc;



    private DirectionEnum(String desc) {

        this.desc = desc;
    }

    public String getDesc() {

        return this.desc;
    }

    //整个枚举类型只重写一次，所有的对象调用一个
    //@Override
    //public void show() {
    //    System.out.println("接口的方法DIRECTIONeNMU");
    //}
}
