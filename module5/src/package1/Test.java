package package1;

public class Test {
    public static void main(String[] args) {
        AbstractCalculator abstractCalculator = new Plus();
        AbstractCalculator abstractCalculator1 = new Minus();
        int result = abstractCalculator.splitExpression("11+2","\\+");
        System.out.println(result);

        result = abstractCalculator1.splitExpression("123131-111","-");
        System.out.println(result);
    }
}
