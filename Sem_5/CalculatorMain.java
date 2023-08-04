public class CalculatorMain {
    public static void main(String[] args) {
        CalculatorModel model = new CalculatorModel();
        CalculatorView view = new CalculatorView();
        CalculatorController controller = new CalculatorController(model, view);

        String operation = view.getOperation();
        int num1 = view.getOperand();
        int num2 = view.getOperand();
        
        controller.performOperation(operation, num1, num2);
    }
}
