import com.lagou.client.ClientScanner;
import com.lagou.model.Student;
import jdk.swing.interop.SwingInterOpUtils;

import java.io.*;
import java.util.*;

public class MyTest {
    public MyTest() throws IOException {
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        Scanner input = new Scanner(System.in);
//        List<Student> list = new ArrayList<Student>();
//        for(int i = 0;i < 3;i++) {
//            System.out.println("请输入学生的姓名：");
//            String username = input.next();
//            System.out.println("请输入学生的学号：");
//            String studentNo = input.next();
//            System.out.println("请输入学生的密码：");
//            String password = input.next();
//            list.add(new Student(studentNo,username,password));
//
//        }
//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:\\拉勾网Java基础班资料\\javase项目文件集合\\studentlist.txt"));
//        oos.writeObject(list);]
//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:\\拉勾网Java基础班资料\\javase项目文件集合\\studentlist.txt"));
//        list.add(new Student("20181224","zhangsan","123"));
//        list.add(new Student("20181225","lisi","1234"));
//        list.add(new Student("20181226","wangwu","12345"));
//        oos.writeObject(list);
//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:\\拉勾网Java基础班资料\\javase项目文件集合\\考试试卷\\java.txt"));
//        Map<Integer,String> map = new HashMap<>();
//        map.put(1," JAVA所定义的版本中不包括：（）\n" +
//                "A、 JAVA2 EE\n" +
//                "B、 JAVA2 Card\n" +
//                "C、 JAVA2 ME\n" +
//                "D、 JAVA2 HE\n" +
//                "E、 JAVA2 SE");
//        map.put(2,"Java中，在如下所示的Test类中，共有（）个构造方法。\n" +
//                "public class Test{\n" +
//                "private int x;\n" +
//                "public Test(){\n" +
//                "x=35;\n" +
//                "}\n" +
//                "public void Test(double f){\n" +
//                "This.x=(int)f;\n" +
//                "}\n" +
//                "public Test(String s){}\n" +
//                "}\n" +
//                "A、 0\n" +
//                "B、  1\n" +
//                "C、  2\n" +
//                "D、 3");
//
//        map.put(3,"下列说法正确的是（）\n" +
//                "A、 JAVA程序的main方法必须写在类里面\n" +
//                "B、 JAVA程序中可以有多个main方法\n" +
//                "C、 JAVA程序中类名必须与文件名一样\n" +
//                "D、 JAVA程序的main方法中如果只有一条语句，可以不用{}(大括号)括起来");
//
//        map.put(4,"变量命名规范说法正确的是（）\n" +
//                "A、 变量由字母、下划线、数字、$符号随意组成；\n" +
//                "B、 变量不能以数字作为开头；\n" +
//                "C、 A和a在java中是同一个变量；\n" +
//                "D、 不同类型的变量，可以起相同的名字；");
//
//        map.put(5,"下列javaDoc注释正确的是（）\n" +
//                "A、 /*我爱北京天安门*/\n" +
//                "B、 //我爱北京天安门*/\n" +
//                "C、 /**我爱北京天安门*/\n" +
//                "D、 /*我爱北京天安门**/");
//
//        map.put(6,"为一个boolean类型变量赋值时，可以使用()方式\n" +
//                "A、 boolean = 1;\n" +
//                "B、 boolean a = (9 >= 10);\n" +
//                "C、 boolean a=\"真\";\n" +
//                "D、 boolean a = = false;");
//
//        map.put(7,"以下()不是合法的标识符\n" +
//                "A、 STRING\n" +
//                "B、 x3x;\n" +
//                "C、 void\n" +
//                "D、 de$f");
//
//        map.put(8,"表达式(11+3*8)/4%3的值是()\n" +
//                "A、 31\n" +
//                "B、 0\n" +
//                "C、 1\n" +
//                "D、 2");
//
//        map.put(9,"（）表达式不可以作为循环条件\n" +
//                "A、 i++;\n" +
//                "B、 i>5;\n" +
//                "C、 bEqual = str.equals(\"q\");\n" +
//                "D、 count = = i;");
//
//        map.put(10,"以下程序的运行结果是：()\n" +
//                "public class Increment{\n" +
//                "public static void main(String args[]) {\n" +
//                "int a;\n" +
//                "a = 6;\n" +
//                "System.out.print(a);\n" +
//                "System.out.print(a++);\n" +
//                "System.out.print(a);\n" +
//                "}\n" +
//                "}\n" +
//                "A. 666\n" +
//                "B. 667\n" +
//                "C. 677\n" +
//                "D. 676");
//
//        map.put(11,"下列说法正确的是（）\n" +
//                "A、 JAVA程序的main方法必须写在类里面\n" +
//                "B、 JAVA程序中可以有多个main方法\n" +
//                "C、 JAVA程序中类名必须与文件名一样\n" +
//                "D、 JAVA程序的main方法中如果只有一条语句，可以不用{}(大括号)括起来");
//
//        map.put(12,"下列值不为true的表达式有（）。\n" +
//                "A、 \"john\" = = \"john\"\n" +
//                "B、 \"john\".equals(\"john\")\n" +
//                "C、 \"john\" = \"john\"\n" +
//                "D、 \"john\".equals(new String(\"john\"))");
//
//        map.put(13,"下列输出结果是（）\n" +
//                "int  a = 0 ;\n" +
//                "while ( a < 5 ) {\n" +
//                "    switch(a){\n" +
//                "    case 0:\n" +
//                "    case 3 : a = a + 2;\n" +
//                "    case 1 :\n" +
//                "    case 2 : a = a + 3;\n" +
//                "    default : a = a + 5;\n" +
//                "    }\n" +
//                "}\n" +
//                "System.out.print ( a ) ;\n" +
//                "A、 0 \n" +
//                "B、 5\n" +
//                "C、 10\n" +
//                "D、 其他");
//
//        map.put(14,"下列代码输出结果是()\n" +
//                "int i = 10;\n" +
//                "while ( i > 0 ){\n" +
//                "  i = i + 1;\n" +
//                "  if ( i = =10 ){\n" +
//                "   break;\n" +
//                "  }\n" +
//                "}\n" +
//                "A. while循环执行10次\n" +
//                "B. 死循环\n" +
//                "C. 循环一次都不执行\n" +
//                "D. 循环执行一次");
//
//        map.put(15,"下面有关for循环的描述正确的是（）\n" +
//                "A、 for循环体语句中，可以包含多条语句，但要用大括号括起来\n" +
//                "B、 for循环只能用于循环次数已经确定的情况\n" +
//                "C、 在for循环中，不能使用break语句跳出循环\n" +
//                "D、 for循环是先执行循环体语句，后进行条件判断");
//
//            oos.writeObject(map);
//            oos.close();
//
//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:\\拉勾网Java基础班资料\\javase项目文件集合\\考试试卷\\c++.txt"));
//        Map<Integer,String> map = new HashMap<>();
//        map.put(1,"一个可运行的C＋＋源程序( )。\n" +
//                "A. 由一个或多个主函数构成\n" +
//                "B. 由一个且仅由一个主函数和零个以上（含零个）的子函数构成\n" +
//                "C. 仅由一个主函数构成\n" +
//                "D. 由一个且只有一个主函数和多个子函数构成");
//        map.put(2,"C＋＋程序的三种基本结构是( )。\n" +
//                "A．顺序结构、选择结构、循环结构 \n" +
//                "B．递归结构、循环结构、转移结构\n" +
//                "C．嵌套结构、递归结构、顺序结构 \n" +
//                "D．循环结构、转移结构、顺序结构");
//
//        map.put(3,"以下不属于字符型常量的是（ ）。\n" +
//                "A． ‘$’ \n" +
//                "B．’+’ \n" +
//                "C． ‘x2A’ \n" +
//                "D． “B”");
//
//        map.put(4,"下列变量定义中, 错误的是( )。\n" +
//                "A．int if; \n" +
//                "B．int a,A; \n" +
//                "C．char a=’’; \n" +
//                "D．float x=-3.33333;");
//
//        map.put(5,"已知：char a ; float b ; double c ; 则执行语句：c = a + b + c; 后变量c的类型为( )。\n" +
//                "A．char \n" +
//                "B．int \n" +
//                "C．float \n" +
//                "D．double");
//
//        map.put(6,"设已有说明语句“in a=5;”，则执行语句“a+=a*=a%=3;”后，a的值为 ( ) 。\n" +
//                "A．8 \n" +
//                "B．18 \n" +
//                "C．0 \n" +
//                "D．2");
//
//        map.put(7,"对数组名作函数的参数，下面描述正确的是（　）。\n" +
//                "A．数组名作函数的参数，调用时将实参数组复制给形参数组\n" +
//                "B．数组名作函数的参数，主调函数和被调函数共用一段存储单元\n" +
//                "C．数组名作参数时，形参定义的数组长度不能省略\n" +
//                "D．数组名作参数，不能改变主调函数中的数据");
//
//        map.put(8,"给出下面定义：\n" +
//                "char a[]=”abcd”;\n" +
//                "char b[]={‘a’,’b’,’c’,’d’};\n" +
//                "则下列说法正确的是（ ）。\n" +
//                "A. 数组a与数组b等价 \n" +
//                "B. 数组a和数组b的长度相同\n" +
//                "C. 数组a的长度大于数组b的长度 \n" +
//                "D. 数组a的长度小于数组b的长度");
//
//        map.put(9,"（设已定义i和k为int类型变量，则以下for循环语句( )。\n" +
//                "for ( i =0; i!=0; i++ )\n" +
//                "cout<< \" * * * * n \";\n" +
//                "A．判断循环结束的条件不合法 \n" +
//                "B．是无限循环\n" +
//                "C．循环一次也不执行 \n" +
//                "D．循环只执行一次");
//
//        map.put(10,"执行以下程序段后, 输出的结果为 。 \n" +
//                "int a=4,b=5,t=0;\n" +
//                "if(a>b) t=a;a=b;b=t; \n" +
//                "cout<<”a=”<<a<<”,b=”<<b<<endl;\n" +
//                "A．a=5,b=4 \n" +
//                "B．a=4,b=5 \n" +
//                "C．a=5,b=0 \n" +
//                "D．语法错误");
//
//        map.put(11,"执行以下程序段后，m的值为 ( )。\n" +
//                "int a[2][3]={{1,2,3},{4,5,6}};\n" +
//                "int m,*p=&a[0][0];\n" +
//                "m=(*p)*(*(p+2))*(*(p+4));\n" +
//                "A．15 \n" +
//                "B．14 \n" +
//                "C．13 \n" +
//                "D．12");
//
//        map.put(12,"在参数传递过程中，对形参和实参的要求是（ ）。\n" +
//                "A．函数定义时，形参一直占用存储空间 \n" +
//                "B．实参可以是常量、变量或表达式\n" +
//                "C．形参可以是常量、变量或表达式 \n" +
//                "D．形参和实参类型和个数都可以不同");
//
//        map.put(13,"在C++中使用流进行输入输出，其中用于屏幕输出的对象是( )。\n" +
//                "A. cerr \n" +
//                "B. cin \n" +
//                "C. cout \n" +
//                "D. cfile");
//
//        map.put(14,"假定AA为一个类，a为该类公有的数据成员，x为该类的一个对象，则访问x对象中数据成员a的格式为（ ）\n" +
//                "A. x(a) \n" +
//                "B. x[a] \n" +
//                "C. x->a \n" +
//                "D. x.a");
//
//        map.put(15,"一个类的友元函数可以访问类的( )成员。\n" +
//                "A. 私有成员 \n" +
//                "B. 保护 \n" +
//                "C. 公有 \n" +
//                "D. 以上都正确");
//
//        oos.writeObject(map);
//        oos.close();

//        File[] files = new File("D:\\拉勾网Java基础班资料\\javase项目文件集合\\考试试卷").listFiles();
//        for(File f : files) {
//            System.out.println(f.getName());
//            String[] strs = f.getName().split("\\.");
//            System.out.println(strs.length);
//            System.out.println(strs[0]);
//
//        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\拉勾网Java基础班资料\\javase项目文件集合\\已提交的考试试卷\\20181224的java答卷.txt"));
//        HashMap<Integer,String> map = (HashMap<Integer, String>) ois.readObject();
//        System.out.println(map.size());
//
//        System.out.println(map);
//        System.out.println("123");
//        Set<Integer> integers = map.keySet();
//        for(int i = 0;i < integers.size();i++) {
//            if(i == 12) {
//                map.remove(i);
//            }
//        }
//        System.out.println(map);
//        System.out.println("123122");
//        System.out.println(map.size() );
//        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\拉勾网Java基础班资料\\javase项目文件集合\\studentlist.txt"));
//        List<Student> list = (List<Student>) ois.readObject();
//        for(Student stu : list){
//            if(stu.getStudentNo().equals("20181224")) {
//                stu.setGradeMap(new HashMap<>());
//                ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:\\拉勾网Java基础班资料\\javase项目文件集合\\studentlist.txt"));
//                oos.writeObject(list);
//            }
//        }
//        String str = "20181224的java答卷.txt";
//        String[] strs = str.split("的");
//        System.out.println("1 " + strs[0]);
//        System.out.println("2 " +strs[1]);
//        String strs1 = strs[1].replaceAll("答卷.txt","");
//        System.out.println(strs1);
//        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\拉勾网Java基础班资料\\javase项目文件集合\\考试试卷\\java.txt" ));
//        HashMap<Integer, String> map = (HashMap<Integer, String>) ois.readObject();
//        Set<Integer> integers = map.keySet();
//        for(int i : integers) {
//            System.out.println(i + map.get(i));
//        }

//        String str1 = null;
//        System.out.println("请输入i:");
//
//        int i = ClientScanner.getScanner().nextInt();
//        System.out.println("请输入str:");
//
//        String str = ClientScanner.getScanner().nextLine();
//        System.out.println(i);
//        System.out.println(str);
//        System.out.println(str1);
//       ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\拉勾网Java基础班资料\\javase项目文件集合\\studentlist.txt"));
//       List<Student> list = (List<Student>) ois.readObject();
////        System.out.println(list);
//        File[] fs = new File("../src/javase项目文件集合").listFiles();
//        System.out.println(fs.length);

//    src/javase项目文件集合
//    E:\JAVAIDEA\拉勾网Java基础班\module5\homework\ExamSystemClient\src\javase项目文件集合


//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:\\拉勾网Java基础班资料\\javase项目文件集合\\待上传的考试试卷\\C语言.txt"));
//        Map<Integer, String> map = new HashMap<>();
//        map.put(1, "（  ）是构成C语言程序的基本单位。\n" +
//                "A、函数        B、过程       C、子程序    D、子例程");
//        map.put(2, "以下选项中说法不正确的是（）\n" +
//                "A.． C语言是静态语言，Python语言是脚本语言\n" +
//                "B.．编译是将源代码转换成目标代码的过程\n" +
//                "C.．解释是将源代码逐条转换成目标代码同时逐条运行目标代码的过程\n" +
//                "D.．静态语言采用解释方式执行，脚本语言采用编译方式执行");
//
//        map.put(3, "C语言程序从（）开始执行。\n" +
//                " A) 程序中第一条可执行语句     B) 程序中第一个函数\n" +
//                "   C) 程序中的main函数          D) 包含文件中的第一个函数");
//
//        map.put(4, "以下说法中正确的是（   ）。\n" +
//                "\n" +
//                "   A、C语言程序总是从第一个定义的函数开始执行\n" +
//                "\n" +
//                "   B、在C语言程序中，要调用的函数必须在main( )函数中定义\n" +
//                "\n" +
//                "   C、C语言程序总是从main( )函数开始执行\n" +
//                "\n" +
//                "   D、C语言程序中的main( )函数必须放在程序的开始部分\n" +
//                "————————————————\n");
//
//        map.put(5, "下列关于C语言的说法错误的是（  ）。\n" +
//                "A) C程序的工作过程是编辑、编译、连接、运行 \n" +
//                "B) C语言不区分大小写。\n" +
//                "C) C程序的三种基本结构是顺序、选择、循环 \n" +
//                "D) C程序从main函数开始执行");
//
//        map.put(6, "以下选项不属于程序设计语言类别的是（）：\n" +
//                "A.．机器语言\n" +
//                "B.．汇编语言\n" +
//                "C.．高级语言\n" +
//                "D.．解释语言");
//
//        map.put(7, "每个程序都具有的统一的运算模式是（）：\n" +
//                "A.．顺序计算模式\n" +
//                "B.．输入输出模式\n" +
//                "C.．函数调用模式\n" +
//                "D.．IPO 模式");
//
//        map.put(8, "下列正确的标识符是（）。\n" +
//                "A.-a1             B.a[i]          C.a2_i          D.int t");
//
//        map.put(9, "列四组选项中，正确的C语言标识符是（   ）。\n" +
//                "A）  %x           B）   a+b       C）  a123          D） 123");
//
//        map.put(10, "C语言中的简单数据类型包括（  ）。\n" +
//                "   A、整型、实型、逻辑型        B、整型、实型、逻辑型、字符型\n" +
//                "   C、整型、字符型、逻辑型      D、整型、实型、字符型");
//
//        map.put(11, "以下选项，不属于程序流程图基本元素的是：\n" +
//                "A.．循环框\n" +
//                "B.．连接点\n" +
//                "C.．判断框\n" +
//                "D.．起始框");
//
//        map.put(12, "如果int a=3,b=4；则条件表达式\"a<b? a:b\"的值是（）。");
//
//        map.put(13, "若int x=2,y=3,z=4 则表达式x<z?y:z的结果是( ).\n" +
//                "     A)4   B)3    C)2    D)0  E)1");
//
//        map.put(14, "C语言中，关系表达式和逻辑表达式的值是（  ）    。\n" +
//                "A) 0         B) 0或1        C) 1       D) ‘T’或’F’");
//
//        map.put(15, "下面(  )表达式的值为4.\n" +
//                "     A)  11/3            B)  11.0/3\n" +
//                "     C)  (float)11/3    D)  (int)(11.0/3+0.5)");
//
//        oos.writeObject(map);
//        oos.close();
//        closeFile f = new File("D:\\拉勾网Java基础班资料\\javase项目文件集合\\待上传的考试试卷\\c语言.txt");
//        System.out.println(f.getAbsolutePath());
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\拉勾网Java基础班资料\\javase项目文件集合\\studentlist.txt"));
        List<Student> list = (List<Student>) ois.readObject();
        for(Student s : list) {
            System.out.println(s);
        }

    }
}