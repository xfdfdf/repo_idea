package homework;


import java.util.Scanner;

//作业5
public class Work1 {
    //定义一个棋盘
    private static char[][] chessBoard  = null;

    //定义黑方的棋子
    private static char black_chess = '•';
    //定义白方的棋子
    private static char white_chess = '○';

    //定义当前下子的字符，使用char数组来接收
    private static char[] arr = null;

    //定义当前下子的位置，使用int数组来接收
    private static int[] number = null;

    //下棋的顺序，true代表黑方下，false代表白方下
    private static boolean flag = true;

    //当四个方向有一方已经连成五子了，num就等于5，就代表胜利了，
    private static int num = 0;

    public static void main(String[] args) {

        Work1 w = new Work1();
        //初始化棋盘，将结果赋值给二维数组
        chessBoard = w.initChessBoard();

        Scanner input = new Scanner(System.in);
        while(!victory()) {
            //打印棋盘
            w.printChessBoard(chessBoard);
            if(flag) {
                System.out.print("请黑方下棋，格式为：2,a 或者 a,f :");
                String str = input.nextLine();
                arr = splitStr(str);
                if(isFlag(arr)) {
                    number = getNumber(arr);
                    if(chessBoard[number[0] + 1][number[1] + 1] != '•' && chessBoard[number[0] + 1][number[1] + 1] != '○') {
                        chessBoard[number[0] + 1][number[1] + 1] = '•';
                    } else {
                        System.out.println("该地方不能落子，请重新输入");
                        continue;
                    }
                } else {
                    System.out.println("您输入的不符合要求，请重新输入！");
                    continue;
                }
                flag = !flag;
            } else {
                System.out.print("请白方下棋，格式为：2,a 或者 a,f :");
                String str = input.nextLine();
                arr = splitStr(str);
                if(isFlag(arr)) {
                    number = getNumber(arr);
                    if(chessBoard[number[0] + 1][number[1] + 1] != '•' && chessBoard[number[0] + 1][number[1] + 1] != '○') {
                        chessBoard[number[0] + 1][number[1] + 1] = '○';
                    } else {
                        System.out.println("该地方不能落子，请重新输入");
                        continue;
                    }
                } else {
                    System.out.println("您输入的不符合要求，请重新输入！");
                    continue;
                }
                flag = !flag;
            }
            printChessBoard(chessBoard);
        }



    }


    //初始化棋盘界面的方法
    public char[][] initChessBoard() {
        //定义一个数组,存放第一行的字符
        char[] number = new char[17];
        number[0] = ' ';
        for (int i = 1; i < number.length; i++) {
            if (i <= 10) {
                number[i] = (char) (48 + i - 1);

            } else {
                number[i] = (char) ('a' + i - 11);
            }
        }



        //定义五子棋的棋盘
        char[][] char1 = new char[17][17];
        //给数组的元素赋值
        for (int i = 0; i < char1.length; i++) {
            for (int j = 0; j < char1[i].length; j++) {
                if (i == 0) {
                    char1[i][j] = number[j];
                } else {

                    if (i != 0 && j == 0) {
                        char1[i][j] = number[i];

                    } else {
                        char1[i][j] = '+';
                    }

                }
            }
        }


        return char1;
    }

    //打印棋盘界面的方法
   public static void printChessBoard(char[][] chessBoard) {
        for(int i = 0;i < chessBoard.length;i++) {
            for(int j = 0;j < chessBoard[i].length;j++) {
                System.out.print(chessBoard[i][j] + " ");
            }
            System.out.println();
        }
   }

    //将用户输入的数据进行拆分并且返回横纵坐标
    public static char[] splitStr(String str) {

        char[] arr = new char[2];
        String[] split = str.split(",");
        if(split.length != 2) {

        } else {
            if(split[0].trim().length() == 1 && split[1].trim().length() == 1) {
                arr[0] = split[0].trim().charAt(0);
                arr[1] = split[1].trim().charAt(0);
            } else {
                System.out.println("输入错误，请重新输入");

            }

        }

        return arr;
    }

    //判断横纵坐标是否符合规则
    public static boolean isFlag(char[] arr) {
        char x = arr[0];
        char y = arr[1];
        if((x >='0' && x <= '9') || (x >='a' && x <= 'f')) {

        } else {
           return  false;
        }
        if((y >='0' && y <= '9') || (y >='a' && y <= 'f')) {

        } else {
            return  false;
        }
        return true;
    }

    //将字符类型的横纵坐标转换为数字
    public static int[] getNumber(char[] arr) {
        int[] number = new int[2];
        if(arr[0] >= '0' && arr[0] <= '9') {
            number[0] = arr[0] - 48;
        } else {
            number[0] = arr[0] - 87;

        }
        if(arr[1] >= '0' && arr[1] <= '9') {
            number[1] = arr[1] - 48;
        } else {
            number[1] = arr[1] - 87;

        }
        return number;
    }

    //判断是否胜利
    public static boolean victory() {
        //水平方向遍历黑方棋手
        for(int i = 1;i < chessBoard.length;i++) {
                for(int j = 1;j < chessBoard[i].length;j++) {
                    if(chessBoard[i][j] == '•') {
                        num++;
                        if(num == 5){
                            System.out.println("黑方胜利了，游戏结束了");
                            return true;
                        }

                    } else {
                        num = 0;
                    }
                }
            }

        //垂直方向遍历黑方棋手
        for(int i = 1;i < chessBoard.length;i++) {
            for(int j = 1;j < chessBoard[i].length;j++) {
                if(chessBoard[j][i] == '•') {
                    num++;
                    if(num == 5){
                        System.out.println("黑方胜利了，游戏结束了");
                        return true;
                    }

                } else {
                    num = 0;
                }
            }
        }

        //  \方向遍历黑方棋手
        for(int i = 1;i < chessBoard.length ;i++) {
            for (int j = 1; j < chessBoard[i].length; j++) {
                int x = i;
                int y = j;
                while ((x >= 1 && x <= 16) && (y >= 1 && y <= 16)) {


                    if (chessBoard[x][y] == '•') {
                        num++;
                        if (num == 5) {
                            System.out.println("黑方胜利了，游戏结束了");
                            return true;
                        }

                    } else {
                        num = 0;
                        break;
                    }
                   x++;
                    y++;

                }

            }
        }
      //  /方向遍历黑方棋手
        for(int i = 1;i < chessBoard.length ;i++) {
            for (int j = 1; j < chessBoard[i].length; j++) {
                int x = i;
                int y = j;
                while ((x >= 1 && x <= 16) && (y >= 1 && y <= 16)) {


                    if (chessBoard[x][y] == '•') {
                        num++;
                        if (num == 5) {
                            System.out.println("黑方胜利了，游戏结束了");
                            return true;
                        }

                    } else {
                        num = 0;
                        break;
                    }
                    x++;
                    y--;

                }

            }
        }


        //水平方向遍历白方棋手
        for(int i = 1;i < chessBoard.length;i++) {
                for(int j = 1;j < chessBoard[i].length;j++) {
                    if(chessBoard[i][j] == '○') {
                        num++;
                        if(num == 5){
                            System.out.println("白方胜利了，游戏结束了");
                            return true;
                        }

                    } else {
                        num = 0;
                    }
                }
            }

        //垂直方向遍历白方棋手
        for(int i = 1;i < chessBoard.length;i++) {
            for(int j = 1;j < chessBoard[i].length;j++) {
                if(chessBoard[j][i] == '○') {
                    num++;
                    if(num == 5){
                        System.out.println("白方胜利了，游戏结束了");
                        return true;
                    }

                } else {
                    num = 0;
                }
            }
        }


        //  \方向遍历白方棋手
        for(int i = 1;i < chessBoard.length ;i++) {
            for (int j = 1; j < chessBoard[i].length; j++) {
                int x = i;
                int y = j;
                while ((x >= 1 && x <= 16) && (y >= 1 && y <= 16)) {


                    if (chessBoard[x][y] == '○') {
                        num++;
                        if (num == 5) {
                            System.out.println("白方胜利了，游戏结束了");
                            return true;
                        }

                    } else {
                        num = 0;
                        break;
                    }
                    x++;
                    y++;

                }

            }
        }
        //  /方向遍历白方棋手
        for(int i = 1;i < chessBoard.length ;i++) {
            for (int j = 1; j < chessBoard[i].length; j++) {
                int x = i;
                int y = j;
                while ((x >= 1 && x <= 16) && (y >= 1 && y <= 16)) {

                    if (chessBoard[x][y] == '○') {
                        num++;
                        if (num == 5) {
                            System.out.println("白方胜利了，游戏结束了");
                            return true;
                        }

                    } else {
                        num = 0;
                        break;
                    }
                    x++;
                    y--;

                }

            }
        }

        return false;
    }

}