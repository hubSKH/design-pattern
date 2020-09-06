package strategy;

/**
 * @Description
 * @auther SHENKAIHUAN
 * @create 2020-09-06 22:56
 */
public class Division implements Strategy{
    @Override
    public int doOperation(int num1, int num2) {
        return num1/num2;
    }
}
