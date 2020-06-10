package package1;

public abstract class AbstractCalculator {
    public abstract int calculate(int ia,int ib);

    public int splitExpression(String exp,String op) {
        String[] arr = exp.split(op);
        int ia = Integer.valueOf(arr[0]);
        int ib = Integer.valueOf(arr[1]);
        return calculate(ia,ib);

    }
}
