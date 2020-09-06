package strategy;

/**
 * @Description
 * @auther SHENKAIHUAN
 * @create 2020-09-06 23:00
 */
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public int executeStrategy(int num1, int num2){
        return strategy.doOperation(num1, num2);
    }

}
