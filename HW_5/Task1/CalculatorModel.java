public class CalculatorModel {
    private Number result;

    public void add(Number  num1, Number  num2) {
        result = num1.doubleValue() + num2.doubleValue();
    }

    public void subtact(Number  num1, Number  num2) {
        result = num1.doubleValue() - num2.doubleValue();
    }

    public void divide(Number num1, Number num2) {
        if (num2.doubleValue() != 0) {
            result = num1.doubleValue() / num2.doubleValue();
        } else {
// Обработка деления на ноль
            throw new IllegalArgumentException("На ноль делить нельзя!");
        }
    }

     public void multiply (Number  num1, Number  num2) {
        result = num1.doubleValue() * num2.doubleValue();
    }

    public Number getResult() {
        return result;
    }
}
