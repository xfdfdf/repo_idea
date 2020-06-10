package task11.homework.work4;

/**
 * 管理员使用界面
 */
public class StudentManage {
//    定义一个视图对象
    private static ViewMain viewMain;
    public static void main(String[] args) {

//        初始化视图对象
        viewMain = new ViewMain();
//        调用主界面的方法
        viewMain.Main();
    }
}
