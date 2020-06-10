package task10;

//@ManTypes({@ManType(value = "职工"),@ManType(value = "超人")})
@ManType(value="as")
@ManType(value="aas")
public class Man {

    @Deprecated
    public void show() {
        System.out.println("这个方法快过时了");
    }

    public static void main(String[] args) {
        int ia = 97;
        char c1 = (@ManType char)ia;
    }
}
