import task10.Hunter;
import task10.Runner;

public class Man implements Hunter {
    @Override
    public void hunter() {
        System.out.println("打猎了");
    }

    @Override
    public void run() {
        System.out.println("动物跑了");
    }

    public static void main(String[] args) {
        Hunter h1 = new Man();
        Runner h2 = new Man();
        h1.hunter();
        h1.run();
        h2.run();
    }
}
