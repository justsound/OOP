package Task_3;

public class Main {
    public static void main(String[] args) {
        MaxValue<Integer> intValue = new MaxValue<>();
        System.out.println("Максимальное целое число: " + intValue.
                getMax(1, 10));

        MaxValue<Double> doubleValue = new MaxValue<>();
        System.out.println("Максимальное дробное число: " +
                doubleValue.getMax(2.22, 3.33));

        MaxValue<String> stringValue = new MaxValue<>();
        System.out.println("Максимальная строка: " + stringValue.
                getMax("ABC", "CBA"));
    }
}
