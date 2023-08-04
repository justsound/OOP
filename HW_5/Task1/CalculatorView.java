import java.util.Scanner;

public class CalculatorView {
    private Scanner scanner;

    public CalculatorView(){
        scanner = new Scanner(System.in);
    }

    public void displayResult(Number result) {
        System.out.println("Результ " + result);
    }

    public String getOperation() {
        System.out.println("Введите операцию (+, -, /, *): ");
        return scanner.nextLine();
    }

       public Double getOperand() {
        System.out.println("Введите число: ");
        return Double.parseDouble(scanner.nextLine());
    }
}