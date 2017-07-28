/**
 * Created by andriy on 26.07.17.
 */
public class Calculator {

    public double add(double val1, double val2){
        return val1 + val2;
    }

    public double substract(double val1, double val2){
        return val1 - val2;
    }

    public double multiplication(double val1, double val2){
        return val1 * val2;
    }
    public double division(double val1, double val2){
        return val1 / val2;
    }

    public boolean isPositive(double val){
        return val >= 0 ? true : false;
    }

    public Object isNotNull(Object o) {
        return o;
    }

    public String convertFromDecimalToOctal(int a) {
        return Integer.toOctalString(a);
    }
}
