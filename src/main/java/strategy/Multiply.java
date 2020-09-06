package strategy;

/**
 * @Description
 * @auther SHENKAIHUAN
 * @create 2020-09-06 22:55
 */
public class Multiply implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1*num2;
    }
}
